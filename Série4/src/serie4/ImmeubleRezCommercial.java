package serie4;

/**
 * ImmeubleRezCommercial
 */
public class ImmeubleRezCommercial extends Immeuble {

    private int nbMagasins;
    private double revenuLocationMagasins;
    private static int immeublesRezCommercial;

    ImmeubleRezCommercial(int nbStudios, int nbAppartements, double loyersStudios, double loyersAppartements,
            String rueNumero, Localite localite, int anneeConstruction, Personne proprietaire, int nbMagasins,
            double revenuLocationMagasins) {
        super(nbStudios, nbAppartements, loyersStudios, loyersAppartements, rueNumero, localite, anneeConstruction,
                proprietaire);
        this.nbMagasins = nbMagasins;
        this.revenuLocationMagasins = revenuLocationMagasins;
        if (nbMagasins >= 3)
            immeublesRezCommercial++;
    }

    double revenuMensuel() {
        return (revenuMensuel() + revenuLocationMagasins);
    }

    /**
     * @return the immeublesRezCommercial
     */
    public static int getImmeublesRezCommercial() {
        return immeublesRezCommercial;
    }

    @Override
    public String toString() {
        return (super.toString() + "(il comprend un rez de chaussée commercial composé de " + nbMagasins
                + " magasins dont le revenu commercial est de " + revenuMensuel() + " euros)");
    }
}