package serie4;

public class VillaLouee extends Villa {

    private Personne locataire;
    private double loyer;
    private int dureeBail;
    private static int villaLouee;

    VillaLouee(String rueNumero, Localite localite, int anneeConstruction, Personne proprietaire, int nbChambres,
            double superficieTerrain, boolean campagne, Personne locataire, double loyer, int dureeBail) {
        super(rueNumero, localite, anneeConstruction, proprietaire, nbChambres, superficieTerrain, campagne);
        this.locataire = locataire;
        this.loyer = loyer;
        this.dureeBail = dureeBail;
        if (superficieTerrain >= 10)
            villaLouee++;
    }

    String revenuProprietaire() {
        return ("Marie Legrand touche un loyer de " + loyer + " euros par an");
    }

    /**
     * @return the villaLouee
     */
    public static int getVillaLouee() {
        return villaLouee;
    }

    @Override
    public String toString() {
        return (super.toString() + "et est louée à Monsieur " + locataire + "pour un loyer de " + loyer
                + " euros par mois (durée du bail: " + dureeBail/12 + " an(s))");
    }
}