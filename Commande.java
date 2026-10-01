/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp1ex4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yoanm
 */
public class Commande {
    private int idCommande;
    private Client client;
    private List<Produit> produitsCommandes;
    private double total;

    // Constructeur principal initialisant la commande à partir d'un client et des produits d'un panier
    public Commande(int idCommande, Client client, Panier panier) {
        this.idCommande = idCommande;
        this.client = client;
        // Copie de la liste des produits du panier
        this.produitsCommandes = new ArrayList<>(panier.getProduits());
        // Calcul automatique du total à partir du panier
        this.total = panier.calculerTotal();
    }

    // Constructeur sans ID spécifié
    public Commande(Client client, Panier panier) {
        this(1, client, panier);
    }

    // Constructeur par défaut
    public Commande() {
        this.idCommande = 0;
        this.client = new Client();
        this.produitsCommandes = new ArrayList<>();
        this.total = 0.0;
    }

    // Getters et Setters
    public int getIdCommande() {
        return idCommande;
    }

    public void setIdCommande(int idCommande) {
        this.idCommande = idCommande;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List getProduitsCommandes() {
        return produitsCommandes;
    }

    public void setProduitsCommandes(List produitsCommandes) {
        this.produitsCommandes = produitsCommandes;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    // Méthode pour afficher les informations sur la commande
    public void afficherDetailsCommande() {
        System.out.println("=== Commande N° " + this.idCommande + " ===");
        System.out.print("Client : ");
        if (this.client != null) {
            this.client.afficherDetails();
        }
        System.out.println("Produits commandés :");
        if (this.produitsCommandes.isEmpty()) {
            System.out.println("  Aucun produit dans la commande.");
        } else {
            for (Produit p : this.produitsCommandes) {
                System.out.print("  - ");
                p.afficherDetails();
            }
        }
        System.out.println("Total de la commande : " + this.total + " €");
        System.out.println("===========================");
    }
}
