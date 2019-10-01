package premierPackage;

public class Principale {

    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        String mot = "test";
        System.out.println(mot + x + y);
        Rectangle premierRectangle = new Rectangle(10, 4);
        System.out.println(premierRectangle.hauteur);
        System.out.println(premierRectangle.perimetre());
    }

}
