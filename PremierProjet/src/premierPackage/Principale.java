package premierPackage;

public class Principale {

    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        String mot = "test";
        System.out.println("Le produit vaut " + x * y + " et le mot est " + mot);
        Rectangle premierRectangle = new Rectangle(5, 6);
        System.out.println("Hauteur: " + premierRectangle.hauteur + " \nLargeur: " + premierRectangle.largeur);
        System.out.println("Périmètre: " + premierRectangle.perimetre() + " \nSurface: " + premierRectangle.surface());
    }

}
