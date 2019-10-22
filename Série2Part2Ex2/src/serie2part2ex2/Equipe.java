package serie2part2ex2;

public class Equipe {
    private String nom;
    private String categorie;
    private Club club;
    private Coach coach;

    Equipe(String nom, String categorie, Club club, Coach coach) {
        this.nom = nom;
        this.categorie = categorie;
        this.club = club;
        this.coach = coach;
    }

    @Override
    public String toString() {
        return("nom: " + nom + "\ncategorie: " + categorie + "\nclub: " + club + "\ncoach:" + coach);
    }

    /**
     * @return the categorie
     */
    public String getCategorie() {
        return categorie;
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @return the coach
     */
    public Coach getCoach() {
        return coach;
    }

    /**
     * @return the club
     */
    public Club getClub() {
        return club;
    }
}