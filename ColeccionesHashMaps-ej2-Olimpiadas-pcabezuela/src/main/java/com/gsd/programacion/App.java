package com.gsd.programacion;

public class App {
    public static void main(String[] args) {
        deportista d1 = new deportista ("Pepe" , "Futbol" , "España" , 1234);
        deportista d2 = new deportista ("Manolo" , "Futbol" , "España" , 12);
        deportista d3 = new deportista ("Mamen" , "Hockey" , "Canada" , 123);
        
        Olimpiada olimpiada = new Olimpiada("Japon", 2020);
        olimpiada.addDeportista(d1);
        olimpiada.addDeportista(d1);
        olimpiada.addDeportista(d2);
        olimpiada.addDeportista(d3);
        System.out.println();
        olimpiada.showAll();
        System.out.println();
        olimpiada.showDeporte("Futbol");
        System.out.println();
        System.out.println("Hay "+ olimpiada.cuantasNaciones() + " distintas naciones en estas olimpiadas.");
        System.out.println();
        olimpiada.showNacionalidad("España");
        

    }
}
