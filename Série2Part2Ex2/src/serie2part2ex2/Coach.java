package serie2part2ex2;

import java.util.*;

public class Coach {
    private String nom;
    private String prenom;
    private int anneeDebut;

    int nbAnneesExperience() {
        GregorianCalendar now = new GregorianCalendar();
        int anneeEnCours = now.get(GregorianCalendar.YEAR);
        return(anneeEnCours - anneeDebut);
    }

    Coach(String nom, String prenom, int anneeDebut) {
        this.nom = nom;
        this.prenom = prenom;
        this.anneeDebut = anneeDebut;
    }

    @Override
    public String toString() {
        return("Nom: " + nom + "\nPrenom: " + "\nanneDebut: " + anneeDebut);
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
}