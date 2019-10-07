package premierPackage;

public class Rectangle {
    int largeur;
    int hauteur;

    Rectangle(int largeur, int hauteur) {
        this.largeur = largeur;
        this.hauteur = hauteur;
    } /* this a constructor */

    void modifierLargeur(int nouvelleLargeur) {
        largeur += nouvelleLargeur;
    }

    void modifierHauteur(int nouvelleHauteur) {
        hauteur += nouvelleHauteur;
    }

    int perimetre() {
        return (largeur + hauteur) * 2;
    }

    int surface() {
        return largeur * hauteur;
    }

}
