package com.mycompany.vehiculo;
public class Main {
    public static void main(String[] args) {
        Vehiculo[] vehiculos = new Vehiculo[3];
        vehiculos[0] = new Coche("Toyota", "Corolla", 2020, 4);
        vehiculos[1] = new Moto("Honda", "CBR", 2022, "Deportiva");
        vehiculos[2] = new Camion("Volvo", "FM", 2021, 10);

         for (Vehiculo v : vehiculos) {
            v.arrancar();
            v.detener();
            System.out.println(v.getInfo());

            if (v instanceof Coche) {
                Coche c = (Coche) v;
                System.out.println(c.getInfo(true));
            }

            if (v instanceof Transportable) {
                Transportable t = (Transportable) v;
                System.out.println("Capacidad de transporte: " + t.capacidadTransporte());
            }

            System.out.println();
        }
    }
}



 