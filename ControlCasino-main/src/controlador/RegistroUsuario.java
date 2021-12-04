/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import bd.Conexion;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Usuario;

/**
 *
 * @author Administrador
 */
public class RegistroUsuario {
    
    
    private String mensaje = "";
    
    public String crearUsuario(Usuario user){
        
        Connection conn =  Conexion.getConnection();
        
        
        PreparedStatement pst = null;
        String sql = "INSERT INTO USUARIO (idusuario, rutusuario, nombre, apppaterno, appmaterno, rolasignado ) "
                + "VALUES(USUARIO_SEQ.NEXTVAL,?,?,?,?,?)";
        
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, user.getRutUsuario());
            pst.setString(2, user.getNombre());
            pst.setString(3, user.getAppPaterno());
            pst.setString(4, user.getAppMaterno());
            pst.setString(5, user.getRolAsignado());
            mensaje = "Guardado Correctamente";
            pst.execute();
            conn.close();
            
        } catch (SQLException e) {
            
            mensaje = "No se pudo Guardar Correctamente\n" + e.getMessage();
        }
        
        
        return mensaje;
    }
    
 

    
}
