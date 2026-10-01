/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp1ex4;

/**
 *
 * @author yoanm
 */
public class Produit {
    private int id;
    private String nom;
    private double prix;
    private int quantite;

    // Constructeur principal
    public Produit(int id, String nom, double prix, int quantite) {
        this.id = id;
        this.nom = nom;
        this.prix = prix;
        this.quantite = quantite;
    }

    // Constructeur sans prix ni quantité (valeurs par défaut)
    public Produit(int id, String nom) {
        this.id = id;
        this.nom = nom;
        this.prix = 0.0;
        this.quantite = 0;
    }

    // Constructeur par défaut
    public Produit() {
        this.id = 0;
        this.nom = "Inconnu";
        this.prix = 0.0;
        this.quantite = 0;
    }

    // Getters et Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    // Méthode pour afficher les détails du produit
    public void afficherDetails() {
        System.out.println("ID : " + this.id + " | Nom : " + this.nom + " | Prix : " + this.prix + " € | Quantité : " + this.quantite);
    }
}
