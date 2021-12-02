/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.Cliente;


/**
 *
 * @author Administrador
 */
public class RegistroCliente {
    
    private String mensaje = "";
    
    public String crearCliente(Connection con , Cliente cliente ){
        
        PreparedStatement pst = null;
        String sql = "INSERT INTO CLIENTE(idcliente, rutcliente, nombre, apppaterno, appmaterno, area, desayuno, almuerzo, cena, colacionfria, colacionnoche ) "
                + "VALUES(USUARIO_SEQ.NEXTVAL,?,?,?,?,?,?,?,?,?,?)";
        
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, cliente.getRutCliente());
            pst.setString(2, cliente.getNombre());
            pst.setString(3, cliente.getAppPaterno());
            pst.setString(4, cliente.getAppMaterno());
            pst.setString(5, cliente.getArea());
            pst.setString(6, cliente.getDesayuno()+ "");
            pst.setString(7, cliente.getAlmuerzo()+ "");
            pst.setString(8, cliente.getCena()+ "");
            pst.setString(9, cliente.getColacionFria()+ "");
            pst.setString(10, cliente.getColacionNoche()+ "");
            mensaje = "El Cliente se ha Guardado Correctamente";
            pst.execute();
            pst.close();
        } catch (SQLException e) {
            
            mensaje = "No se pudo Guardar Correctamente\n" + e.getMessage();
        }
        return mensaje;
    }
    
    public String modificarCliente(Connection con , Cliente cliente){
        
        PreparedStatement pst = null;
        String sql = "";
        
        try {
            
            pst = con.prepareStatement(sql);
            pst.setString(1, cliente.getRutCliente());
            pst.setString(2, cliente.getNombre());
            pst.setString(3, cliente.getAppPaterno());
            pst.setString(4, cliente.getAppMaterno());
            pst.setString(5, cliente.getArea());
            pst.setString(6, cliente.getDesayuno()+ "");
            pst.setString(7, cliente.getAlmuerzo()+ "");
            pst.setString(8, cliente.getCena()+ "");
            pst.setString(9, cliente.getColacionFria()+ "");
            pst.setString(10, cliente.getColacionNoche()+ "");
            pst.setInt(11, cliente.getIdCliente());
            mensaje = "El Cliente a sido Actualizado Correctamente";
            pst.execute();
            pst.close();
        } catch (SQLException e) {
            
            mensaje = "No se pudo Actualizar Correctamente\n" + e.getMessage();
            
        }
        
        
        return mensaje;
        
    }public String borrarCliente(Connection con , int id){
               
        PreparedStatement pst = null;
        String sql = "DELETE FROM USUARIO WHERE IDCLIENTE = ?";
        
            try {
                
                pst = con.prepareStatement(sql);
                pst.setInt(1, id);
                mensaje = "El Cliente fue borrado exitosamente";
                pst.execute();
                pst.close();
                
            } catch (SQLException e) {
                
                mensaje = "No se pudo borrar correctamente\n" + e.getMessage();
            }
        
        return mensaje;
    }
    
    public void listarCliente(Connection con, Jtable table){
        
    }
   
    
}
