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
        /*user.setDesayuno(true);
        user.setAlmuerzo(true);
        user.setCena(false);
        user.setColacionFria(true);
        user.setColacionNoche(false);*/
         
         mensaje = rUser.crearCliente(conn, user);
         System.out.println(mensaje);
        
    }
    
    public void buscarRut(){
        
        user.setRutCliente("29756655-9");
        Cliente user = new Cliente();
        user = rUser.buscarRut(user.getRutCliente());
        System.out.println(mensaje);
    }
    
    public void modificar(){
         
        
        user.setRutCliente("27756655-9");
        user.setNombre("Juan");
        user.setAppPaterno("Ramirez");
        user.setAppMaterno("Espinosa");
        user.setArea("Mantención");
        /*user.setDesayuno(true);
        user.setAlmuerzo(true);
        user.setCena(false);
        user.setColacionFria(true);
        user.setColacionNoche(false);*/
        mensaje = rUser.modificarCliente(user);
        System.out.println(mensaje);
     }
     
    public void consumo(){
        
        user.setRutCliente("27756655-9");
        user.setDesayuno(true);
        user.setAlmuerzo(true);
        user.setCena(false);
        user.setColacionFria(true);
        user.setColacionNoche(false);
        
        
    }
     public void eliminar(){   
         
         mensaje = rUser.eliminar("29756655-9");
         System.out.println(mensaje);
     }
     
     public static void main(String[] args){
         Test test = new Test();
                
         test.agregar();
         //test.eliminar();
         //test.buscarRut();
         //test.modificar();
     }
}
