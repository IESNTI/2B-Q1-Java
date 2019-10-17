package serie2;

public class Arbitre {
    String nom;
    String prenom;
    String code;
    int anneeNaissance;

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
}