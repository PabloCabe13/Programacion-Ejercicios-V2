package com.gsd.programacion;

public class App {
    public static void main(String[] args) {
        Vehiculo v1 = new Motocicleta ("A1" , 1234, 1234, 232, "Diesel");
        Automovil a1 = new Automovil ("A1" , 1234, 1234, 232, 50);
        System.out.println(a1.calcularPrecioVenta());
        System.out.println(v1.calcularPrecioVenta());
    }
}
