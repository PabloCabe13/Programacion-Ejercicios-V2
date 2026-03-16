package com.gsd.programacion;

public class App {
    public static void main(String[] args) {
        Motocicleta m1 = new Motocicleta ("Ducati" , 2018, 7000, "4 tiempos" , 1000);
        Automovil a1 = new Automovil("hyundai", 2021, 22500, 5, 40);
        
        
        System.out.println(a1.calcularPrecioVenta());
        System.out.println( m1.calcularPrecioVenta());
       
    }
}
