package serie2;

public class Equipe {
    String nom;
    String categorie;
    Club club;
    Coach coach;

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
}