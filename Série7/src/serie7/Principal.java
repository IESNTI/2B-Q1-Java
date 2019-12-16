package serie7;

import java.util.GregorianCalendar;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        try {
            Personne professeur = new Personne("jean", "michelle", 'f', "01/01/1971");
            Cours coursDispense1 = new Cours("math", professeur);
            Cours coursDispense2 = new Cours("math", professeur);
            Cours coursDispense3 = new Cours("math", professeur);
            Cours coursDispense4 = new Cours("math", professeur);
            Cours coursDispense5 = new Cours("math", professeur);
            Cours coursDispense6 = new Cours("math", professeur);
            Etudiant etud1 = new Etudiant("Pierre", "Jean", 'm', "27/04/1998", "technoInfo", 1);
            Bisseur etud2 = new Bisseur("Pierre", "Jean", 'f', "27/01/1998", "technoInfo", 1);
            etud2.ajouterDispense(coursDispense1);
            etud2.ajouterDispense(coursDispense2);
            etud2.ajouterDispense(coursDispense3);
            // etud2.ajouterDispense(coursDispense4);
            // etud2.ajouterDispense(coursDispense5);
            // etud2.ajouterDispense(coursDispense6);
            System.out.println(etud2);
            System.out.println(etud2.getDispense(3));
            // JOptionPane.showMessageDialog(null, etud1, "Confirmation d’inscription",
            // JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            System.out.println(e);
            // JOptionPane.showMessageDialog(null, e, "Erreur", JOptionPane.ERROR_MESSAGE);
        } finally {
            System.out.println(Etudiant.getFillesInscritesPourcentage() + "%");
        }
        System.exit(0);
    }
}