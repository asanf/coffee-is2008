package studente.analisiCarriera;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import javax.swing.JOptionPane;
import operatore.gestioneUtenti.Studente;

/**
 * Classe che modella il form dell'analisi della carriera di uno studente 
 * @author  Demia Massaro
 */
public class AnalisiCarrieraForm extends javax.swing.JFrame {
    
    public AnalisiCarrieraForm(Studente studente) {
        initComponents();
        this.studente = studente;
        matricolaLabel.setText("Matricola: " + studente.getMatricola());
        studenteLabel.setText("Studente: " + studente.getCognome() + " " + studente.getNome());
        this.setDefaultCloseOperation(this.HIDE_ON_CLOSE);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2 - this.getWidth()/2, dim.height/2 - this.getHeight()/2);
    }
    
    /** Questo metodo è chiamato all'interno del costruttore per inizializzare
     * il form
     * Generato da NetBeans
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AnalisiCarrieraTitleLabel = new javax.swing.JLabel();
        studenteLabel = new javax.swing.JLabel();
        matricolaLabel = new javax.swing.JLabel();
        visualizzaLibrettoButton = new javax.swing.JButton();
        visualizzaStatisticheButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("C o f f e e - Analisi Carriera");

        AnalisiCarrieraTitleLabel.setFont(new java.awt.Font("DejaVu Sans", 0, 24));
        AnalisiCarrieraTitleLabel.setText("Analisi Carriera");

        studenteLabel.setText("Studente: ");

        matricolaLabel.setText("Matricola: ");

        visualizzaLibrettoButton.setText("Visualizza Libretto");
        visualizzaLibrettoButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                visualizzaLibrettoButtonMouseClicked(evt);
            }
        });

        visualizzaStatisticheButton.setText("Visualizza Statistiche");
        visualizzaStatisticheButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                visualizzaStatisticheButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AnalisiCarrieraTitleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                    .addComponent(matricolaLabel)
                    .addComponent(studenteLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(visualizzaLibrettoButton)
                        .addGap(18, 18, 18)
                        .addComponent(visualizzaStatisticheButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(AnalisiCarrieraTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(studenteLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(matricolaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(visualizzaLibrettoButton)
                    .addComponent(visualizzaStatisticheButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void visualizzaLibrettoButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_visualizzaLibrettoButtonMouseClicked
        try{
            LibrettoControlInterface libcont = (LibrettoControlInterface)Naming.lookup("rmi://localhost/AnalisiCarriera");
            libcont.visualizzaLibretto(studente);
        }catch(RemoteException e){
            JOptionPane.showMessageDialog(null, "Errore remoto:\n"+e.getMessage());
        }catch(MalformedURLException e){
            JOptionPane.showMessageDialog(null, "URL errato:\n"+e.getMessage());
        }catch(NotBoundException e){
            JOptionPane.showMessageDialog(null, "Nessun Bound per GestioneAppelli:\n"+e.getMessage());
        }
    }//GEN-LAST:event_visualizzaLibrettoButtonMouseClicked

    private void visualizzaStatisticheButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_visualizzaStatisticheButtonMouseClicked
        try{
            LibrettoControlInterface libControl = (LibrettoControlInterface)Naming.lookup("rmi://localhost/AnalisiCarriera");
            libControl.visualizzaStatistiche(studente.getMatricola());
        }catch(RemoteException e){
            JOptionPane.showMessageDialog(null, "Errore remoto:\n"+e.getMessage());
        }catch(MalformedURLException e){
            JOptionPane.showMessageDialog(null, "URL errato:\n"+e.getMessage());
        }catch(NotBoundException e){
            JOptionPane.showMessageDialog(null, "Nessun Bound per GestioneAppelli:\n"+e.getMessage());
        }    
    }//GEN-LAST:event_visualizzaStatisticheButtonMouseClicked

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AnalisiCarrieraTitleLabel;
    private javax.swing.JLabel matricolaLabel;
    private javax.swing.JLabel studenteLabel;
    private javax.swing.JButton visualizzaLibrettoButton;
    private javax.swing.JButton visualizzaStatisticheButton;
    // End of variables declaration//GEN-END:variables
    private Studente studente;
}
