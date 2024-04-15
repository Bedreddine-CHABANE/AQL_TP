package org.example.tp3.exo3;

public class Product {
    private String id; // Identifiant unique du produit
    private String name; // Nom du produit
    private double price; // Prix du produit

    // Constructeur vide
    public Product() {
    }

    // Constructeur avec tous les champs
    public Product(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Getters et setters pour les propriétés

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Méthode toString() pour faciliter le débogage ou l'impression de l'objet
    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

}
