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
    
    public String crearCliente(Cliente cliente ){
        
        Connection conn =  Conexion.getConnection();
        PreparedStatement pst = null;
        
        String sql = "INSERT INTO CLIENTE(idcliente, rutcliente, nombre, apppaterno, appmaterno, area, desayuno, almuerzo, cena, colacionfria, colacionnoche ) "
                + "VALUES(USUARIO_SEQ.NEXTVAL,?,?,?,?,?,?,?,?,?,?)";
        
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, cliente.getRutCliente());
            pst.setString(2, cliente.getNombre());
            pst.setString(3, cliente.getAppPaterno());
            pst.setString(4, cliente.getAppMaterno());
            pst.setString(5, cliente.getArea());
            pst.setBoolean(6, false);
            pst.setBoolean(7, false);
            pst.setBoolean(8, false);
            pst.setBoolean(9, false);
            pst.setBoolean(10, false);
            mensaje = "El Cliente se ha Guardado Correctamente";
            pst.execute();
            
            pst.close();
        } catch (SQLException e) {
            
            mensaje = "No se pudo Guardar Correctamente\n" + e.getMessage();
        }
        return mensaje;
    }
    
    public String modificarCliente(Cliente cliente){
        
        Connection conn =  Conexion.getConnection();
        
        
        PreparedStatement pst = null;
        String sql = "UPDATE CLIENTE SET rutcliente = ?, nombre = ?, apppaterno = ?, appmaterno = ?, area = ? WHERE rutcliente = ?";
        /*String sql = "UPDATE CLIENTE SET rutcliente = ?, nombre = ?, apppaterno = ?, appmaterno = ?, area = ?, desayuno = ?, almuerzo = ?, cena = ?, colacionfria = ?, colacionnoche = ? WHERE rutcliente = ?";*/
        
        try {
            
            pst = conn.prepareStatement(sql);
            pst.setString(1, cliente.getRutCliente());
            pst.setString(2, cliente.getNombre());
            pst.setString(3, cliente.getAppPaterno());
            pst.setString(4, cliente.getAppMaterno());
            pst.setString(5, cliente.getArea());
            pst.setString(6, cliente.getRutCliente());
            mensaje = "El Cliente a sido Actualizado Correctamente";
            pst.executeUpdate();
            pst.close();
        } catch (SQLException e) {
            
            mensaje = "No se pudo Actualizar Correctamente\n" + e.getMessage();
            
        }
        return mensaje;      
    }
    
    public String agregarConsumo(Cliente cliente){
        
        Connection conn =  Conexion.getConnection();
        
        PreparedStatement pst = null;
        String sql = "UPDATE cliente SET  desayuno = ?, almuerzo = ?, cena = ?, colacionfria = ?, colacionnoche = ? WHERE rutcliente = ? ";
        try {
            pst = conn.prepareStatement(sql);
           
            pst.setBoolean(1, cliente.isDesayuno());
            pst.setBoolean(2, cliente.isAlmuerzo());
            pst.setBoolean(3, cliente.isCena());
            pst.setBoolean(4, cliente.isColacionFria());
            pst.setBoolean(5, cliente.isColacionNoche());
            pst.setString(6, cliente.getRutCliente());
            
            mensaje = "Se ha registrado el Consumo del Cliente";
            pst.executeUpdate();
            pst.close();
        } catch (SQLException e) {
            
            mensaje = "No se pudo Actualizar Correctamente\n" + e.getMessage();
        }
        return mensaje;
    }
    
    public String eliminar(String rutCliente){
        
        
        Connection conn =  Conexion.getConnection();
                       
        PreparedStatement pst = null;
        String sql = "DELETE FROM cliente WHERE rutcliente= ?";
        
            try {
                
                pst = conn.prepareStatement(sql);
                pst.setString(1, rutCliente);
                mensaje = "El Cliente fue borrado exitosamente";
                pst.execute();
                pst.close();
                
            } catch (SQLException e) {
                
                mensaje = "No se pudo borrar correctamente\n" + e.getMessage();
            }
        
        return mensaje;
    }
    
    public Cliente buscarRut(String rutCliente){
        Cliente cliente = new Cliente();
        Connection conn =  Conexion.getConnection();
        try {
            String sql = "SELECT idcliente, rutcliente, nombre, apppaterno, appmaterno, area from cliente WHERE rutcliente = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, rutCliente);
            ResultSet rs = ps.executeQuery();
            
             if (rs.next()) {
                cliente.setIdCliente(rs.getInt("idcliente"));
                cliente.setRutCliente(rs.getString("rutcliente"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setAppPaterno(rs.getString("apppaterno"));
                cliente.setAppMaterno(rs.getString("appmaterno"));
                cliente.setArea(rs.getString("area"));
                /*cliente.setDesayuno(rs.getBoolean("desayuno"));
                cliente.setAlmuerzo(rs.getBoolean("almuerzo"));
                cliente.setCena(rs.getBoolean("cena"));
                cliente.setColacionFria(rs.getBoolean("colacionfria"));
                cliente.setColacionNoche(rs.getBoolean("colacionnoche"));*/
 
            }
             rs.close();
             ps.close();
             conn.close();
        } catch (SQLException e) {
            
            System.out.println("Error SQL al listar Cliente por id" + e.getMessage());
        }catch (Exception e){
            
            System.out.println("Error al listar Cliente por id" + e.getMessage());
            
        }
        return cliente;
        
    
    }
    
        public Cliente auditoriaRut(String rutCliente){
        Cliente cliente = new Cliente();
        Connection conn =  Conexion.getConnection();
        try {
            String sql = "SELECT * FROM cliente WHERE rutcliente = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, rutCliente);
            ResultSet rs = ps.executeQuery();
            
             if (rs.next()) {
                cliente.setIdCliente(rs.getInt("idcliente"));
                cliente.setRutCliente(rs.getString("rutcliente"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setAppPaterno(rs.getString("apppaterno"));
                cliente.setAppMaterno(rs.getString("appmaterno"));
                cliente.setArea(rs.getString("area"));
                cliente.setDesayuno(rs.getBoolean("desayuno"));
                cliente.setAlmuerzo(rs.getBoolean("almuerzo"));
                cliente.setCena(rs.getBoolean("cena"));
                cliente.setColacionFria(rs.getBoolean("colacionfria"));
                cliente.setColacionNoche(rs.getBoolean("colacionnoche"));
 
            }
             rs.close();
             ps.close();
             conn.close();
        } catch (SQLException e) {
            
            System.out.println("Error SQL al listar Cliente por id" + e.getMessage());
        }catch (Exception e){
            
            System.out.println("Error al listar Cliente por id" + e.getMessage());
            
        }
        return cliente;
        
    
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
                c.setRutCliente(rs.getString(2));
                c.setNombre(rs.getString(3));
                c.setAppPaterno(rs.getString(4));
                c.setAppMaterno(rs.getString(5));
                c.setArea(rs.getString(6));
                c.setDesayuno(rs.getBoolean(7));
                c.setAlmuerzo(rs.getBoolean(8));
                c.setCena(rs.getBoolean(9));
                c.setColacionFria(rs.getBoolean(10));
                c.setColacionNoche(rs.getBoolean(11));
                
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
