package serie7;

/**
 * sexeException
 */
public class SectionException extends Exception {

    private String wrongSection;

    public SectionException(String wrongSection) {
        this.wrongSection = wrongSection;
    }

    @Override
    public String toString() {
        return("La valeur " + wrongSection + " est incorrect!");
    }
}