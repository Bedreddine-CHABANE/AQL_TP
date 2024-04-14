package org.example.tp2.exo2;

public interface UtilisateurApi {
    void creerUtilisateur(Utilisateur utilisateur) throws ServiceException;
    int getUtilisateurID();
    boolean creerUtilisateurTrueOrFalse(Utilisateur utilisateur) throws ServiceException;
}
