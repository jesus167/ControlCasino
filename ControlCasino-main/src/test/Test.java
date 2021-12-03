/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import bd.Conexion;
import controlador.RegistroCliente;
import java.sql.Connection;
import modelo.Cliente;

/**
 *
 * @author Administrador
 */
public class Test {
    
    
    RegistroCliente rUser = new RegistroCliente();
    Cliente user = new Cliente();
    String mensaje = "";
    
    public void agregar(){
        
        Connection conn =  Conexion.getConnection();
        
        user.setRutCliente("27756655-9");
        user.setNombre("Gabriel");
        user.setAppPaterno("Boric");
        user.setAppMaterno("Salinas");
        user.setArea("Qa");
        user.setDesayuno(true);
        user.setAlmuerzo(true);
        user.setCena(false);
        user.setColacionFria(true);
        user.setColacionNoche(false);
         
         mensaje = rUser.crearCliente(conn, user);
         System.out.println(mensaje);
        
    }
    
    /*public void modificar(){
         
         user.setIdUsuario(3);
         user.setRutUsuario("15274395-9");
         user.setNombre("Orlando");
         user.setAppPaterno("Gutérrez");
         user.setAppMaterno("Espinosa");
         user.setRolAsignado("Mantención");
         
         mensaje = rUser.actualizarUsuario(user);
         System.out.println(mensaje);
     }
     */
     public void eliminar(){
         
         Connection conn =  Conexion.getConnection();
         
         user.setRutCliente("17464568-9");
         
         
         mensaje = rUser.borrarCliente("29756655-9");
         System.out.println(mensaje);
     }

     
     public static void main(String[] args){
         Test test = new Test();
                
         //test.agregar();
         test.eliminar();
     }
}
