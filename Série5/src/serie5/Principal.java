package serie5;
import java.util.ArrayList;

/**
 * Principal
 */
public class Principal {

    public static void main(String[] args) {
        Forme[] tableau = new Forme[3];
        tableau[0] = new Cercle(5);
        tableau[1] = new Cube(5);
        tableau[2] = new Rectangle(5, 5);
        for (int i=0; i < 3; i++) { 
            System.out.println(tableau[i].getForme());
            System.out.println(tableau[i].aire());
            System.out.println(tableau[i].volume());
        }

        ArrayList<Forme> tableauList = new ArrayList<Forme>();
        tableauList.add(new Cercle(5));
        tableauList.add(new Cube(5));
        tableauList.add(new Rectangle(5, 5));
        for (int i=0; i < 3; i++) { 
            System.out.println(tableauList.get(i).getForme());
            System.out.println(tableauList.get(i).aire());
            System.out.println(tableauList.get(i).volume());
        }
    }
}