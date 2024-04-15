package tp3.exo1;

import org.example.tp2.exo2.Utilisateur;
import org.example.tp3.exo1.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceTest {
    @Mock
    private UserRepository userRepositoryMock;

    @Test
    public void testGetUserById() {
        // ID d'utilisateur à tester
        long userId = 1;

        // Crée un objet utilisateur simulé
        Utilisateur utilisateurSimule = new Utilisateur();
        utilisateurSimule.setId((int)userId);
        utilisateurSimule.setNom("Jean");
        utilisateurSimule.setPrenom("Dupont");

        // Configuration du mock pour renvoyer l'utilisateur simulé lorsque findUserById est appelé avec userId
        when(userRepositoryMock.findUserById(userId)).thenReturn(utilisateurSimule);

        // Crée une instance de UserService avec le mock de UserRepository
        UserService userService = new UserService(userRepositoryMock);

        // Appel de la méthode à tester
        Utilisateur utilisateur = userService.getUserById(userId);

        // Vérification de l'appel de findUserById sur le mock avec le bon argument
        verify(userRepositoryMock).findUserById(userId);

        // Vérification que l'utilisateur retourné correspond à l'utilisateur simulé
        assertEquals(utilisateurSimule, utilisateur);
    }
}
