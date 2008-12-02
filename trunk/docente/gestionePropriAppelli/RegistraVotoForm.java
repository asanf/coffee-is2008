package docente.gestionePropriAppelli;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import javax.swing.JOptionPane;
import operatore.gestioneAppelli.Appello;

/**
 * Classe che gestisce il form per registrare il voto di un esame ad uno studente
 * @author  Antonio Sanfelice
 */
public class RegistraVotoForm extends javax.swing.JFrame {
    
    
    public RegistraVotoForm(Appello appello, Prenotato prenotato) {
        initComponents();
        this.prenotato = prenotato;
        this.appello = appello;
        prenotatoLabel.setText(prenotato.getCognome()+", "+prenotato.getNome()+", mat: "+prenotato.getMatrStudente());
        
    }
    
    /** Questo metodo è chiamato all'interno del costruttore per inizializzare il form.
     *  Generato da NetBeans
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        prenotatoLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        votoField = new javax.swing.JTextField();
        lodeCheck = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        dataField = new javax.swing.JTextField();
        registraVotoButton = new javax.swing.JButton();

        jCheckBox1.setText("jCheckBox1");

        setTitle("Registra Voto");

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 0, 18));
        jLabel1.setText("Valutazione per lo studente:");

        jLabel2.setText("Voto:");

        lodeCheck.setText("Lode");
        lodeCheck.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lodeCheckMouseClicked(evt);
            }
        });

        jLabel3.setText("Data:");

        registraVotoButton.setText("Registra Voto");
        registraVotoButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registraVotoButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(prenotatoLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(dataField))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(votoField, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(registraVotoButton)
                            .addComponent(lodeCheck))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(prenotatoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lodeCheck)
                    .addComponent(votoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(dataField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registraVotoButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void lodeCheckMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lodeCheckMouseClicked
        if(Integer.parseInt(votoField.getText())<30){
            JOptionPane.showMessageDialog(null, "Impossibile assegnare la lode con vodo inferiore a 30");
            lodeCheck.setContentAreaFilled(false);
        }
    }//GEN-LAST:event_lodeCheckMouseClicked

    private void registraVotoButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registraVotoButtonMouseClicked
        try{
            GestionePropriAppelliControlInterface gpac = (GestionePropriAppelliControlInterface)Naming.lookup("rmi://localhost/GestionePropriAppelli");
            gpac.RegistraVoto(appello, prenotato, Integer.parseInt(votoField.getText()), lodeCheck.isSelected(), dataField.getText());
        }catch(RemoteException e){
            JOptionPane.showMessageDialog(null, "Errore connessione remota:\n"+e);
        }catch(MalformedURLException e){
            JOptionPane.showMessageDialog(null, "URL oggetto remoto errato:\n"+e);
        }catch(NotBoundException e){
            JOptionPane.showMessageDialog(null, "Nessun bound per l'oggetto richiesto:\n"+e);
        }
    }//GEN-LAST:event_registraVotoButtonMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField dataField;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JCheckBox lodeCheck;
    private javax.swing.JLabel prenotatoLabel;
    private javax.swing.JButton registraVotoButton;
    private javax.swing.JTextField votoField;
    // End of variables declaration//GEN-END:variables
    private Appello appello;
    private Prenotato prenotato;
}
