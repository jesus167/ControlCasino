/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import bd.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
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
            pst.setBoolean(6, cliente.isDesayuno());
            pst.setBoolean(7, cliente.isAlmuerzo());
            pst.setBoolean(8, cliente.isCena());
            pst.setBoolean(9, cliente.isColacionFria());
            pst.setBoolean(10, cliente.isColacionNoche());
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
        String sql = "UPDATE  CLIENTE SET(idcliente = ?, rutcliente = ?, nombre, apppaterno, appmaterno, area, desayuno, almuerzo, cena, colacionfria, colacionnoche WHERE rutcliente = ?";
        
        try {
            
            pst = con.prepareStatement(sql);
            pst.setString(1, cliente.getRutCliente());
            pst.setString(2, cliente.getNombre());
            pst.setString(3, cliente.getAppPaterno());
            pst.setString(4, cliente.getAppMaterno());
            pst.setString(5, cliente.getArea());
            pst.setBoolean(6, cliente.isDesayuno());
            pst.setBoolean(7, cliente.isAlmuerzo());
            pst.setBoolean(8, cliente.isCena());
            pst.setBoolean(9, cliente.isColacionFria());
            pst.setBoolean(10, cliente.isColacionNoche());
            pst.setInt(11, cliente.getIdCliente());
            mensaje = "El Cliente a sido Actualizado Correctamente";
            pst.execute();
            pst.close();
        } catch (SQLException e) {
            
            mensaje = "No se pudo Actualizar Correctamente\n" + e.getMessage();
            
        }
        return mensaje;
        
    }
    
    public String borrarCliente(Connection con , int id){
               
        PreparedStatement pst = null;
        String sql = "DELETE FROM cliente WHERE rutcliente= ?";
        
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
    
    public List<Cliente> listarCliente(){
        
        List<Cliente> lista = new ArrayList<Cliente>();
        Connection conn =  Conexion.getConnection();
        PreparedStatement ps;
        ResultSet rs;              
        String sql = "SELECT * FROM cliente ORDER BY idcliente";

        try {
            ps = conn.prepareStatement(sql);
            rs= ps.executeQuery();
            while(rs.next()){
                Cliente c = new Cliente();
                c.setIdCliente(rs.getInt(1));
                c.setNombre(rs.getString(2));
                c.setAppPaterno(rs.getString(3));
                c.setAppMaterno(rs.getString(4));
                c.setArea(rs.getString(5));
                c.setDesayuno(rs.getBoolean(6));
                c.setAlmuerzo(rs.getBoolean(7));
                c.setCena(rs.getBoolean(8));
                c.setColacionFria(rs.getBoolean(9));
                c.setColacionNoche(rs.getBoolean(10));
                
                lista.add(c);   
            }
            rs.close();
            ps.close();
            conn.close();       
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se puede listar la tabla");
            System.out.println("Error SQL al listar Cliente" + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error al listar Cliente" + e.getMessage());
        }
        return lista;
        
    }
   
    
}
