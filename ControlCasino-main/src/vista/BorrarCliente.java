/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import bd.Conexion;
import controlador.RegistroCliente;
import java.sql.Connection;
import javax.swing.JOptionPane;
import modelo.Cliente;

/**
 *
 * @author Administrador
 */
public class BorrarCliente extends javax.swing.JFrame {

    /**
     * Creates new form BorrarCliente
     */
    public BorrarCliente() {
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
        rutCliente = new javax.swing.JTextField();
        btnBorrarCliente = new javax.swing.JButton();
        deleteMsjText = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        rutBorrar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Ingresa el rut del Usuario a borrar (12345699-8)");

        rutCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                rutClienteFocusGained(evt);
            }
        });
        rutCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rutClienteActionPerformed(evt);
            }
        });

        btnBorrarCliente.setText("Borrar");
        btnBorrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarClienteActionPerformed(evt);
            }
        });

        deleteMsjText.setForeground(new java.awt.Color(255, 51, 51));
        deleteMsjText.setText("Cliente borrado exitosamente");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        rutBorrar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                rutBorrarFocusGained(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rutBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnBorrarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(40, 40, 40))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(deleteMsjText, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rutCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 162, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rutCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rutBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBorrarCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(deleteMsjText)
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBorrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarClienteActionPerformed
        
        int idCliente = Integer.parseInt(rutCliente.getText());
        RegistroCliente regClient = new RegistroCliente();
        boolean eliminado = regClient.eliminar(idCliente);
        if(eliminado){
            
            System.out.println("Cliente Eliminado" + eliminado);
            JOptionPane.showMessageDialog(null, "Cliente Eliminado");
        }else{
            System.out.println("Algo fallo");
            JOptionPane.showMessageDialog(null, "No se ha encontrado el rut para Eliminar");
        /*String rut = rutCliente.getText();       
        RegistroCliente regClient = new RegistroCliente();
        Cliente cliente = regClient.buscarRut(rut);
        if(cliente.getIdCliente() != 0){
            rutCliente.setText(String.valueOf(cliente.getIdCliente()));
        }else{
            JOptionPane.showMessageDialog(null, "Rut no encontrado");
        }
        int idCliente = Integer.parseInt(rutCliente.getText());
        boolean eliminado = regClient.eliminar(idCliente);
        if(eliminado){
            
            System.out.println("Cliente Eliminado" + eliminado);
            JOptionPane.showMessageDialog(null, "Cliente Eliminado");
        }else{
            System.out.println("Algo fallo");
            JOptionPane.showMessageDialog(null, "No se ha encontrado el rut para Eliminar");
        }*/
  
    }//GEN-LAST:event_btnBorrarClienteActionPerformed

    private void rutClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rutClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rutClienteActionPerformed

    private void rutClienteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rutClienteFocusGained
        rutCliente.setText("");
    }//GEN-LAST:event_rutClienteFocusGained

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        String rut = rutCliente.getText();       
        RegistroCliente regClient = new RegistroCliente();
        Cliente cliente = regClient.buscarRut(rut);
        if(cliente.getIdCliente() != 0){
            rutCliente.setText(String.valueOf(cliente.getIdCliente()));
        }else{
            JOptionPane.showMessageDialog(null, "Rut no encontrado");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void rutBorrarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rutBorrarFocusGained
        rutBorrar.setText("");
    }//GEN-LAST:event_rutBorrarFocusGained

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
            java.util.logging.Logger.getLogger(BorrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BorrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BorrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BorrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BorrarCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrarCliente;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JLabel deleteMsjText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField rutBorrar;
    private javax.swing.JTextField rutCliente;
    // End of variables declaration//GEN-END:variables
}
