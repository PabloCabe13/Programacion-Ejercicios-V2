package com.gsd.programacion;

public class App {
    public static void main(String[] args) {
        Deportista d1 = new Deportista("Pepe", "futbol", 1, "España");
        Deportista d2 = new Deportista("Manolo", "voleibol", 4, "Canada");
        Deportista d3 = new Deportista("Mamen", "futbol", 12, "Canada");
        Olimpiada o1 = new Olimpiada("Japon", 2020);
        
        o1.addDeportista(d1);
        o1.addDeportista(d2);
        o1.addDeportista(d3);
        o1.showAll();
        o1.showNacionalidad("EspañA");
        o1.showDeporte("futbol");
        System.out.println( "\n En estas olimpiadas hay: "+ o1.cuantasNaciones() + " paises diferentes");
    }
}
