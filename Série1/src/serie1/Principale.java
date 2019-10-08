package serie1;

public class Principale {

    public static void main(String[] args) {
        Rencontre premiereRencontre = new Rencontre("la guilde de Talrant", "les faucons de Valmort");
        premiereRencontre.ajouterPointsLocaux();
        premiereRencontre.ajouterPointsVisiteurs();
        premiereRencontre.ajouterFauteLocaux();
        premiereRencontre.ajouterFauteVisiteurs();
        premiereRencontre.ajouterPoints('V');
        System.out.println("Locaux: " + premiereRencontre.presenterLocaux());
        System.out.println("Visiteurs: " + premiereRencontre.presenterVisiteurs());
        premiereRencontre.vainqueur();
        premiereRencontre.equipeFairPlay();
        System.out.println(premiereRencontre.exAequo());
        System.out.println(premiereRencontre.presenterAdversaires());
        System.out.println(premiereRencontre);
    }

}
