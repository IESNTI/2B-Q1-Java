package serie7;

/**
 * Cours
 */
public class Cours {

    private String libelle;
    private Personne professeur;

    Cours(String libelle, Personne professeur) {
        this.libelle = libelle;
        this.professeur = professeur;
    }

    @Override
    public String toString() {
        return("le cours de " + libelle + " donné par " + professeur);
    }
}