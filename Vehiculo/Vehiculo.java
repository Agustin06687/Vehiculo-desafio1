
package com.mycompany.vehiculo;

public abstract class Vehiculo {
    protected String marca;
    protected String modelo;
    protected int año;

    public Vehiculo(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public int getAño() { return año; }
    public void setAño(int año) { this.año = año; }

  
    public abstract void arrancar();
    public abstract void detener();

  
    public String getInfo() {
        return "Marca=" + marca + ", Modelo=" + modelo + ", Año=" + año;
    }

    public Vehiculo(){
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
