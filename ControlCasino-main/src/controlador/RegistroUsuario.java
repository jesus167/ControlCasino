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
    
    public String actualizarUsuario(Usuario user){
        
        Connection conn =  Conexion.getConnection();
        
        PreparedStatement pst = null;
        String sql = "UPDATE USUARIO SET rutusuario = ?, nombre = ?, apppaterno = ?, appmaterno = ?, rolasignado= ? WHERE idusuario = ?";
        
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, user.getRutUsuario());
            pst.setString(2, user.getNombre());
            pst.setString(3, user.getAppPaterno());
            pst.setString(4, user.getAppMaterno());
            pst.setString(5, user.getRolAsignado());
            pst.setInt(6, user.getIdUsuario());
            mensaje = "El usuario a sido modificado correctamente";
            pst.executeUpdate();
            conn.close();      
         } catch (SQLException e) {
            
            mensaje = "No se pudo Actualizar Correctamente\n" + e.getMessage();
        }
        return mensaje;
        
    }

    public String borrarUsuario(int idUsuario){
        
        Connection conn =  Conexion.getConnection();
        
        PreparedStatement pst = null;
        String sql = "DELETE FROM USUARIO WHERE idusuario=?";
        
        try {
            pst = conn.prepareStatement(sql);
            pst.setInt(1, idUsuario);
            mensaje = "El usuario a sido Eliminado";
            pst.executeUpdate();
            conn.close();      
         } catch (SQLException e) {
            
            mensaje = "No se pudo Eliminar Correctamente\n" + e.getMessage();
        }
        return mensaje;
    }
    
    public List<Usuario> listarUsuario(){
        
        List<Usuario> lista = new ArrayList<Usuario>();
        Connection conn =  Conexion.getConnection();
        PreparedStatement ps;
        ResultSet rs;              
        String sql = "SELECT * FROM usuario ORDER BY idusuario";

        try {
            ps = conn.prepareStatement(sql);
            rs= ps.executeQuery();
            while(rs.next()){
                Usuario u = new Usuario();
                u.setIdUsuario(rs.getInt(1));
                u.setNombre(rs.getString(2));
                u.setAppPaterno(rs.getString(3));
                u.setAppMaterno(rs.getString(4));
                u.setRolAsignado(rs.getString(5));
                lista.add(u);   
            }
            rs.close();
            ps.close();
            conn.close();       
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se puede listar la tabla");
            System.out.println("Error SQL al listar usuario" + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error al listar usuario" + e.getMessage());
        }
        return lista;
    }
   
    
}
