package dtos;

import java.util.Date;

/**
 * Clase con los metodos para manejar y crear objetos tipo Placa
 * @author Kevin
 */
public class Placa {
    //Atributos de la clase
    private String numeroPlaca;
    private Date fechaEmision;
    private Date fechaRecepcion;

    public Placa() {
    }

    public Placa(String numeroPlaca, Date fechaEmision, Date fechaRecepcion) {
        this.numeroPlaca = numeroPlaca;
        this.fechaEmision = fechaEmision;
        this.fechaRecepcion = fechaRecepcion;
    }

    public String getNumeroPlaca() {
        return numeroPlaca;
    }

    public void setNumeroPlaca(String numeroPlaca) {
        this.numeroPlaca = numeroPlaca;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public Date getFechaRecepcion() {
        return fechaRecepcion;
    }

    public void setFechaRecepcion(Date fechaRecepcion) {
        this.fechaRecepcion = fechaRecepcion;
    }
    
    
}
