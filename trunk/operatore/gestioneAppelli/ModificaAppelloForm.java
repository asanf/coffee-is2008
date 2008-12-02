package operatore.gestioneAppelli;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.net.MalformedURLException;
import java.rmi.*;
import javax.swing.JOptionPane;

/**
 * Gestiosce il fomr per la modifica di un appello esistente
 * @author Antonio Sanfelice
 */
public class ModificaAppelloForm extends javax.swing.JFrame {
    
    /** Creates new form ModificaAppelloForm */
    public ModificaAppelloForm(Appello appello) {
        this.appello = appello;
        initComponents();
        setFields(appello);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2 - this.getWidth()/2, dim.height/2 - this.getHeight()/2);
    }
    
    /** Metodo richiamato all'interno del costruttore per inizializzare il form
     * Generato da NetBeans
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        esameField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        docenteField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tipologiaField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        dataField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        durataField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        vincoliField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        oraInizioField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        aulaField = new javax.swing.JTextField();
        modificaAppelloButton = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        creditiField = new javax.swing.JTextField();

        setTitle("Coffee - Modifica Appello");

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 0, 18));
        jLabel1.setText("Modifica Appello");

        jLabel2.setText("Esame: ");

        jLabel3.setText("Docente:");

        docenteField.setEditable(false);

        jLabel4.setText("Tipologia:");

        jLabel5.setText("Data:");

        jLabel6.setText("Durata:");

        jLabel7.setText("Vincoli:");

        jLabel8.setText("Ora Inizio:");

        jLabel9.setText("Aula:");

        modificaAppelloButton.setText("Modifica");
        modificaAppelloButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modificaAppelloButtonMouseClicked(evt);
            }
        });

        jLabel10.setText("Crediti:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(modificaAppelloButton)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel10))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(vincoliField, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                            .addComponent(durataField, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                            .addComponent(dataField, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tipologiaField)
                                .addComponent(docenteField)
                                .addComponent(esameField, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                            .addComponent(oraInizioField, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                            .addComponent(aulaField, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                            .addComponent(creditiField, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))))
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
                    .addComponent(esameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(docenteField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tipologiaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(dataField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(durataField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(vincoliField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(oraInizioField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(aulaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(modificaAppelloButton))
                    .addComponent(creditiField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void modificaAppelloButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificaAppelloButtonMouseClicked
        
        Appello newAppello = new Appello(0,
                                    esameField.getText(),
                                    dataField.getText(),
                                    docenteField.getText(),
                                    tipologiaField.getText(),
                                    oraInizioField.getText(),
                                    Integer.parseInt(durataField.getText()),
                                    vincoliField.getText(),
                                    aulaField.getText(),
                                    Integer.parseInt(creditiField.getText()));
        try{
            AppelloControlInterface appCont = (AppelloControlInterface)Naming.lookup(("rmi://localhost/GestioneAppelli"));
            appCont.modificaAppello(appello, newAppello);
        }catch(RemoteException e){
            JOptionPane.showMessageDialog(null, "Errore remoto:\n"+e.getMessage());
        }catch(MalformedURLException e){
            JOptionPane.showMessageDialog(null, "URL errato:\n"+e.getMessage());
        }catch(NotBoundException e){
            JOptionPane.showMessageDialog(null, "Nessun Bound per GestioneAppelli:\n"+e.getMessage());
        }
        this.setVisible(false);
}//GEN-LAST:event_modificaAppelloButtonMouseClicked
    
    private void setFields(Appello appello){
        esameField.setText(appello.getEsame());
        docenteField.setText(appello.getDocente());
        tipologiaField.setText(appello.getTipologia());
        dataField.setText(appello.getData());
        oraInizioField.setText(appello.getOraInizio());
        durataField.setText(""+appello.getDurata());
        vincoliField.setText(appello.getVincoli());
        aulaField.setText(appello.getAula());
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aulaField;
    private javax.swing.JTextField creditiField;
    private javax.swing.JTextField dataField;
    private javax.swing.JTextField docenteField;
    private javax.swing.JTextField durataField;
    private javax.swing.JTextField esameField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton modificaAppelloButton;
    private javax.swing.JTextField oraInizioField;
    private javax.swing.JTextField tipologiaField;
    private javax.swing.JTextField vincoliField;
    // End of variables declaration//GEN-END:variables
    Appello appello;
}
