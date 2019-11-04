package src.statique;

public class ChefCoq extends Cuistot {
    private int nbPersonnes;
    private static int totalPers;
    private static int nbChefCoq;
    private static int nbChefCoq2005;

    ChefCoq(String nom, int anneeEntree, Restaurant restaurant, int nbPersonnes){
        super(nom, anneeEntree, restaurant);
        this.nbPersonnes = nbPersonnes;
        totalPers += nbPersonnes;
        nbChefCoq++;
        if (anneeEntree == 2005)
            nbChefCoq2005++;
    }
    @Override
    String libelle() {
        return ("Le Chef coq ");
    }
    @Override
    public String toString() {
        return (super.toString() + " et dirige une équipe de " + nbPersonnes + " personnes");
    }

    static double moyenneNbPersonnes() {
        return (double) totalPers/nbChefCoq;
    }
}
