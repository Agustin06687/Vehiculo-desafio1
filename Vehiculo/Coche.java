package com.mycompany.vehiculo;

public class Coche extends Vehiculo implements Transportable {
    private int numeroPuertas;

    public Coche(String marca, String modelo, int año, int numeroPuertas) {
        super(marca, modelo, año);
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public void arrancar() {
        System.out.println("El coche " + marca + " está arrancando.");
    }

    @Override
    public void detener() {
        System.out.println("El coche " + marca + " se ha detenido.");
    }

    @Override
    public int capacidadTransporte() {
        return 5; 
    }

    public String getInfo(boolean incluirDetalles) {
        if (incluirDetalles) {
            return "Informacion: Marca=" + marca + 
                   ", Modelo=" + modelo + 
                   ", Año=" + año + 
                   " | Puertas=" + numeroPuertas;
        }
        return super.getInfo();
    }
}
