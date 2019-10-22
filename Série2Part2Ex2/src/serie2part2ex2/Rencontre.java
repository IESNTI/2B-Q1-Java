package serie2part2ex2;

public class Rencontre {
    private Equipe locaux;
    private Equipe visiteurs;
    private int pointsLocaux;
    private int pointsVisiteurs;
    private int nbFautesLocaux;
    private int nbFautesVisiteurs;
    private Arbitre juge;

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

    String vainqueur() {
        String equipe;
        if (pointsLocaux > pointsVisiteurs) {
            equipe = locaux.getNom();
        } else if (pointsVisiteurs > pointsLocaux) {
            equipe = visiteurs.getNom();
        } else {
            equipe = "Ex æquo";
        }
        return(equipe);
    }

    String equipeFairPlay() {
        String equipe;
        if (nbFautesVisiteurs < nbFautesLocaux) {
            equipe = visiteurs.getNom();
        } else if (nbFautesLocaux < nbFautesVisiteurs) {
            equipe = locaux.getNom();
        } else {
            equipe = "Ex æquo";
        }
        return(equipe);
    }

    /**
     * @return the pointsLocaux
     */
    public int getPointsLocaux() {
        return pointsLocaux;
    }

    /**
     * @return the juge
     */
    public Arbitre getJuge() {
        return juge;
    }

    /**
     * @return the locaux
     */
    public Equipe getLocaux() {
        return locaux;
    }

    /**
     * @return the visiteurs
     */
    public Equipe getVisiteurs() {
        return visiteurs;
    }

    /**
     * @param pointsVisiteurs the pointsVisiteurs to set
     */
    public void setPointsVisiteurs(int pointsVisiteurs) {
        this.pointsVisiteurs = pointsVisiteurs;
    }

    /**
     * @param juge the juge to set
     */
    public void setJuge(Arbitre juge) {
        this.juge = juge;
    }
}