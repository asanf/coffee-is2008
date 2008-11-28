package operatore.gestioneUtenti;

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(123, 123, 123))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap(240, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nomeField)
                                    .addComponent(cognomeField)
                                    .addComponent(matricolaField, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ricercaUtenteButton))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(modificaUtenteButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 186, Short.MAX_VALUE)
                                .addComponent(eliminaUtenteButton)))
                        .addGap(27, 27, 27))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                    .addComponent(eliminaUtenteButton))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void matricolaFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_matricolaFieldKeyPressed
        
}//GEN-LAST:event_matricolaFieldKeyPressed

    private void ricercaUtenteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ricercaUtenteButtonMouseClicked
        GestioneUtentiControl control = new GestioneUtentiControl ();
        utenti.setData(control.ricercaUtente(matricolaField.getText(), cognomeField.getText(),nomeField.getText()));
        
}//GEN-LAST:event_ricercaUtenteButtonMouseClicked

    private void modificaUtenteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificaUtenteButtonMouseClicked
     int selectedRow = tabellaRisultati.getSelectedRow();
      if(selectedRow<0)
            JOptionPane.showMessageDialog(null, "Nessun esame selezionato");
        else{
            modificaUtenteRegistratoForm esForm = new modificaUtenteRegistratoForm(utenti.get(selectedRow));
            esForm.setVisible(true);
            GestioneUtentiControl control = new GestioneUtentiControl();
            utenti.setData(control.ricercaUtente("", "", ""));
        }
}//GEN-LAST:event_modificaUtenteButtonMouseClicked

    private void eliminaUtenteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminaUtenteButtonMouseClicked
       GestioneUtentiControl control = new GestioneUtentiControl();
       int selectedRow = tabellaRisultati.getSelectedRow();
       if(selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Nessun utente selezionato","Errore nella selezione dell'utente", JOptionPane.ERROR_MESSAGE);}
       else {
       control.eliminaUtente(utenti.get(selectedRow));
       utenti.setData(control.ricercaUtente("", "", ""));
       }
}//GEN-LAST:event_eliminaUtenteButtonMouseClicked
    

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cognomeField;
    private javax.swing.JButton eliminaUtenteButton;
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