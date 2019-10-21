package heritage;

public class Restaurant {
    private String nom;
    private String localite;
    private int nbMacarons;

    public Restaurant (String nom, String localite, int nbMacarons){
        this.nom = nom;
        this.localite = localite;
        setNbMacarons(nbMacarons);
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
