package serie2part2ex2;

/**
 * Secretaire
 */
public class Secretaire {
    private String nom;
    private String prenom;
    private int nbTel;

    Secretaire(String nom, String prenom, int nbTel) {
        this.nom = nom;
        this.prenom = prenom;
        this.nbTel = nbTel;
    }

    @Override
    public String toString() {
        return("Nom: " + nom + "\nPrenom: " + "\nnbTel: " + nbTel);
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @return the prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * @return the nbTel
     */
    public int getNbTel() {
        return nbTel;
    }
}