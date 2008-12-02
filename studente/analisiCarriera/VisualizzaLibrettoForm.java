package studente.analisiCarriera;
import java.awt.Dimension;
import java.awt.Toolkit;
import operatore.gestioneUtenti.Studente;

/**
 * Classe che rappresenta una vista del libretto di uno studente
 * @author  Demia Massaro
 */
public class VisualizzaLibrettoForm extends javax.swing.JFrame {
    
    /** Creates new form VisualizzaLibrettoForm */
    public VisualizzaLibrettoForm(Studente studente) {
        libretto = new Libretto(studente.getMatricola());
        initComponents();
        titleLabel.setText("Libretto di " + studente.getCognome() +" " +studente.getNome());
        
        this.setDefaultCloseOperation(this.HIDE_ON_CLOSE);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2 - this.getWidth()/2, dim.height/2 - this.getHeight()/2);
    }
    
    /** Questo metodo è chiamato dall'intento del costruttore per inizializzare
     * il form
     * Generato da NetBeans.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaEsami = new javax.swing.JTable();

        setTitle("C o f f e e - Vista del Libretto");

        titleLabel.setFont(new java.awt.Font("DejaVu Sans", 0, 18));
        titleLabel.setText("Libretto di");

        listaEsami.setModel(libretto);
        listaEsami.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(listaEsami);
        listaEsami.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable listaEsami;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
    private Libretto libretto;
}
