package heritage;

public class Principal {
    public static void main(String[] args) {
        Restaurant resto = new Restaurant("La Veganitude","danstonbrocoli",2);
        Cuistot cuistot = new Cuistot("Jean-mich",1995,resto);
        System.out.println(cuistot.getNom());
        System.out.println(cuistot.getRestaurant().getLocalite());
        System.out.println(cuistot.anciennete());
        System.out.println(cuistot);
        System.out.println(cuistot.salaire());
        //resto.setNbMacarons(2);
        System.out.println(resto);
        ChefCoq chef = new ChefCoq("Marc Veyrat",2010,resto,5);
        System.out.println(chef);
        System.out.println(chef.getNom());

    }
}
