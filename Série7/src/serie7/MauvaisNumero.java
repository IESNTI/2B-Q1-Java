package serie7;

/**
 * MauvaisNumero
 */
public class MauvaisNumero extends Exception {

    private int mauvaisIndice;
    private int nombreReelDeCours;

    MauvaisNumero(int mauvaisIndice, int nombreReelDeCours) {
        this.mauvaisIndice = mauvaisIndice;
        this.nombreReelDeCours = nombreReelDeCours;
    }

    @Override
    public String toString() {
        String texte;
        if (mauvaisIndice <= 0) {
            texte = ("Le numéro " + mauvaisIndice + " que vous avez proposé est <=0.");
        } else {
            texte = ("L’étudiant bisseur n’est dispensé que dans " + nombreReelDeCours + " cours. Le numéro "
                    + mauvaisIndice
                    + " que vous avez proposé ne correspond donc pas à un cours dont l’étudiant est dispensé.");
        }
        return texte;
    }
}