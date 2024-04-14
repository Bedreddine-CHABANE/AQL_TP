package org.example.tp2.exo2;

public class UserService{
    private final UtilisateurApi utilisateurApi;
    public UserService(UtilisateurApi utilisateurApi) {
        this.utilisateurApi = utilisateurApi;
    }
    public void creerUtilisateur(Utilisateur utilisateur) throws
            ServiceException {
        utilisateurApi.creerUtilisateur(utilisateur);
        int utilisateurID = utilisateurApi.getUtilisateurID();
        utilisateur.setId(utilisateurID);
    }
    public boolean creerUtilisateurTrueOrFalse(Utilisateur utilisateur) throws ServiceException {
        try {
            utilisateurApi.creerUtilisateur(utilisateur);
            return true;
        } catch (ServiceException e) {
            return false;
        }
    }
}
