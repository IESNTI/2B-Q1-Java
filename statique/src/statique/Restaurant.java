package src.statique;

public class Restaurant {
    private String nom;
    private String localite;
    private int nbMacarons;
    private static int nbResto2Macarons;
    private static int nbRestoBxL;

    public Restaurant (String nom, String localite, int nbMacarons){
        this.nom = nom;
        this.localite = localite;
        this.nbMacarons = nbMacarons;
        setNbMacarons(nbMacarons);
        if (nbMacarons == 2) {
            nbResto2Macarons++;
        }
        if (localite.equals("Bruxelles"))
            nbRestoBxL++;
    }

    /**
     * @return the nbResto2Macarons
     */
    public static int getNbResto2Macarons() {
        return nbResto2Macarons;
    }

    @Override
    public String toString() {
        return nom + " , " + nbMacarons + " macaron(s), situé à " + localite;
    }

    public String getLocalite() {
        return localite;
    }

    int getNbMacarons(){
        return nbMacarons;
    }

    public void setNbMacarons(int nbMacarons) {
        if (nbMacarons >= 0 && nbMacarons <= 3) {
            this.nbMacarons = nbMacarons;
        }
    }
}
