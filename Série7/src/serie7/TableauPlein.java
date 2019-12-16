package serie7;

/**
 * TableauPlein
 */
public class TableauPlein extends Exception {

    public TableauPlein() {}

    @Override
    public String toString() {
        return("Le nombre de dispenses accordées est de 5 maximum.\nLe nombre de dispenses est donc déjà atteint !");
    }
}