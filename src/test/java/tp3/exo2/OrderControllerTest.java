package tp3.exo2;

import org.example.tp3.exo2.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Date;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class OrderControllerTest {
    @Mock
    private OrderService orderServiceMock;

    @Mock
    private OrderDao orderDaoMock;

    @Test
    public void testCreateOrder() {
        // Crée un objet Order simulé
        Order order = new Order();
        order.setId(1);
        order.setNom("Commande Test");
        order.setDetails("some details");
        order.getDateCommande(new Date());

        // Crée une instance de OrderController avec le mock d'OrderService
        OrderController orderController = new OrderController(orderServiceMock);

        // Configuration du comportement d'OrderService pour appeler OrderDao.saveOrder(order)
        when(orderServiceMock.createOrder(order)).thenAnswer(invocation -> {
            Order ord = invocation.getArgument(0);
            orderDaoMock.saveOrder(ord);
            // Retournez une valeur de type Order ici, par exemple, l'objet ord que vous avez enregistré
            return ord; // Suppose que createOrder retourne l'ordre enregistré
        });



        // Appel de la méthode à tester
        orderController.createOrder(order);

        // Vérifiez que createOrder a été appelé sur OrderService avec le bon argument
        verify(orderServiceMock).createOrder(order);

        // Vérifiez que saveOrder a été appelé sur OrderDao avec l'objet Order fourni
        verify(orderDaoMock).saveOrder(order);
    }
}
