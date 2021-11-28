/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import cl.duoc.pgy2121.Auditoria;
import cl.duoc.pgy2121.BorrarUsuario;
import cl.duoc.pgy2121.Consumos;
import cl.duoc.pgy2121.RegistroUsuario;

/**
 *
 * @author JP
 */
public class MenuInicio extends javax.swing.JFrame {

    /**
     * Creates new form MenuInicio
     */
    public MenuInicio() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        createUser = new javax.swing.JMenuItem();
        updateUser = new javax.swing.JMenuItem();
        deleteUser = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        registroCliente = new javax.swing.JMenuItem();
        regConsumption = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        generateRecord = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Principal");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel1.setText("Casino");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel2.setText("Duoc Uc");

        jMenu1.setText("Usuario");

        createUser.setText("Crear Usuario");
        createUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createUserActionPerformed(evt);
            }
        });
        jMenu1.add(createUser);

        updateUser.setText("Actualizar Usuario");
        updateUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateUserActionPerformed(evt);
            }
        });
        jMenu1.add(updateUser);

        deleteUser.setText("Borrar Usuario");
        deleteUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteUserActionPerformed(evt);
            }
        });
        jMenu1.add(deleteUser);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Casino");

        registroCliente.setText("Area Cliente");
        registroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registroClienteActionPerformed(evt);
            }
        });
        jMenu3.add(registroCliente);

        regConsumption.setText("Registro Consumo");
        regConsumption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regConsumptionActionPerformed(evt);
            }
        });
        jMenu3.add(regConsumption);

        jMenuBar1.add(jMenu3);

        jMenu2.setText("Auditoría");

        generateRecord.setText("Generar Informe");
        generateRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateRecordActionPerformed(evt);
            }
        });
        jMenu2.add(generateRecord);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(122, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120))
            .addGroup(layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createUserActionPerformed
        RegistroUsuario vmRU = new RegistroUsuario();
        vmRU.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_createUserActionPerformed

    private void updateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateUserActionPerformed
        RegistroUsuario vmRU = new RegistroUsuario();
        vmRU.setVisible(true);
        this.dispose();      
    }//GEN-LAST:event_updateUserActionPerformed

    private void deleteUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteUserActionPerformed
        BorrarUsuario vmBorrarU = new BorrarUsuario();
        vmBorrarU.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_deleteUserActionPerformed

    private void registroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registroClienteActionPerformed
            RegistroCliente vmRC = new RegistroCliente();
            vmRC.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_registroClienteActionPerformed

    private void regConsumptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regConsumptionActionPerformed
            Consumos vmCns = new Consumos();
            vmCns.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_regConsumptionActionPerformed

    private void generateRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateRecordActionPerformed
            Auditoria vmAU = new Auditoria();
            vmAU.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_generateRecordActionPerformed
                                              
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
            java.util.logging.Logger.getLogger(MenuInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem createUser;
    private javax.swing.JMenuItem deleteUser;
    private javax.swing.JMenuItem generateRecord;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem regConsumption;
    private javax.swing.JMenuItem registroCliente;
    private javax.swing.JMenuItem updateUser;
    // End of variables declaration//GEN-END:variables
}
