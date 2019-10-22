package serie2part2ex1;

public class Rectangle {
    private int largeur;
    private int hauteur;

    public Rectangle(int largeur, int hauteur) {
        this.setHauteur(hauteur);
        this.setLargeur(largeur);
    } /* this a constructor */

    public Rectangle(int hauteur) {
        this(10, hauteur);
    }

    public void modifierLargeur(int nouvelleLargeur) {
        setLargeur(largeur + nouvelleLargeur);
    }

    public void modifierHauteur(int nouvelleHauteur) {
        setHauteur(hauteur + nouvelleHauteur);
    }

    public int perimetre() {
        return (largeur + hauteur) * 2;
    }

    public int surface() {
        return largeur * hauteur;
    }

    /**
     * @return the hauteur
     */
    public int getHauteur() {
        return hauteur;
    }

    /**
     * @return the largeur
     */
    public int getLargeur() {
        return largeur;
    }

    /**
     * @param hauteur the hauteur to set
     */
    public void setHauteur(int hauteur) {
        if (hauteur >= 0)
            this.hauteur = hauteur;
        else if(this.hauteur == 0)
            this.hauteur = 1;
    }

    /**
     * @param largeur the largeur to set
     */
    public void setLargeur(int largeur) {
        if (largeur >= 0)
            this.largeur = largeur;
        else if(this.largeur == 0)
            this.largeur = 1;
        
    }
}
