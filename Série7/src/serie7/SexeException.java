package serie7;

/**
 * sexeException
 */
public class SexeException extends Exception {

    private char wrongSexe;

    public SexeException(char wrongSexe) {
        this.wrongSexe = wrongSexe;
    }

    @Override
    public String toString() {
        return ("La valeur " + wrongSexe + " est incorrect!");
    }
}