package serie6;

/**
 * Article
 */
public class Article {

    private String libelle;
    private double prix;
    private static double prixTotal;
    private static int acheteArticle;

    Article(String libelle, double prix) {
        this.libelle = libelle;
        this.prix = prix;
        acheteArticle += 1;
        prixTotal+=prix;
    }

    @Override
    public String toString() {
        return(libelle + " au prix de " + prix + " euros");
    }

    /**
     * @return the prix
     */
    public double getPrix() {
        return prix;
    }

    /**
     * @return the libelle
     */
    public String getLibelle() {
        return libelle;
    }

    /**
     * @return the acheteArticle
     */
    public static int getAcheteArticle() {
        return acheteArticle;
    }

    /**
     * @return the prixMoyen
     */
    public static double getPrixMoyen() {
        return    prixTotal/acheteArticle;
    }
}