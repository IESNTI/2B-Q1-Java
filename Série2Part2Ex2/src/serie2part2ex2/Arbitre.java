package serie2part2ex2;

public class Arbitre {
    private String nom;
    private String prenom;
    private String code;
    private int anneeNaissance;

    String matricule() {
        return(anneeNaissance + code);
    }

    Arbitre(String nom, String prenom, String code, int anneeNaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.code = code;
        this.anneeNaissance = anneeNaissance;
    }

    @Override
    public String toString() {
        return("nom: " + nom + "\nprenom: " + prenom + "\ncode: " + code + "\nanneeNaissance: " + anneeNaissance);
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }
}