
import operatore.gestioneUtenti.Studente;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import studente.HomeStudenteForm;

/**
 *
 * @author e-vampire
 */
public class Main {

    public static void main(String[] args) {
        Studente studente = new Studente("Antonio","Sanfelice","05102/00997");
        HomeStudenteForm home = new HomeStudenteForm(studente);
        home.setVisible(true);
    }

}
