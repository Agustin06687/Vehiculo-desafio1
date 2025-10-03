
package com.mycompany.vehiculo;

public class Moto extends Vehiculo implements Transportable {
    private String tipo;

    public Moto(String marca, String modelo, int año) {
        super(marca, modelo, año);
        this.tipo = "Desconocido";
    }
    public Moto(String marca, String modelo, int año, String tipo) {
        super(marca, modelo, año);
        this.tipo = tipo;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    @Override
    public void arrancar() {
        System.out.println("La moto " + marca + " esta rugiendo.");
    }
    @Override
    public void detener() {
        System.out.println("La moto " + marca + " se ha apagado.");
    }
    @Override
    public int capacidadTransporte() {
        return 2;
    }
    @Override
    public String getInfo() {
        return "Informacion: Marca=" + marca + 
               ", Modelo=" + modelo + 
               ", Año=" + año + 
               " | Tipo=" + tipo;
    }
}
