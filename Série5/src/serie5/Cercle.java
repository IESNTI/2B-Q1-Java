package serie5;
import java.lang.Math.*;

public class Cercle implements Forme {
    private int rayon;

    Cercle(int rayon) {
        this.rayon = rayon;
    }

    @Override
    public double aire() {
        return(Math.PI * rayon * 2);
    }

    @Override
    public String getForme() {
        return("cercle");
    }

    @Override
    public double volume() {
        return 0;
    }
}