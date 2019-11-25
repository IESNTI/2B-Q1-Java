package serie4;

/**
 * ImmeubleBureaux
 */
public class ImmeubleBureaux extends Immeuble {

    private int nbM2;
    private double prixM2;

    ImmeubleBureaux(int nbStudios, int nbAppartements, double loyersStudios, double loyersAppartements, String rueNumero, Localite localite, int anneeConstruction, Personne proprietaire, int nbM2, double prixM2) {
        super(nbStudios, nbAppartements, loyersStudios, loyersAppartements, rueNumero, localite, anneeConstruction, proprietaire);
        this.nbM2 = nbM2;
        this.prixM2 = prixM2;
    }

    double revenuMensuel() {
        return(revenuMensuel() + (prixM2 * nbM2));
    }

    @Override
    public String toString() {
        return(super.toString() + "(il comprend " + nbM2 + " m2 de bureau dont la location rapporte" + revenuMensuel() + "euros)");
    }
}