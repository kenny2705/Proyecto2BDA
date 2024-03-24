
package dtos;

import java.util.Date;

/**
 *  Clase con los metodos para crear y manejar objetos tipo Licencia
 * @author Kevin
 */
public class Licencia {
    //Atributos de la clase
    private Date fechaExpedicion;
    private float monto;
    
    public Date getFechaExpedicion() {
        return fechaExpedicion;
    }

    public void setFechaExpedicion(Date fechaExpedicion) {
        this.fechaExpedicion = fechaExpedicion;
    }

    public float getMonto() {
        return monto;
    }

    //Metodos de la clase
    public void setMonto(float monto) {
        this.monto = monto;
    }

    public Licencia() {
    }

    public Licencia(Date fechaExpedicion) {
        this.fechaExpedicion = fechaExpedicion;
    }

    
    public Licencia(Date fechaExpedicion, float monto) {
        this.fechaExpedicion = fechaExpedicion;
        this.monto = monto;
    }
    
}
