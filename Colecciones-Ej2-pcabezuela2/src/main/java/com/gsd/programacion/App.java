package com.gsd.programacion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        List <Integer> l1 = new ArrayList <Integer> ();
        Scanner teclado = new Scanner (System.in);
        int num;
        int numeroPreciso;
        System.out.println("----BIENVENIDO----");
        do {
        	System.out.println("1- Agregar un número a la lista");
        	System.out.println("2- Buscar un número");
        	System.out.println("3- Modificar un número");
        	System.out.println("4- Eliminar un número");
        	System.out.println("5- Insertar un número");
        	num = teclado.nextInt();
        	switch(num) {
	        	case 1:
	        		System.out.println("Dime el numero que quieres agregar a la lista: ");
	        		numeroPreciso = teclado.nextInt();
	        		l1.add(numeroPreciso);
	        		System.out.println("Numero añadido!");
	        		System.out.println();
	        		break;
	        	case 2:
	        		System.out.println("Dime el numero que quieres buscar: ");
	        		numeroPreciso = teclado.nextInt();
	        		boolean numEncontrado = false;
	        		for (int i = 0; i < l1.size(); i++) {
						if(l1.get(i).equals(numeroPreciso)) {
							numEncontrado = true;
							System.out.println("Numero encontrado " + l1.get(i));
							break;
						}
					}
	        		if(!numEncontrado)System.out.println("El numero no ha sido econtrado en la lista \n");
	        		break;
	        	case 3: 
	        		System.out.println("Dime el numero que quieres modificar");
	        		numeroPreciso = teclado.nextInt();
	        		
        	}
        }while(num != 6);
    }
}
