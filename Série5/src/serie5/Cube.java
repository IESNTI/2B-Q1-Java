package serie5;

/**
 * Cube
 */
public class Cube implements Forme {

    private int largeur;

    Cube(int largeur) {
        this.largeur = largeur;
    }

    @Override
    public double aire() {
        return(6 * (largeur * largeur));
    }

    @Override
    public String getForme() {
        return("forme");
    }

    @Override
    public double volume() {
        return Math.pow(largeur,3);
    }
    
}