package serie2part2ex1;

public class Principale {

    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        String mot = "test";
        System.out.println("Le produit vaut " + x * y + " et le mot est " + mot);
        Rectangle premierRectangle = new Rectangle(6);
        System.out.println("Hauteur: " + premierRectangle.getHauteur()+ " \nLargeur: " + premierRectangle.getLargeur());
        System.out.println("Périmètre: " + premierRectangle.perimetre() + " \nSurface: " + premierRectangle.surface());
        premierRectangle.setHauteur(-5);
        premierRectangle.setLargeur(7);
        System.out.println("----------");
        System.out.println("Hauteur: " + premierRectangle.getHauteur()+ " \nLargeur: " + premierRectangle.getLargeur());
        System.out.println("Périmètre: " + premierRectangle.perimetre() + " \nSurface: " + premierRectangle.surface());
    }

}
