/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dtos;

/**
 * Clase que contiene los metodos para manejar y crear objetos tip automovil
 * @author Kevin
 */
public class Automovil {
    //Atributos de la clase
    private String marca;
    private String color;
    private String linea;
    private String modelo;
    private String numSerie;
    private Placa placa;
    private Licencia licencia;

    public Automovil() {
    }

    public Automovil(String marca, String color, String linea, String modelo, String numSerie) {
        this.marca = marca;
        this.color = color;
        this.linea = linea;
        this.modelo = modelo;
        this.numSerie = numSerie;
    }
    

    public Automovil(String marca, String color, String linea, String modelo, String numSerie, Placa placa, Licencia licencia) {
        this.marca = marca;
        this.color = color;
        this.linea = linea;
        this.modelo = modelo;
        this.numSerie = numSerie;
        this.placa = placa;
        this.licencia = licencia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    public Placa getPlaca() {
        return placa;
    }

    public void setPlaca(Placa placa) {
        this.placa = placa;
    }

    public Licencia getLicencia() {
        return licencia;
    }

    public void setLicencia(Licencia licencia) {
        this.licencia = licencia;
    }
    
    
}
