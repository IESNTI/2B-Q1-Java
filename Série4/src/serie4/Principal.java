package serie4;

/**
 * Principal
 */
public class Principal {

    public static void main(String[] args) {
        Personne proprio = new Personne("Pierre Duvin", "0472/91.92.98", 'F');
        Localite adresse = new Localite("Liège", 4000);
        Immeuble immeuble = new Immeuble(5, 6, 800, 8000, "32, rue du bouchon", adresse, 1998, proprio);
        Villa villa1 = new Villa("80", adresse, 2018, proprio, 5, 5, false);
        BienImmobilier bien1 = new BienImmobilier("80", adresse, 1800, proprio);
        ImmeubleRezCommercial immeublerzc1 = new ImmeubleRezCommercial(5, 5, 5, 5, "80", adresse, 2018, proprio, 5, 10);
        ImmeubleRezCommercial immeublerzc2 = new ImmeubleRezCommercial(5, 5, 5, 5, "80", adresse, 2018, proprio, 5, 10);
        System.out.println(bien1.tauxTVA());
        System.out.println(proprio);
        proprio.setSexe('x');
        System.out.println(proprio);
    }
}