package serie2part2ex2;

public class Principale {

    public static void main(String[] args) {
        Secretaire secretaire1 = new Secretaire("Nom", "Prénom", 0000001);
        Arbitre juge = new Arbitre("Arbitre", "NomArbitre", "abc", 1973);
        Club club1 = new Club("Premier club", "Rue du club", secretaire1);
        Secretaire secretaire2 = new Secretaire("Nom", "Prénom", 0000002);
        Coach coach1 = new Coach("Premier", "Premier", 2001);
        Club club2 = new Club("Premier club", "Rue du club", secretaire2);
        Coach coach2 = new Coach("Premier", "Premier", 2002);
        Equipe locaux = new Equipe("Locaux", "Categorie", club1, coach1);
        Equipe visiteurs = new Equipe("Visiteurs", "Categorie", club2, coach2);
        Rencontre renc1 = new Rencontre(locaux, visiteurs, 1, 1, 1, 2, juge);
        System.out.println(renc1.getPointsLocaux());
        System.out.println(renc1.equipeFairPlay());
        System.out.println(renc1.getJuge().getNom());
        System.out.println(renc1.getLocaux().getCategorie());
        System.out.println(renc1.getLocaux().getNom() + " " + renc1.getVisiteurs().getNom());
        System.out.println(renc1.getJuge().matricule());
        System.out.println(renc1.getLocaux().getCoach().getNom() + " " + renc1.getLocaux().getCoach().getPrenom());
        System.out.println(renc1.getVisiteurs().getClub().getAdrClub());
        System.out.println(renc1.getVisiteurs().getClub().getSecretaire());
        System.out.println(renc1.getVisiteurs().getCoach().nbAnneesExperience());
        renc1.setPointsVisiteurs(56);
        renc1.setJuge(new Arbitre("ArbitrePasMalade", "NouvelArbitre", "efg", 1983));
    }

}
