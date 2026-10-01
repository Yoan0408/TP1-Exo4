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
public class Magasin {
    private List<Produit> produits;

    // Constructeur principal avec une liste de produits
    public Magasin(List produits) {
        this.produits = produits;
    }

    // Constructeur par défaut (initialise une liste vide)
    public Magasin() {
        this.produits = new ArrayList<>();
    }

    // Getter et Setter
    public List getProduits() {
        return produits;
    }

    public void setProduits(List produits) {
        this.produits = produits;
    }

    // Méthode pour ajouter un produit au magasin
    public void ajouterProduit(Produit produit) {
        this.produits.add(produit);
    }

    // Méthode pour afficher les produits disponibles dans le magasin
    public void afficherProduitsDisponibles() {
        if (this.produits.isEmpty()) {
            System.out.println("Aucun produit disponible dans le magasin.");
        } else {
            System.out.println("=== Produits disponibles en magasin ===");
            for (Produit p : this.produits) {
                p.afficherDetails();
            }
        }
    }

    // Méthode pour trouver un produit par son nom (ignore la casse)
    public Produit trouverProduitParNom(String nom) {
        for (Produit p : this.produits) {
            if (p.getNom().equalsIgnoreCase(nom)) {
                return p;
            }
        }
        return null; // Retourne null si le produit n'est pas trouvé
    }
}
