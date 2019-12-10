package serie6;

import java.util.ArrayList;

/**
 * Commande
 */
public class Commande {

    private String client;
    private int codePostal;
    private ArrayList<Article> panier;
    private static int nombreClientsGrandNamur;

    Commande(String client, int codePostal) {
        this.client = client;
        this.codePostal = codePostal;
        this.panier = new ArrayList<Article>();
        if (codePostal/1000 == 5) {
            nombreClientsGrandNamur += 1;
        }
    }

    public void ajouterArticle(Article object) {
        panier.add(object);
    }

    public double calculTotalPanier() {
        double total = 0;
        for (int i = 0; i < panier.size(); i++) {
            total += panier.get(i).getPrix();
        }
        return(total);
    }

    public String listingPanier() {
        String message = "Le panier du client " + client + " contient les articles suivants:\n";
        for (int i = 0; i < panier.size(); i++) {
            message += (panier.get(i) + "\n");
        }
        message += "pour un total de " + calculTotalPanier() + " euros";
        return(message);
    }

    /**
     * @return the nombreClientsGrandNamur
     */
    public static int getNombreClientsGrandNamur() {
        return nombreClientsGrandNamur;
    }
}