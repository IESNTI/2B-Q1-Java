package serie4;

/**
 * Immeuble
 */
public class Immeuble extends BienImmobilier {

    private int nbStudios;
    private int nbAppartements;
    private double loyersStudios;
    private double loyersAppartements;
    private static int immeublesRichardMateur;
    private static int nbAppartementsTotal;

    Immeuble(int nbStudios, int nbAppartements, double loyersStudios, double loyersAppartements, String rueNumero,
            Localite localite, int anneeConstruction, Personne proprietaire) {
        super(rueNumero, localite, anneeConstruction, proprietaire);
        this.nbStudios = nbStudios;
        this.nbAppartements = nbAppartements;
        this.loyersStudios = loyersStudios;
        this.loyersAppartements = loyersAppartements;
        if (proprietaire.getNomPrenom().equals("Richard Mateur"))
            immeublesRichardMateur++;
        nbAppartementsTotal += nbAppartements;
    }

    double revenuMensuel() {
        return (loyersAppartements + loyersStudios);
    }

    /**
     * @return the nbAppartementsTotal
     */
    public static int getNbAppartementsTotal() {
        return nbAppartementsTotal;
    }

    /**
     * @return the immeublesRichardMateur
     */
    public static int getImmeublesRichardMateur() {
        return immeublesRichardMateur;
    }

    @Override
    public String toString() {
        return (super.toString() + " contient " + nbStudios + " studio(s) et " + nbAppartements
                + " appartement(s) et rapporte " + revenuMensuel() + " euros par mois");
    }
}