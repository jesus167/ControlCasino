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
public class Cliente {
    
    private int idCliente;
    private String rutCliente;
    private String nombre;
    private String appPaterno;
    private String appMaterno;
    private String area;
    private char desayuno;
    private char almuerzo;
    private char cena;
    private char colacionFria;
    private char colacionNoche;

    public Cliente() {
    }

    public Cliente(int idCliente, String rutCliente, String nombre, String appPaterno, String appMaterno, String area, char desayuno, char almuerzo, char cena, char colacionFria, char colacionNoche) {
        this.idCliente = idCliente;
        this.rutCliente = rutCliente;
        this.nombre = nombre;
        this.appPaterno = appPaterno;
        this.appMaterno = appMaterno;
        this.area = area;
        this.desayuno = desayuno;
        this.almuerzo = almuerzo;
        this.cena = cena;
        this.colacionFria = colacionFria;
        this.colacionNoche = colacionNoche;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(String rutCliente) {
        this.rutCliente = rutCliente;
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

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public char getDesayuno() {
        return desayuno;
    }

    public void setDesayuno(char desayuno) {
        this.desayuno = desayuno;
    }

    public char getAlmuerzo() {
        return almuerzo;
    }

    public void setAlmuerzo(char almuerzo) {
        this.almuerzo = almuerzo;
    }

    public char getCena() {
        return cena;
    }

    public void setCena(char cena) {
        this.cena = cena;
    }

    public char getColacionFria() {
        return colacionFria;
    }

    public void setColacionFria(char colacionFria) {
        this.colacionFria = colacionFria;
    }

    public char getColacionNoche() {
        return colacionNoche;
    }

    public void setColacionNoche(char colacionNoche) {
        this.colacionNoche = colacionNoche;
    }

    @Override
    public String toString() {
        return "Cliente{" + "idCliente=" + idCliente + ", rutCliente=" + rutCliente + ", nombre=" + nombre + ", appPaterno=" + appPaterno + ", appMaterno=" + appMaterno + ", area=" + area + ", desayuno=" + desayuno + ", almuerzo=" + almuerzo + ", cena=" + cena + ", colacionFria=" + colacionFria + ", colacionNoche=" + colacionNoche + '}';
    }
    
    


    
}
