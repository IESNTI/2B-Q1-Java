package serie4;

/**
 * Personne
 */
public class Personne {

    private String nomPrenom;
    private String telephone;
    private char sexe;

    Personne(String nomPrenom, String telephone, char sexe) {
        this.nomPrenom = nomPrenom;
        this.telephone = telephone;
        this.setSexe(sexe);
    }

    /**
     * @param sexe the sexe to set
     */
    public void setSexe(char sexe) {
        if (sexe == 'M' || sexe == 'm' || sexe == 'F' || sexe == 'f')
            this.sexe = sexe;
        else if (sexe == '\u0000')
            this.sexe = 'm';
    }

    /**
     * @return the nomPrenom
     */
    public String getNomPrenom() {
        return nomPrenom;
    }

    @Override
    public String toString() {
        if (sexe == 'F' || sexe == 'f')
            return ("Madame " + nomPrenom + " (tel: " + telephone + ")");
        else if (sexe == 'M' || sexe == 'm')
            return ("Monsieur " + nomPrenom + " (tel: " + telephone + ")");
        else
            return ("Monsieur " + nomPrenom + " (tel: " + telephone + ")");
    }
}