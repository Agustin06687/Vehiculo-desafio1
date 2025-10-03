package com.mycompany.vehiculo;

public class Camion extends Vehiculo implements Transportable {
    private double capacidadCarga;

    public Camion(String marca, String modelo, int año, double capacidadCarga) {
        super(marca, modelo, año);
        this.capacidadCarga = capacidadCarga;
    }

    public double getCapacidadCarga() { return capacidadCarga; }
    public void setCapacidadCarga(double capacidadCarga) { this.capacidadCarga = capacidadCarga; }

    @Override
    public void arrancar() {
        System.out.println("El camion " + marca + " esta encendiendo su motor diesel.");
    }

    @Override
    public void detener() {
        System.out.println("El camion " + marca + " ha frenado completamente.");
    }

    @Override
    public int capacidadTransporte() {
        return (int) capacidadCarga; 
    }

    @Override
    public String getInfo() {
        return "Informacion: Marca=" + marca +
               ", Modelo=" + modelo +
               ", Año=" + año +
               " | Capacidad de carga=" + capacidadCarga + " toneladas";
    }
}
