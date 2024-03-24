
package dtos;

/**
 * Clase que contiene los metodos para manejar y crear objetos tipo Motocicleta
 * @author Kevin
 */
public class Motocicleta extends Automovil {
    //Atributos de la clase
    private String numeroPlaca;
    //Metodos de la clase

    public Motocicleta(String numeroPlaca) {
        super();
        this.numeroPlaca = numeroPlaca;
    }

    public String getNumeroPlaca() {
        return numeroPlaca;
    }

    public void setNumeroPlaca(String numeroPlaca) {
        this.numeroPlaca = numeroPlaca;
    }
    
    
    
}
