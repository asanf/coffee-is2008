package system;


import java.awt.Dimension;
import java.awt.Toolkit;
import operatore.gestioneUtenti.Docente;
import operatore.gestioneUtenti.Operatore;
import operatore.gestioneUtenti.Studente;
import operatore.gestioneUtenti.UtenteRegistrato;


public class RichiediAggiuntaAccountForm extends javax.swing.JFrame {
    
    /** Creates new form RichiediAggiuntaAccountForm */
    public RichiediAggiuntaAccountForm() {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2 - this.getWidth()/2, dim.height/2 - this.getHeight()/2);
        this.setResizable(false);
    }
    
    /** Questo metodo è chiamato dall'intento del costruttore per inizializzare
     * il form
     * Generato da NetBeans.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        nomeField = new javax.swing.JTextField();
        cognomeField = new javax.swing.JTextField();
        matricolaField = new javax.swing.JTextField();
        dataNascitaField = new javax.swing.JTextField();
        tipoAccountBox = new javax.swing.JComboBox();
        usernameField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        repeatedPasswordField = new javax.swing.JPasswordField();
        campoAggiuntivoLabel = new javax.swing.JLabel();
        campoAggiuntivoField = new javax.swing.JTextField();
        richiediAggiuntaAccountButton = new javax.swing.JButton();
        cleanButton = new javax.swing.JButton();

        setTitle("Coffee - Richiedi Nuovo Account");

        jLabel1.setText("Nome: ");

        jLabel2.setText("Cognome:");

        jLabel3.setText("Matricola:");

        jLabel4.setText("Tipo: ");

        jLabel5.setText("Data di nascita: ");

        jLabel6.setText("Nome utente:");

        jLabel7.setText("Password: ");

        jLabel8.setText("Ripeti Password:");

        matricolaField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matricolaFieldActionPerformed(evt);
            }
        });

        tipoAccountBox.setMaximumRowCount(3);
        tipoAccountBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Studente", "Docente", "Operatore" }));
        tipoAccountBox.setSelectedItem(tipoAccountBox);
        tipoAccountBox.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tipoAccountBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                tipoAccountBoxItemStateChanged(evt);
            }
        });

        campoAggiuntivoLabel.setText("Anno iscrizione: ");

        richiediAggiuntaAccountButton.setText("Inoltra Richiesta");
        richiediAggiuntaAccountButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                richiediAggiuntaAccountButtonMouseClicked(evt);
            }
        });

        cleanButton.setText("Azzera Campi");
        cleanButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cleanButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nomeField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                            .addComponent(cognomeField, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                            .addComponent(matricolaField, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                            .addComponent(dataNascitaField, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(campoAggiuntivoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(richiediAggiuntaAccountButton)
                            .addComponent(campoAggiuntivoField, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(repeatedPasswordField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(usernameField)
                                .addComponent(tipoAccountBox, 0, 118, Short.MAX_VALUE))
                            .addComponent(passwordField, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)))
                    .addComponent(cleanButton))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tipoAccountBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cognomeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(matricolaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7))
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(dataNascitaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(repeatedPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoAggiuntivoLabel)
                            .addComponent(campoAggiuntivoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(richiediAggiuntaAccountButton)
                    .addComponent(cleanButton))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void matricolaFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matricolaFieldActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_matricolaFieldActionPerformed

    private void tipoAccountBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_tipoAccountBoxItemStateChanged
        String selected = (String)tipoAccountBox.getSelectedItem();
        if(selected.equals("Studente"))
            campoAggiuntivoLabel.setText("Anno iscrizione:");
        else if(selected.equals("Docente"))
            campoAggiuntivoLabel.setText("Tipo contratto:");
        else if(selected.equals("Operatore"))
            campoAggiuntivoLabel.setText("Anno registrazione:");
    }//GEN-LAST:event_tipoAccountBoxItemStateChanged

    private void cleanButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cleanButtonMouseClicked
        nomeField.setText("");
        cognomeField.setText("");
        matricolaField.setText("");
        dataNascitaField.setText("");
        usernameField.setText("");
        passwordField.setText("");
        repeatedPasswordField.setText("");
        campoAggiuntivoField.setText("");
        tipoAccountBox.setSelectedIndex(0);
    }//GEN-LAST:event_cleanButtonMouseClicked

    private void richiediAggiuntaAccountButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_richiediAggiuntaAccountButtonMouseClicked
        
        UtenteRegistrato nuovoUtente;
        String selected = (String)tipoAccountBox.getSelectedItem();
        if(selected.equals("Studente")){
            nuovoUtente = new Studente();
            ((Studente)nuovoUtente).setAnnoImmatricolazione(Integer.parseInt(campoAggiuntivoField.getText()));
        }
        else if(selected.equals("Docente")){
            nuovoUtente = new Docente();
            ((Docente)nuovoUtente).setTipo(campoAggiuntivoField.getText());
        }
        else if(selected.equals("Operatore")){
            nuovoUtente = new Operatore();
            ((Operatore)nuovoUtente).setAnnoRegistrazione(Integer.parseInt(campoAggiuntivoField.getText()));
        }
    }//GEN-LAST:event_richiediAggiuntaAccountButtonMouseClicked
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campoAggiuntivoField;
    private javax.swing.JLabel campoAggiuntivoLabel;
    private javax.swing.JButton cleanButton;
    private javax.swing.JTextField cognomeField;
    private javax.swing.JTextField dataNascitaField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField matricolaField;
    private javax.swing.JTextField nomeField;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JPasswordField repeatedPasswordField;
    private javax.swing.JButton richiediAggiuntaAccountButton;
    private javax.swing.JComboBox tipoAccountBox;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
    
}
