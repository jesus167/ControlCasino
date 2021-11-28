/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.pgy2121;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Administrador
 */
public class Conexion {
    
     public Connection obtenerConexion() {
        Connection connection = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            connection = DriverManager.getConnection("jdbc:oracle:thin:@WIN01:1521:oracleBD", "CONTROLCASINO", "CONTROLCASINO");
            System.out.println("Conexión exitosa");
        } catch (SQLException e) {
            System.out.println("Error de conexión" + e.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return connection;
    }
    
}
