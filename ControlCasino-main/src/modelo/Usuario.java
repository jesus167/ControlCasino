/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Administrador
 */
public class Usuario {
    
    private int idUsuario;
    private String rutUsuario;
    private String nombre;
    private String appPaterno;
    private String appMaterno;
    private String rolAsignado;

    public Usuario() {
    }

    public Usuario(int idUsuario, String rutUsuario, String nombre, String appPaterno, String appMaterno, String rolAsignado) {
        this.idUsuario = idUsuario;
        this.rutUsuario = rutUsuario;
        this.nombre = nombre;
        this.appPaterno = appPaterno;
        this.appMaterno = appMaterno;
        this.rolAsignado = rolAsignado;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getRutUsuario() {
        return rutUsuario;
    }

    public void setRutUsuario(String rutUsuario) {
        this.rutUsuario = rutUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAppPaterno() {
        return appPaterno;
    }

    public void setAppPaterno(String appPaterno) {
        this.appPaterno = appPaterno;
    }

    public String getAppMaterno() {
        return appMaterno;
    }

    public void setAppMaterno(String appMaterno) {
        this.appMaterno = appMaterno;
    }

    public String getRolAsignado() {
        return rolAsignado;
    }

    public void setRolAsignado(String rolAsignado) {
        this.rolAsignado = rolAsignado;
    }

    @Override
    public String toString() {
        return "Usuario{" + "idUsuario=" + idUsuario + ", rutUsuario=" + rutUsuario + ", nombre=" + nombre + ", appPaterno=" + appPaterno + ", appMaterno=" + appMaterno + ", rolAsignado=" + rolAsignado + '}';
    }
    
    


    
    
}
