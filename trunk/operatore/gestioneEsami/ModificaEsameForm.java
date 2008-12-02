
package operatore.gestioneEsami;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import javax.swing.JOptionPane;

/**
 * Classe che gestiosce il form per la modifica di un esame
 * @author Vincenzo Alessandro Cavaso
 */
public class ModificaEsameForm extends javax.swing.JFrame {
    
    
    public ModificaEsameForm(Esame esame) {
        initComponents();
        this.esame = esame;
        setFields(esame);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2 - this.getWidth()/2, dim.height/2 - this.getHeight()/2);
        this.setResizable(false);
    }
    
    /** Metodo richiamato all'interno del costruttore per inizializzare il form
     * Generato da NetBeans
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nomeField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        creditiField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        semestreField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        oreFrontaliField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        oreLaboratorioField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        programmaField = new javax.swing.JTextField();
        modificaEsameButton = new javax.swing.JButton();
        ripristinaCampiButton = new javax.swing.JButton();

        setTitle("Modifica Esame");

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 0, 18));
        jLabel1.setText("Modifica Esame");

        jLabel2.setText("Nome:");

        jLabel3.setText("Crediti:");

        jLabel4.setText("Semestre:");

        jLabel5.setText("Ore Frontali:");

        jLabel6.setText("Ore Laboratorio:");

        jLabel7.setText("Programma:");

        modificaEsameButton.setText("Modifica");
        modificaEsameButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modificaEsameButtonMouseClicked(evt);
            }
        });

        ripristinaCampiButton.setText("Ripristina Campi");
        ripristinaCampiButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ripristinaCampiButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(programmaField, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                            .addComponent(oreLaboratorioField, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                            .addComponent(oreFrontaliField, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                            .addComponent(semestreField, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                            .addComponent(creditiField, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                            .addComponent(nomeField, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(modificaEsameButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ripristinaCampiButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nomeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(creditiField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(semestreField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(oreFrontaliField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(oreLaboratorioField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(programmaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modificaEsameButton)
                    .addComponent(ripristinaCampiButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ripristinaCampiButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ripristinaCampiButtonMouseClicked
        setFields(esame);
}//GEN-LAST:event_ripristinaCampiButtonMouseClicked

    private void modificaEsameButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificaEsameButtonMouseClicked
        Esame newEsame = new Esame();
        newEsame.setNome(nomeField.getText());
        newEsame.setCrediti(Integer.parseInt(creditiField.getText()));
        newEsame.setOreFrontali(Integer.parseInt(oreFrontaliField.getText()));
        newEsame.setOreLaboratoro(Integer.parseInt(oreLaboratorioField.getText()));
        newEsame.setSemestre(Integer.parseInt(semestreField.getText()));
        newEsame.setProgramma(programmaField.getText());
        try{
            EsameControlInterface esCont = (EsameControlInterface)Naming.lookup("rmi://localhost/GestioneEsami");
            esCont.modificaEsame(esame, newEsame);
        }catch(RemoteException e){
            JOptionPane.showMessageDialog(null, "Errore remoto:\n"+e.getMessage());
        }catch(MalformedURLException e){
            JOptionPane.showMessageDialog(null, "URL errato:\n"+e.getMessage());
        }catch(NotBoundException e){
            JOptionPane.showMessageDialog(null, "Nessun Bound per GestioneAppelli:\n"+e.getMessage());
        }
        setVisible(false);
    }//GEN-LAST:event_modificaEsameButtonMouseClicked
    
    private void setFields(Esame esame){
        nomeField.setText(esame.getNome());
        creditiField.setText(""+esame.getCrediti());
        programmaField.setText(esame.getProgramma());
        oreLaboratorioField.setText(""+esame.getOreLaboratoro());
        oreFrontaliField.setText(""+esame.getOreFrontali());
        semestreField.setText(""+esame.getSemestre());
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField creditiField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton modificaEsameButton;
    private javax.swing.JTextField nomeField;
    private javax.swing.JTextField oreFrontaliField;
    private javax.swing.JTextField oreLaboratorioField;
    private javax.swing.JTextField programmaField;
    private javax.swing.JButton ripristinaCampiButton;
    private javax.swing.JTextField semestreField;
    // End of variables declaration//GEN-END:variables
    Esame esame;
}
