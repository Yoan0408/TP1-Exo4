/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp1ex4;

/**
 *
 * @author yoanm
 */
public class Client {
    private int id;
    private String nom;
    private String email;

    // Constructeur principal
    public Client(int id, String nom, String email) {
        this.id = id;
        this.nom = nom;
        this.email = email;
    }

    // Constructeur sans email
    public Client(int id, String nom) {
        this.id = id;
        this.nom = nom;
        this.email = "non-renseigne@email.com";
    }

    // Constructeur par défaut
    public Client() {
        this.id = 0;
        this.nom = "Inconnu";
        this.email = "inconnu@email.com";
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Méthode pour afficher les informations du client
    public void afficherDetails() {
        System.out.println("ID : " + this.id + " | Nom : " + this.nom + " | Email : " + this.email);
    }
}
