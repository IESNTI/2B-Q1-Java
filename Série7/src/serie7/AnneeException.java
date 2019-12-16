package serie7;

/**
 * AnneeException
 */
public class AnneeException extends Exception {

    private int wrongAnnee;

    public AnneeException(int annee) {
        this.wrongAnnee = annee;
    }

    @Override
    public String toString() {
        return ("La valeur " + wrongAnnee + " est incorrecte!");
    }
}