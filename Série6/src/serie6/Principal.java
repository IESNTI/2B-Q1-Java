package serie6;

import java.util.ArrayList;

/**
 * Principal
 */
public class Principal {

    public static void main(String[] args) {
       
        Article element1 = new Article("Chocolat", 20.);
        Article element2 = new Article("Frisco", 10.);
        Article element3 = new Article("Thon", 100.);
        System.out.println(Article.getAcheteArticle());
        System.out.println(Article.getPrixMoyen());
        Commande premiereCommande = new Commande("Emilien", 7500);
        Commande secondeCommande = new Commande("Kechen", 5500);
        System.out.println(Commande.getNombreClientsGrandNamur());
        premiereCommande.ajouterArticle(element1);
        premiereCommande.ajouterArticle(element2);
        premiereCommande.ajouterArticle(element3);
        System.out.println(premiereCommande.listingPanier());
    }
}