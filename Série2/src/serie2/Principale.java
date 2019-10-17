package serie2;

public class Principale {

    public static void main(String[] args) {
        Arbitre juge = new Arbitre("Arbitre", "NomArbitre", "abc", 1973);
        Club club1 = new Club("Premier club", "Rue du club", "Premier secrétaire", "01010101");
        Coach coach1 = new Coach("Premier", "Premier", 2001);
        Club club2 = new Club("Premier club", "Rue du club", "Premier secrétaire", "02020202");
        Coach coach2 = new Coach("Premier", "Premier", 2002);
        Equipe locaux = new Equipe("Locaux", "Categorie", club1, coach1);
        Equipe visiteurs = new Equipe("Visiteurs", "Categorie", club2, coach2);
        Rencontre renc1 = new Rencontre(locaux, visiteurs, 1, 1, 1, 1, juge);
        System.out.println(renc1);
    }

}
