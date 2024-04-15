package org.example.tp3.exo2;

import java.util.Date;

public class Order {
    private long id; // Identifiant unique de la commande
    private String nom; // Nom du client
    private String details; // Détails de la commande
    private Date dateCommande; // Date de la commande

    // Constructeur vide
    public Order() {
    }

    // Constructeur avec tous les champs
    public Order(long id, String nom, String details, Date dateCommande) {
        this.id = id;
        this.nom = nom;
        this.details = details;
        this.dateCommande = dateCommande;
    }

    // Getters et setters pour les propriétés

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Date getDateCommande(Date date) {
        return dateCommande;
    }

    public void setDateCommande(Date dateCommande) {
        this.dateCommande = dateCommande;
    }

    // Méthode toString() pour faciliter le débogage ou l'impression de l'objet
    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", details='" + details + '\'' +
                ", dateCommande=" + dateCommande +
                '}';
    }

}
