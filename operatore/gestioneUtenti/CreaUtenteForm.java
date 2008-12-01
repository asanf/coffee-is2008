package operatore.gestioneUtenti;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author  rhadamantis
 */
public class CreaUtenteForm extends javax.swing.JFrame {
    
    /** Creates new form CreaUtenteForm */

   
    public CreaUtenteForm() {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2 - this.getWidth()/2, dim.height/2 - this.getHeight()/2);
        this.setResizable(false);
    }
    
    /** Questo metodo è chimamato all'interno del costruttore per inizializzare
     *  il form
     * Generato da NetBeans
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NomeFormLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tipoAccountBox = new javax.swing.JComboBox();
        campoAggiuntivoLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        nomeField = new javax.swing.JTextField();
        cognomeField = new javax.swing.JTextField();
        dataNascitaField = new javax.swing.JTextField();
        campoAggiuntivoField = new javax.swing.JTextField();
        usernameField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        repeatedPasswordField = new javax.swing.JPasswordField();
        matricolaField = new javax.swing.JTextField();
        cleanButton = new javax.swing.JButton();
        richiediAggiuntaAccountUtenteButton = new javax.swing.JButton();
        controDisponibilitàButton = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        indirizzoField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        setTitle("C o f f e e - Creazione nuovo utente");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        NomeFormLabel.setFont(new java.awt.Font("DejaVu Sans", 0, 24));
        NomeFormLabel.setText("Creazione Nuovo Utente");

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 2, 13));
        jLabel1.setText("Inserire i dati del nuovo utente");

        jLabel2.setText("Nome:");

        jLabel3.setText("Cognome:");

        tipoAccountBox.setMaximumRowCount(3);
        tipoAccountBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Studente", "Docente", "Operatore" }));
        tipoAccountBox.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tipoAccountBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                tipoAccountBoxItemStateChanged(evt);
            }
        });

        campoAggiuntivoLabel.setText("Anno iscrizione: ");

        jLabel4.setFont(new java.awt.Font("DejaVu Sans", 2, 13));
        jLabel4.setText("Seleziona il tipo di utente");

        jLabel5.setText("Matricola:");

        jLabel6.setText("Data di nascita: ");

        jLabel7.setText("Nome utente:");

        jLabel8.setText("Password: ");

        jLabel9.setText("Ripeti Password:");

        matricolaField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matricolaFieldActionPerformed(evt);
            }
        });

        cleanButton.setText("Azzera Campi");
        cleanButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cleanButtonMouseClicked(evt);
            }
        });

        richiediAggiuntaAccountUtenteButton.setText("Invia");
        richiediAggiuntaAccountUtenteButton.setEnabled(false);
        richiediAggiuntaAccountUtenteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                richiediAggiuntaAccountUtenteButtonMouseClicked(evt);
            }
        });

        controDisponibilitàButton.setText("Controlla disponibilità");
        controDisponibilitàButton.setToolTipText("Premere questo button per controllare la disponibilità del nome Utente");
        controDisponibilitàButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                controDisponibilitàButtonMouseClicked(evt);
            }
        });

        jLabel10.setText("Indirizzo:");

        jLabel11.setFont(new java.awt.Font("DejaVu Sans", 0, 10));
        jLabel11.setText("mini 6 - max 10 caratteri");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(NomeFormLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
                .addGap(119, 119, 119))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(359, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tipoAccountBox, 0, 152, Short.MAX_VALUE)
                        .addGap(132, 132, 132))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGap(235, 235, 235))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(richiediAggiuntaAccountUtenteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 332, Short.MAX_VALUE)
                .addComponent(cleanButton)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(39, 39, 39))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(62, 62, 62)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cognomeField, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                            .addComponent(indirizzoField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                            .addComponent(nomeField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6))
                            .addComponent(campoAggiuntivoLabel))
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(campoAggiuntivoField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                            .addComponent(dataNascitaField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE))
                        .addGap(12, 12, 12)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel11))
                    .addComponent(usernameField, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                    .addComponent(controDisponibilitàButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(matricolaField, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(passwordField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                    .addComponent(repeatedPasswordField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NomeFormLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tipoAccountBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(matricolaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cognomeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(controDisponibilitàButton)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(indirizzoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jLabel8)
                        .addComponent(dataNascitaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(campoAggiuntivoLabel)
                        .addComponent(campoAggiuntivoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(repeatedPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(richiediAggiuntaAccountUtenteButton)
                    .addComponent(cleanButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tipoAccountBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_tipoAccountBoxItemStateChanged
        String selected = (String)tipoAccountBox.getSelectedItem();
        if(selected.equals("Studente"))
            campoAggiuntivoLabel.setText("Anno iscrizione:");
        else if(selected.equals("Docente"))
            campoAggiuntivoLabel.setText("Tipo contratto:");
        else if(selected.equals("Operatore"))
            campoAggiuntivoLabel.setText("Anno registrazione:");
    }//GEN-LAST:event_tipoAccountBoxItemStateChanged

    private void matricolaFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matricolaFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_matricolaFieldActionPerformed

    private void cleanButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cleanButtonMouseClicked
        nomeField.setText("");
        cognomeField.setText("");
        matricolaField.setText("");
        dataNascitaField.setText("");
        indirizzoField.setText("");
        usernameField.setText("");
        passwordField.setText("");
        repeatedPasswordField.setText("");
        campoAggiuntivoField.setText("");
        tipoAccountBox.setSelectedIndex(0);
    }//GEN-LAST:event_cleanButtonMouseClicked

    private void richiediAggiuntaAccountUtenteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_richiediAggiuntaAccountUtenteButtonMouseClicked
        
        if (richiediAggiuntaAccountUtenteButton.isEnabled()) {
            System.out.println("Tenta l'insrimento");
            if (passwordField.getText().length()<6 || passwordField.getText().length()>10) {
            JOptionPane.showMessageDialog(null,"Password non valida, inserire una password di minimo 6 caratteri e massimo 10", "Errore nell'inserimento dei dati",JOptionPane.ERROR_MESSAGE);
            return;
            }   
        if (passwordField.getText().compareTo(repeatedPasswordField.getText()) !=0 ) JOptionPane.showMessageDialog(null,"Password non ripetuta correttamente","Errore nell'inserimento dei dati",JOptionPane.ERROR_MESSAGE);//GEN-LAST:event_richiediAggiuntaAccountUtenteButtonMouseClicked
            else{
           
                UtenteRegistrato newUtente = new UtenteRegistrato ();
                newUtente.setNome(nomeField.getText());
                newUtente.setCognome(cognomeField.getText());
                newUtente.setDataNascita(dataNascitaField.getText());
                newUtente.setMatricola(matricolaField.getText()); 
                newUtente.setLogin(usernameField.getText());
                newUtente.setIndirizzo(indirizzoField.getText());
                newUtente.setPassword(passwordField.getText());
                
                GestioneUtentiControl control = new GestioneUtentiControl ();
                int indice = tipoAccountBox.getSelectedIndex();
                String campoAggiuntivo = campoAggiuntivoField.getText();
                control.creaUtenteRegistrato(newUtente, indice, campoAggiuntivo);
                this.setVisible(false);
            }
        }
        else
        {  System.out.println("ESCE DIRETTAMENTE");
            return;}
}

    private void controDisponibilitàButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_controDisponibilitàButtonMouseClicked
        if (usernameField.getText().equals("")) {JOptionPane.showMessageDialog(null,"Il campo nome utente deve essere compilato", "Errore nell'inserimento dei dati",JOptionPane.ERROR_MESSAGE);}
            else {
            GestioneUtentiControl control = new GestioneUtentiControl();
            boolean esito =control.checkUsernameUtente(usernameField.getText());
                if (esito==true) {JOptionPane.showMessageDialog(null,"Il nome utente è già utilizzato, modificarlo.", "Errore nell'inserimento dei dati",JOptionPane.ERROR_MESSAGE);}
            else{JOptionPane.showMessageDialog(null, "Il nome utente scelto è disponibile","Usarname disponibile",JOptionPane.INFORMATION_MESSAGE);}
            richiediAggiuntaAccountUtenteButton.setEnabled(!esito);}
}//GEN-LAST:event_controDisponibilitàButtonMouseClicked
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreaUtenteForm().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NomeFormLabel;
    private javax.swing.JTextField campoAggiuntivoField;
    private javax.swing.JLabel campoAggiuntivoLabel;
    private javax.swing.JButton cleanButton;
    private javax.swing.JTextField cognomeField;
    private javax.swing.JButton controDisponibilitàButton;
    private javax.swing.JTextField dataNascitaField;
    private javax.swing.JTextField indirizzoField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField matricolaField;
    private javax.swing.JTextField nomeField;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JPasswordField repeatedPasswordField;
    private javax.swing.JButton richiediAggiuntaAccountUtenteButton;
    private javax.swing.JComboBox tipoAccountBox;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
    
}
