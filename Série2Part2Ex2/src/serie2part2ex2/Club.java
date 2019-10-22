package serie2part2ex2;

public class Club {
    private String nom;
    private String adrClub;
    private Secretaire secretaire;

    Club(String nom, String adrClub, Secretaire secretaire) {
        this.nom = nom;
        this.adrClub = adrClub;
        this.secretaire = secretaire;
    }

    @Override
    public String toString() {
        return("Nom: " + nom + "\nadrClub: " + adrClub + "\nSecretaire: " + secretaire);
    }
 
    /**
     * @return the adrClub
     */
    public String getAdrClub() {
        return adrClub;
    }

    /**
     * @return the secretaire
     */
    public Secretaire getSecretaire() {
        return secretaire;
    }
}