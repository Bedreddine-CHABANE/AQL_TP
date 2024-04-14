package tp2.exo3;

import org.example.tp2.exo2.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class ScenarioTwo {
    @Mock
    private UtilisateurApi utilisateurApiMock;

    @Test
    public void testErreurDeValidation() throws ServiceException {
        // Création d'un nouvel utilisateur avec des données invalides
        Utilisateur utilisateur = new Utilisateur(null, "Dupont", "jeandupont@email.com");

        // Création du service avec le mock
        UserService userService = new UserService(utilisateurApiMock);

        // Appel de la méthode à tester avec des données invalides
        try {
            userService.creerUtilisateur(utilisateur);
        } catch (IllegalArgumentException e) {

        }

        // Vérification que la méthode `creerUtilisateur` de `UtilisateurApi` n'a jamais été appelée
        verify(utilisateurApiMock, never()).creerUtilisateur(utilisateur);
    }
}
