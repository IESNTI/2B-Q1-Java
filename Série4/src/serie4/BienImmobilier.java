package serie4;

import java.util.GregorianCalendar;

/**
 * BienImmobilier
 */
public class BienImmobilier {

    private String rueNumero;
    private Localite localite;
    private int anneeConstruction;
    private Personne proprietaire;

    BienImmobilier(String rueNumero, Localite localite, int anneeConstruction, Personne proprietaire) {
        this.rueNumero = rueNumero;
        this.localite = localite;
        this.anneeConstruction = anneeConstruction;
        this.proprietaire = proprietaire;
    }

    int tauxTVA() {
        GregorianCalendar now = new GregorianCalendar();
        int anneeEnCours = now.get(GregorianCalendar.YEAR);
        int diffAnneeEnCoursConstruction = anneeEnCours - anneeConstruction;
        if (diffAnneeEnCoursConstruction >= 20)
            return (6);
        else
            return (21);
    }

    /**
     * @return the localite
     */
    public Localite getLocalite() {
        return localite;
    }

    @Override
    public String toString() {
        return ("L'immeuble situé " + localite + " à " + rueNumero + " appartenant à " + proprietaire);
    }
}