package com.gsd.programacion;

public class App {
    public static void main(String[] args) {
        Circulo c1 = new Circulo (5);
        Rectangulo r1 = new Rectangulo(10 , 5);
        
        System.out.println(c1.calcularArea());
        System.out.println(c1.calcularPerimetro());
        
        System.out.println(r1.calcularArea());
        System.out.println(r1.calcularPerimetro());
        
    }
}
