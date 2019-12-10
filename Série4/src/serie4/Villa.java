package serie4;

public class Villa extends BienImmobilier {
    private int nbChambres;
    private double superficieTerrain;
    private boolean campagne;

    Villa(String rueNumero, Localite localite, int anneeConstruction, Personne proprietaire, int nbChambres,
            double superficieTerrain, boolean campagne) {
        super(rueNumero, localite, anneeConstruction, proprietaire);
        this.nbChambres = nbChambres;
        this.superficieTerrain = superficieTerrain;
        this.campagne = campagne;
    }

    @Override
    public String toString() {
        return (super.toString() + "est une villa à " + nbChambres + "chambre(s) située sur un terrain de "
                + superficieTerrain + " ares");
    }

    String descriptionTerrain() {
        String campagneOrVille = "à la campagne";
        if (!campagne) {
            campagneOrVille = "en ville";
        }
        return ("Terrain de " + superficieTerrain + " ares situé " + campagneOrVille + "," + getLocalite());
    }
}