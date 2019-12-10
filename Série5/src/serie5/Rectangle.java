package serie5;

/**
 * Rectangle
 */
public class Rectangle implements Forme {

    private int largeur;
    private int hauteur;

    Rectangle(int largeur, int hauteur) {
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    @Override
    public double aire() {
        return(largeur * hauteur);
    }

    @Override
    public String getForme() {
        return("rectangle");
    }

    @Override
    public double volume() {
        return 0;
    }
}