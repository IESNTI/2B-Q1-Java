package serie2;

public class Rencontre {
    Equipe locaux;
    Equipe visiteurs;
    int pointsLocaux;
    int pointsVisiteurs;
    int nbFautesLocaux;
    int nbFautesVisiteurs;
    Arbitre juge;

    Rencontre(Equipe locaux, Equipe visiteurs, int pointsLocaux, int pointsVisiteurs, int nbFautesLocaux, int nbFautesVisiteurs, Arbitre juge) {
        this.locaux = locaux;
        this.visiteurs = visiteurs;
        this.pointsLocaux = pointsLocaux;
        this.pointsVisiteurs = pointsVisiteurs;
        this.nbFautesLocaux = nbFautesLocaux;
        this.nbFautesVisiteurs = nbFautesVisiteurs;
        this.juge = juge;
    }
    
    boolean exAequo() {
        return(pointsLocaux == pointsVisiteurs);
    }

    void ajouterPointsLocaux() {
        ajouterPointsLocaux(1);
    }

    void ajouterPointsVisiteurs() {
        ajouterPointsVisiteurs(1);
    }

    void ajouterFauteLocaux() {
        nbFautesLocaux += 1;
    }

    void ajouterFauteVisiteurs() {
        nbFautesVisiteurs += 1;
    }

    void ajouterPoints(char equipe) {
        switch(equipe) {
            case 'L':
                ajouterPointsLocaux();
                break;
            case 'V':
                ajouterPointsVisiteurs();
                break;
            default:
                System.out.println("Mauvaise lettre, veuillez spécifier L ou V.");
        }
    }

    void ajouterPointsLocaux(int points) {
        pointsLocaux += points;
    }

    void ajouterPointsVisiteurs(int points) {
        pointsVisiteurs += points;
    }
}