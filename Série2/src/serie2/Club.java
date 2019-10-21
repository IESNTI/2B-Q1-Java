package serie2;

public class Club {
    String nom;
    String adrClub;
    Secretaire secretaire;

    Club(String nom, String adrClub, Secretaire secretaire) {
        this.nom = nom;
        this.adrClub = adrClub;
        this.secretaire = secretaire;
    }

    @Override
    public String toString() {
        return("Nom: " + nom + "\nadrClub: " + adrClub + "\nSecretaire: " + secretaire.nom + "\nnoTel: " + secretaire.nbTel);
    }
}