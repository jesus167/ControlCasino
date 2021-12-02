/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import controlador.RegistroUsuario;
import modelo.Usuario;

/**
 *
 * @author Administrador
 */
public class Test {
    
    RegistroUsuario rUser = new RegistroUsuario();
    Usuario user = new Usuario();
    String mensaje = "";
    
    public void agregar(){
        
        user.setRutUsuario("17464568-9");
        user.setNombre("Juan Pablo");
        user.setAppPaterno("Vera");
        user.setAppMaterno("Salinas");
        user.setRolAsignado("Qa");
         
         mensaje = rUser.crearUsuario(user);
         System.out.println(mensaje);
        
    }
    
    public void modificar(){
         
         user.setIdUsuario(3);
         user.setRutUsuario("15274395-9");
         user.setNombre("Orlando");
         user.setAppPaterno("Gutérrez");
         user.setAppMaterno("Espinosa");
         user.setRolAsignado("Mantención");
         
         mensaje = rUser.actualizarUsuario(user);
         System.out.println(mensaje);
     }
     
     public void eliminar(){
         mensaje = rUser.borrarUsuario(23);
         System.out.println(mensaje);
     }

     
     public static void main(String[] args){
         Test test = new Test();
                
         test.eliminar();
     }
}
