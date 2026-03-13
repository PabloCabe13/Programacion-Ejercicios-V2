package com.gsd.programacion;

import java.util.*;


public class App {
    public static void main(String[] args) {
    	
    	Agenda a = new Agenda();
    	a.addContacto("Pepe");
    	a.addContacto("Ana");
    	
    	a.addTlfContacto("Pepe", 1230);
    	a.addTlfContacto("Pepe", 7810);
    	
    	System.out.println(a.toString());  
    }
}
