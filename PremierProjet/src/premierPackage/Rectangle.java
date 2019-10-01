package premierPackage;

public class Rectangle {
    int largeur;
    int hauteur;

    Rectangle(int largeur, int hauteur) {
        this.largeur = largeur;
        this.hauteur = hauteur;
    } /* this a constructor */

    int perimetre() {
        return (largeur + hauteur) * 2;
    }

    int surface() {
        return largeur * hauteur;
    }

    int modifierLargeur(int l) {
        return (largeur += l);
    }

    int modifierHauteur(int h) {
        return (hauteur += h);
    }

}
