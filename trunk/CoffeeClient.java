
import operatore.gestioneUtenti.Studente;
import studente.HomeStudenteForm;



/**
 * La classe main di Coffee
 * @author
 */
public class CoffeeClient {

    public static void main(String[] args) {
        Studente studente = new Studente();
        studente.setCognome("Sanfelice");
        studente.setNome("Antonio");
        studente.setMatricola("0510200997");
        HomeStudenteForm homeStud = new HomeStudenteForm(studente);
        homeStud.setVisible(true);
    }

}
