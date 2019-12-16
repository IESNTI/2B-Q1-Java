package serie7;

import java.util.ArrayList;

/**
 * Bisseur
 */
public class Bisseur extends Etudiant {

    private final ArrayList<Cours> coursDispenses = new ArrayList<Cours>();

    Bisseur(String nom, String prenom, char sexe, String dateNaissance, String section, int annee) throws AnneeException, SectionException, SexeException {
        super(nom, prenom, sexe, dateNaissance, section, annee);
    }

    @Override
    public String toString() {
        return ("Le bisseur " + super.toString());
    }

    public void ajouterDispense(Cours coursDispense) throws TableauPlein {
        coursDispenses.add(coursDispense);
    }

    public Cours getDispense(int num) throws MauvaisNumero {
        if (num >= 1 && num <= coursDispenses.size()) {
            return(coursDispenses.get(num - 1));
        }
        else {
            throw new MauvaisNumero(num, coursDispenses.size());
        }
    }
}