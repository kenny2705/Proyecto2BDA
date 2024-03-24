package dtos;

import java.util.Date;

/**
 * Clase que contiene los metodos para crear y crear objetos tipo Persona
 * @author Kevin 
 */
public class Persona {
    //Atributos de la clase
    private String nombre;
    private String rfc;
    private String telefono;
    private Date fechaNacimiento;
    
    //Metodos de la clase

    public Persona() {
    }

    public Persona(String nombre, String rfc, String telefono, Date fechaNacimiento) {
        this.nombre = nombre;
        this.rfc = rfc;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    
    
    
}
