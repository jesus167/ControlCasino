/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.pgy2121;

/**
 *
 * @author JP
 */
public class Consumos extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public Consumos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tittleConsumoLabel = new java.awt.Label();
        consInstructionRutLebel = new javax.swing.JLabel();
        consAddButt = new javax.swing.JButton();
        consClientRutLabel = new javax.swing.JLabel();
        consClientRutField = new javax.swing.JTextField();
        consInstructionSelectLabel = new javax.swing.JLabel();
        consDesButt = new javax.swing.JCheckBox();
        consAlmButt = new javax.swing.JCheckBox();
        consCenaButt = new javax.swing.JCheckBox();
        consCFButt = new javax.swing.JCheckBox();
        consCNButt = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tittleConsumoLabel.setAlignment(java.awt.Label.CENTER);
        tittleConsumoLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tittleConsumoLabel.setText("CONSUMOS");

        consInstructionRutLebel.setText("1. Ingrese el rut del Cliente");

        consAddButt.setText("Aceptar");

        consClientRutLabel.setText("Rut (12345678-4)");

        consClientRutField.setMaximumSize(new java.awt.Dimension(200, 25));
        consClientRutField.setMinimumSize(new java.awt.Dimension(200, 25));
        consClientRutField.setPreferredSize(new java.awt.Dimension(200, 25));
        consClientRutField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consClientRutFieldActionPerformed(evt);
            }
        });

        consInstructionSelectLabel.setText("2. Seleccione el tipo de consumo");

        consDesButt.setText("Desayuno");
        consDesButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consDesButtActionPerformed(evt);
            }
        });

        consAlmButt.setText("Almuerzo");

        consCenaButt.setText("Cena");

        consCFButt.setText("Colación Fria");

        consCNButt.setText("Colación Noche");
        consCNButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consCNButtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tittleConsumoLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(consInstructionRutLebel)
                            .addComponent(consInstructionSelectLabel))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(consClientRutLabel)
                        .addGap(18, 18, 18)
                        .addComponent(consClientRutField, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(consAddButt)
                .addGap(29, 29, 29))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(consCenaButt, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(consAlmButt, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(consDesButt, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(consCFButt, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(consCNButt)
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tittleConsumoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(consInstructionRutLebel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(consClientRutField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(consClientRutLabel))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(consAddButt)
                        .addGap(27, 27, 27))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(consInstructionSelectLabel)
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(consDesButt)
                            .addComponent(consCFButt))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(consAlmButt)
                            .addComponent(consCNButt))
                        .addGap(18, 18, 18)
                        .addComponent(consCenaButt)
                        .addContainerGap(55, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void consDesButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consDesButtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_consDesButtActionPerformed

    private void consCNButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consCNButtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_consCNButtActionPerformed

    private void consClientRutFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consClientRutFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_consClientRutFieldActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Consumos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consumos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consumos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consumos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consumos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton consAddButt;
    private javax.swing.JCheckBox consAlmButt;
    private javax.swing.JCheckBox consCFButt;
    private javax.swing.JCheckBox consCNButt;
    private javax.swing.JCheckBox consCenaButt;
    private javax.swing.JTextField consClientRutField;
    private javax.swing.JLabel consClientRutLabel;
    private javax.swing.JCheckBox consDesButt;
    private javax.swing.JLabel consInstructionRutLebel;
    private javax.swing.JLabel consInstructionSelectLabel;
    private java.awt.Label tittleConsumoLabel;
    // End of variables declaration//GEN-END:variables
}
