package serie7;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 * Personne
 */
public class Personne {

    String nom;
    String prenom;
    char sexe;
    String dateNaissance;

    Personne(String nom, String prenom, char sexe, String dateNaissance) throws SexeException {
        this.nom = nom;
        this.prenom = prenom;
        setSexe(sexe);
        this.dateNaissance = dateNaissance;
    }

    /**
     * @param sexe the sexe to set
     */
    public void setSexe(char sexe) throws SexeException {
        if (sexe == 'm' || sexe == 'M' || sexe == 'f' || sexe == 'F') {
            this.sexe = sexe;
        } else {
            throw new SexeException(sexe);
        }
    }

    /**
     * @return the dateNaissance
     */
    public String getDateNaissance() {
        return dateNaissance;
    }

    public int age() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.parse(dateNaissance, formatter);
        Period dateBetweenTodayAndBirthday = Period.between(birthday, today);
        return(dateBetweenTodayAndBirthday.getYears());
    }

    @Override
    public String toString() {
        return (prenom + " " + nom + " (" + age() + " ans)");
    }
}