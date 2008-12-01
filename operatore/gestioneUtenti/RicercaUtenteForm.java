package operatore.gestioneUtenti;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author  rhadamantis
 */
public class RicercaUtenteForm extends javax.swing.JFrame {
    
    /** Creates new form RicercaUtenteForm */
    public RicercaUtenteForm() {
        utenti = new UtentiRegistrati();
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2 - this.getWidth()/2, dim.height/2 - this.getHeight()/2);
        this.setResizable(false);
    }
    
    /** Questo metodo è chiamato all'interno del costruttore per inizializzare
     * il form.
     * Generato da NetBeans
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        matricolaField = new javax.swing.JTextField();
        ricercaUtenteButton = new javax.swing.JButton();
        modificaUtenteButton = new javax.swing.JButton();
        eliminaUtenteButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cognomeField = new javax.swing.JTextField();
        nomeField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabellaRisultati = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setTitle("C o f f e e - Modifica Utente Registrato");

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 0, 24));
        jLabel1.setText("Ricerca Utente Registrato");

        jLabel2.setText("Marticola:");

        matricolaField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                matricolaFieldKeyPressed(evt);
            }
        });

        ricercaUtenteButton.setText("Cerca Utente");
        ricercaUtenteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ricercaUtenteButtonMouseClicked(evt);
            }
        });

        modificaUtenteButton.setText("Modifica Utente");
        modificaUtenteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modificaUtenteButtonMouseClicked(evt);
            }
        });

        eliminaUtenteButton.setText("Elimina Utente");
        eliminaUtenteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eliminaUtenteButtonMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("DejaVu Sans", 2, 13));
        jLabel3.setText("Completare i campi di ricerca");

        jLabel4.setText("Nome:");

        jLabel5.setText("Cognome:");

        tabellaRisultati.setModel(utenti);
        jScrollPane1.setViewportView(tabellaRisultati);

        jButton1.setText("Visualizza scheda Utente");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(215, 215, 215))
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(modificaUtenteButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eliminaUtenteButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nomeField)
                            .addComponent(cognomeField)
                            .addComponent(matricolaField, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addComponent(ricercaUtenteButton))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(matricolaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cognomeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ricercaUtenteButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(nomeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modificaUtenteButton)
                    .addComponent(jButton1)
                    .addComponent(eliminaUtenteButton))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void matricolaFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_matricolaFieldKeyPressed
        
}//GEN-LAST:event_matricolaFieldKeyPressed

    private void ricercaUtenteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ricercaUtenteButtonMouseClicked
        GestioneUtentiControl control = new GestioneUtentiControl ();
        utenti.setData(control.ricercaUtenteRegistrato(matricolaField.getText(), cognomeField.getText(),nomeField.getText()));
        
}//GEN-LAST:event_ricercaUtenteButtonMouseClicked

    private void modificaUtenteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificaUtenteButtonMouseClicked
     int selectedRow = tabellaRisultati.getSelectedRow();
      if(selectedRow<0)
            JOptionPane.showMessageDialog(null, "Nessun esame selezionato");
        else{
            modificaUtenteRegistratoForm esForm = new modificaUtenteRegistratoForm(utenti.get(selectedRow));
            esForm.setVisible(true);
            GestioneUtentiControl control = new GestioneUtentiControl();
            utenti.setData(control.ricercaUtenteRegistrato("", "", ""));
        }
}//GEN-LAST:event_modificaUtenteButtonMouseClicked

    private void eliminaUtenteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminaUtenteButtonMouseClicked
       GestioneUtentiControl control = new GestioneUtentiControl();
       int selectedRow = tabellaRisultati.getSelectedRow();
       if(selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Nessun utente selezionato","Errore nella selezione dell'utente", JOptionPane.ERROR_MESSAGE);}
       else {
       control.eliminaUtenteRegistrato(utenti.get(selectedRow));
       utenti.setData(control.ricercaUtenteRegistrato("", "", ""));
       }
}//GEN-LAST:event_eliminaUtenteButtonMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
           int selectedRow = tabellaRisultati.getSelectedRow();
        if(selectedRow < 0)
            JOptionPane.showMessageDialog(null, "Nessun utente selezionato");
        else{
            VisualizzaSchedaUtenteForm esScheda = new VisualizzaSchedaUtenteForm(utenti.get(selectedRow));
            esScheda.setVisible(true);
        }
    }//GEN-LAST:event_jButton1MouseClicked
    

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cognomeField;
    private javax.swing.JButton eliminaUtenteButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField matricolaField;
    private javax.swing.JButton modificaUtenteButton;
    private javax.swing.JTextField nomeField;
    private javax.swing.JButton ricercaUtenteButton;
    private javax.swing.JTable tabellaRisultati;
    // End of variables declaration//GEN-END:variables
    private UtentiRegistrati utenti;
}