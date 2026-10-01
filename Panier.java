package tp1ex4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yoanm
 */
public class Panier {
    // Ajout du type générique 
    private List<Produit> produits;

    // Constructeur principal
    public Panier(List produits) {
        this.produits = produits;
    }

    // Constructeur par défaut (initialise une liste vide)
    public Panier() {
        this.produits = new ArrayList<>();
    }

    // Getter et Setter
    public List getProduits() {
        return produits;
    }

    public void setProduits(List produits) {
        this.produits = produits;
    }

    // Méthode pour ajouter un produit au panier
    public void ajouterProduit(Produit produit) {
        this.produits.add(produit);
    }

    // Méthode pour supprimer un produit du panier
    public void supprimerProduit(Produit produit) {
        this.produits.remove(produit);
    }

    // Méthode pour afficher les produits dans le panier
    public void afficherPanier() {
        if (this.produits.isEmpty()) {
            System.out.println("Le panier est vide.");
        } else {
            System.out.println("--- Contenu du panier ---");
            for (Produit p : this.produits) {
                p.afficherDetails();
            }
        }
    }

    // Méthode pour calculer le montant total du panier
    public double calculerTotal() {
        double total = 0.0;
        for (Produit p : this.produits) {
            total += p.getPrix() * p.getQuantite();
        }
        return total;
    }
}