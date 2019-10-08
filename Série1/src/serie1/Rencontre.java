package serie1;

public class Rencontre {
    String nomLocaux;
    String nomVisiteurs;
    int pointsLocaux;
    int pointsVisiteurs;
    int nbFautesLocaux;
    int nbFautesVisiteurs;

    Rencontre(String nomLocaux, String nomVisiteurs, int pointsLocaux, int pointsVisiteurs, int nbFautesLocaux,
            int nbFautesVisiteurs) {
        this.nomLocaux = nomLocaux;
        this.nomVisiteurs = nomVisiteurs;
        this.pointsLocaux = pointsLocaux;
        this.pointsVisiteurs = pointsVisiteurs;
        this.nbFautesLocaux = nbFautesLocaux;
        this.nbFautesVisiteurs = nbFautesVisiteurs;
    }

    Rencontre(String nomLocaux, String nomVisiteurs) {
        this(nomLocaux, nomVisiteurs, 0, 0, 0, 0);
    }

    Rencontre(String nomVisiteurs) {
        this("Les seigneurs du combat", nomVisiteurs);
    }

    @Override
    public String toString() {
        return (presenterAdversaires() + "\nEquipe victorieuse : " + vainqueur());
    }

    String vainqueur() {
        String equipe;
        if (pointsLocaux > pointsVisiteurs) {
            equipe = nomLocaux;
        } else if (pointsVisiteurs > pointsLocaux) {
            equipe = nomVisiteurs;
        } else {
            equipe = "Ex æquo";
        }
        return(equipe);
    }

    String equipeFairPlay() {
        String equipe;
        if (nbFautesVisiteurs < nbFautesLocaux) {
            equipe = nomVisiteurs;
        } else if (nbFautesLocaux < nbFautesVisiteurs) {
            equipe = nomLocaux;
        } else {
            equipe = "Ex æquo";
        }
        return(equipe);
    }

    boolean exAequo() {
        return(pointsLocaux == pointsVisiteurs);
    }

    String presenterLocaux() {
        return ("L’équipe locale " + nomLocaux);
    }

    String presenterVisiteurs() {
        return ("l’équipe des visiteurs " + nomVisiteurs);
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

    String presenterAdversaires() {
        return(presenterLocaux() + ". reçoit\n" + presenterVisiteurs());
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