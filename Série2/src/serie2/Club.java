package serie2;

public class Club {
    String nom;
    String adrClub;
    String secretaire;
    String noTel;

    Club(String nom, String adrClub, String secretaire, String noTel) {
        this.nom = nom;
        this.adrClub = adrClub;
        this.secretaire = secretaire;
        this.noTel = noTel;
    }

    @Override
    public String toString() {
        return("Nom: " + nom + "\nadrClub: " + adrClub + "\nSecretaire: " + secretaire + "\nnoTel: " + noTel);
    }
}