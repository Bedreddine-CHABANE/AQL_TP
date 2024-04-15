package tp3.exo3;

import org.example.tp3.exo3.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class ProductServiceTest {
    @Mock
    private ProductApiClient productApiClientMock;

    @Test
    public void testGetProductSuccess() throws ApiException {
        // ID de produit à tester
        String productId = "123";

        // Crée un objet Product simulé
        Product productSimule = new Product();
        productSimule.setId(productId);
        productSimule.setName("Produit Test");
        productSimule.setPrice(100.0);

        // Configuration du mock pour retourner le produit simulé
        when(productApiClientMock.getProduct(productId)).thenReturn(productSimule);

        // Crée une instance de ProductService avec le mock de ProductApiClient
        ProductService productService = new ProductService(productApiClientMock);

        // Appel de la méthode à tester
        Product product = productService.getProduct(productId);

        // Vérification que getProduct a été appelé sur ProductApiClient avec le bon argument
        verify(productApiClientMock).getProduct(productId);

        // Vérification que le produit retourné est le produit simulé
        assertEquals(productSimule, product);
    }

    @Test(expected = ApiException.class)
    public void testGetProductApiException() throws ApiException {
        // ID de produit à tester
        String productId = "456";

        // Configuration du mock pour lever une exception d'API
        when(productApiClientMock.getProduct(productId)).thenThrow(new ApiException("Échec d'appel d'API"));

        // Crée une instance de ProductService avec le mock de ProductApiClient
        ProductService productService = new ProductService(productApiClientMock);

        // Appel de la méthode à tester, qui doit lever ApiException
        productService.getProduct(productId);
    }

    @Test
    public void testGetProductDataFormatError() throws ApiException {
        // ID de produit à tester
        String productId = "789";

        // Configuration du mock pour retourner un produit mal formé
        Product productSimule = new Product();
        productSimule.setId(productId);
        // Par exemple, laisser le nom vide et un prix invalide
        productSimule.setName(""); // Nom vide
        productSimule.setPrice(-10.0); // Prix négatif, ce qui est invalide

        when(productApiClientMock.getProduct(productId)).thenReturn(productSimule);

        // Crée une instance de ProductService avec le mock de ProductApiClient
        ProductService productService = new ProductService(productApiClientMock);

        // Appel de la méthode à tester
        Product product = productService.getProduct(productId);

        // Vérification que getProduct a été appelé sur ProductApiClient avec le bon argument
        verify(productApiClientMock).getProduct(productId);

        // Vérifications sur le produit retourné
        // Vérifiez si les propriétés sont mal formées
        assertNotNull(product); // Assure que le produit n'est pas null
        assertTrue("Le nom du produit devrait être vide", product.getName().isEmpty());
        assertTrue("Le prix du produit devrait être négatif", product.getPrice() < 0);

    }

}

