package serie4;

/**
 * Localite
 */
public class Localite {

    private String nomLocalite;
    private int codePostal;

    Localite(String nomLocalite, int codePostal) {
        this.nomLocalite = nomLocalite;
        this.codePostal = codePostal;
    }

    @Override
    public String toString() {
        return (codePostal + " " + nomLocalite);
    }
}