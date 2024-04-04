package tp2.exo2;

import org.example.tp2.exo2.ServiceException;
import org.example.tp2.exo2.UserService;
import org.example.tp2.exo2.Utilisateur;
import org.example.tp2.exo2.UtilisateurApi;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceTest {
    @Mock
    private UtilisateurApi utilisateurApiMock;
    @Test
    public void testCreerUtilisateur() throws ServiceException {
        // Création d'un nouvel utilisateur
        Utilisateur utilisateur = new Utilisateur("Jean", "Dupont","jeandupont@email.com");
        // TODO : Configuration du comportement du mock, utiliser la
        //directive « when » avec sa méthode « thenReturn »
        doNothing().when(utilisateurApiMock).creerUtilisateur(utilisateur);
        // TODO : Création du service avec le mock
        UserService userService = new UserService(utilisateurApiMock);
        // TODO : Appel de la méthode à tester
        userService.creerUtilisateur(utilisateur);
        // TODO : Vérification de l'appel à l'API
        verify(utilisateurApiMock).creerUtilisateur(utilisateur);
    }
}
