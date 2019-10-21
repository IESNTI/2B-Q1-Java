package serie2;

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
        System.out.println(renc1.pointsLocaux);
        System.out.println(renc1.equipeFairPlay());
        System.out.println(renc1.juge.nom);
        System.out.println(renc1.locaux.categorie);
        System.out.println(renc1.locaux.nom + " " + renc1.visiteurs.nom);
        System.out.println(renc1.juge.matricule());
        System.out.println(renc1.locaux.coach.nom + " " + renc1.locaux.coach.prenom);
        System.out.println(renc1.visiteurs.club.adrClub);
        System.out.println(renc1.visiteurs.club.secretaire);
        System.out.println(renc1.visiteurs.coach.nbAnneesExperience());
        renc1.pointsVisiteurs = 56;
        renc1.juge = new Arbitre("ArbitrePasMalade", "NouvelArbitre", "efg", 1983);

    }

}
