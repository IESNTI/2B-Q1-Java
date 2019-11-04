package src.statique;
import java.util.*;

public class Cuistot {
    private String nom;
    private int anneeEntree;
    private Restaurant restaurant;

    public Cuistot(String nom, int anneeEntree, Restaurant restaurant){
        this.nom = nom;
        this.anneeEntree = anneeEntree;
        this.restaurant = restaurant;
    }

    @Override
    public String toString() {
        return libelle() + nom + " travaille au restaurant " + restaurant + " depuis " + anciennete() + " annees ";
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public String getNom() {
        return nom;
    }

    int anciennete(){
        GregorianCalendar auj = new GregorianCalendar();
        int an = auj.get(GregorianCalendar.YEAR);
        return an - anneeEntree;
    }

    double salaire(){
        double salaire = 0;
        switch(restaurant.getNbMacarons()) {
            case 0 :
                salaire = 2500;
                break;
            case 1 :
                salaire = 3000;
                break;
            case 2 :
                salaire = 3500;
                break;
            case 3 :
                salaire = 4000;
                break;
        }
        return salaire;
    }
    String libelle(){
        return ("Le cuistot ");
    }
}
