package heritage;

public class ChefCoq extends Cuistot {
    private int nbPersonnes;

    ChefCoq(String nom, int anneeEntree, Restaurant restaurant, int nbPersonnes){
        super(nom, anneeEntree, restaurant);
        this.nbPersonnes = nbPersonnes;
    }
    @Override
    String libelle() {
        return ("Le Chef coq ");
    }
    @Override
    public String toString() {
        return (super.toString() + " et dirige une équipe de " + nbPersonnes + " personnes");
    }

}
