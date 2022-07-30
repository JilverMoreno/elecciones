/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author lenovo
 */
public class ClsPersona {
    
      
    private String numeroCedula;
    private String nombre;
    private String correo;
    private String telefono;
    private String ciudadOrigen;
    private String direccion;

    public ClsPersona(String numeroCedula, String nombre, String correo, String telefono, String ciudadOrigen, String direccion) {
        this.numeroCedula = numeroCedula;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.ciudadOrigen = ciudadOrigen;
        this.direccion = direccion;
    }
   
   

    public String getNumeroCedula() {
        return numeroCedula;
    }

    public void setNumeroCedula(String numeroCedula) {
        this.numeroCedula = numeroCedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
}
