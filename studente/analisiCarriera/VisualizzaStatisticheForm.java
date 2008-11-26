package studente.analisiCarriera;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 * Classe che modella la vista delle statische degli esami per un dato studente  
 * @author  e-vampire
 */
public class VisualizzaStatisticheForm extends javax.swing.JFrame {
    
    /** Creates new form VisualizzaStatisticheForm */
    public VisualizzaStatisticheForm(String mediaAritmetica, String votoDiLaurea){
            initComponents();
            mediaAritmeticaLabel.setText(mediaAritmetica);
            votoLaureaStimatoLabel.setText(votoDiLaurea);
            this.setDefaultCloseOperation(this.HIDE_ON_CLOSE);
            Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
            this.setLocation(dim.width / 2 - this.getWidth() / 2, dim.height / 2 - this.getHeight() / 2);
       
    }
    
    /** Questo metodo è chiamato dall'intento del costruttore per inizializzare
     * il form
     * Generato da NetBeans.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        statisticheTitle = new javax.swing.JLabel();
        promptMediaAritmetica = new javax.swing.JLabel();
        promptVotoLaurea = new javax.swing.JLabel();
        mediaAritmeticaLabel = new javax.swing.JLabel();
        votoLaureaStimatoLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        statisticheTitle.setFont(new java.awt.Font("DejaVu Sans", 0, 18));
        statisticheTitle.setText("Statistiche");

        promptMediaAritmetica.setText("Media Aritmetica: ");

        promptVotoLaurea.setText("Voto di laurea atteso: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(statisticheTitle)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(promptMediaAritmetica)
                            .addComponent(promptVotoLaurea))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(votoLaureaStimatoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(mediaAritmeticaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(statisticheTitle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(promptMediaAritmetica)
                    .addComponent(mediaAritmeticaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(promptVotoLaurea)
                    .addComponent(votoLaureaStimatoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel mediaAritmeticaLabel;
    private javax.swing.JLabel promptMediaAritmetica;
    private javax.swing.JLabel promptVotoLaurea;
    private javax.swing.JLabel statisticheTitle;
    private javax.swing.JLabel votoLaureaStimatoLabel;
    // End of variables declaration//GEN-END:variables
    
}
