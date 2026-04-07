package com.gsd.programacion;

public class App {
    public static void main(String[] args) {
    	
        Jugador j1 = new Jugador ("Julian Álvarez", 19, Demarcacion.DELANTERO, Equipo.ATLETICO_DE_MADRID);
        System.out.println(j1.toString());
        j1.bajarPosicion();
        System.out.println("\n"+j1.toString());
 
    }
}
