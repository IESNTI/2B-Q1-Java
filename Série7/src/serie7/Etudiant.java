package serie7;

/**
 * Etudiant
 */
public class Etudiant extends Personne {

    private String section;
    private int annee;
    private static int fillesInscrites;
    private static int inscrits;

    Etudiant(String nom, String prenom, char sexe, String dateNaissance, String section, int annee)
            throws AnneeException, SectionException, SexeException {
        super(nom, prenom, sexe, dateNaissance);
        if (sexe == 'f' || sexe == 'F') {
            fillesInscrites++;
        }
        inscrits++;
        setAnnee(annee);
        setSection(section);
    }

    /**
     * @param annee the annee to set
     */
    public void setAnnee(int annee) throws AnneeException {
        if (annee == 1 || annee == 2 || annee == 3) {
            this.annee = annee;
        } else {
            throw new AnneeException(annee);
        }
    }

    /**
     * @param section the section to set
     */
    public void setSection(String section) throws SectionException {
        if (section.equals("compta") || section.equals("droit") || section.equals("market")
                || section.equals("infoGestion") || section.equals("technoInfo") || section.equals("sécu")) {
            this.section = section;
        } else {
            throw new SectionException(section);
        }
    }

    /**
     * @return the fillesInscrites
     */
    public static double getFillesInscritesPourcentage() {
        return ((100. / inscrits) * fillesInscrites);
    }

    public String nomUtilisateur() {
        return (section.substring(0, 2) + annee + nom + prenom.substring(0, 1));
    }
    
    @Override
    public String toString() {
        if (sexe == 'm' || sexe == 'M') {
            return (super.toString() + " est inscrit en " + annee + "e " + section + "\nSon nom d'utilisateur est " + nomUtilisateur() + ".");
        }
        else {
            return (super.toString() + " est inscrite en " + annee + "e " + section);
        }
    }
}