/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1ex4;

import java.util.Scanner;

/**
 *
 * @author yoanm
 */
public class Tp1Ex4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Création des clients, des produits 2et du magasin
        Client client = new Client(1, "Harry Potter", "harry.potter@hogwarts.edu");
        
        Produit p1 = new Produit(101, "Livre Java", 29.99, 1);
        Produit p2 = new Produit(102, "Souris Sans Fil", 15.50, 1);
        Produit p3 = new Produit(103, "Ecran 24 pouces", 149.00, 1);

        Magasin magasin = new Magasin();
        magasin.ajouterProduit(p1);
        magasin.ajouterProduit(p2);
        magasin.ajouterProduit(p3);

        Panier panier = new Panier();
        int choix = 0;

        // 2. Interaction avec le client via le menu
        do {
            System.out.println("\n--- Menu Magasin ---");
            System.out.println("1. Afficher les produits disponibles");
            System.out.println("2. Ajouter un produit au panier");
            System.out.println("3. Afficher le panier");
            System.out.println("4. Passer la commande");
            System.out.println("5. Quitter");
            System.out.print("Votre choix : ");

            if (scanner.hasNextInt()) {
                choix = scanner.nextInt();
                scanner.nextLine(); // Consommer le retour à la ligne
            } else {
                System.out.println("Veuillez entrer un nombre valide.");
                scanner.nextLine();
                continue;
            }

            switch (choix) {
                case 1:
                    magasin.afficherProduitsDisponibles();
                    break;

                case 2:
                    System.out.print("Entrez le nom du produit à ajouter : ");
                    String nomRecherche = scanner.nextLine();
                    Produit produitTrouve = magasin.trouverProduitParNom(nomRecherche);

                    if (produitTrouve != null) {
                        panier.ajouterProduit(produitTrouve);
                        System.out.println("« " + produitTrouve.getNom() + " » a été ajouté au panier.");
                    } else {
                        System.out.println("Produit introuvable.");
                    }
                    break;

                case 3:
                    panier.afficherPanier();
                    System.out.println("Total actuel : " + panier.calculerTotal() + " €");
                    break;

                case 4:
                    if (panier.getProduits().isEmpty()) {
                        System.out.println("Impossible de passer la commande : le panier est vide.");
                    } else {
                        Commande commande = new Commande(1, client, panier);
                        commande.afficherDetailsCommande();
                        panier.getProduits().clear(); // Réinitialise le panier après validation
                        System.out.println("Commande passée avec succès !");
                    }
                    break;

                case 5:
                    System.out.println("Merci de votre visite ! À bientôt.");
                    break;

                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");
            }

        } while (choix != 5);

        scanner.close();
    }
}
