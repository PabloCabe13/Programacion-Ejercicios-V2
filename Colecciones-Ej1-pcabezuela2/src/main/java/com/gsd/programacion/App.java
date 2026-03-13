package com.gsd.programacion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        List <Integer> l1 = new ArrayList<Integer>();
        Scanner teclado = new Scanner (System.in);
        int num;
        int contador = 0;
        do {
        	System.out.println("Dime un numero");
        	num = teclado.nextInt();
        	if(num != -99) {
        		l1.add(num);
        		contador++;
        	}
        	
        }while(num != -99);
        System.out.println("\nSe han leido: " + contador + " numeros");
        
        int suma = 0;
        for (int i = 0; i < l1.size(); i++) {
			suma += l1.get(i);
		}
        int media = suma / contador;
        System.out.println("La suma de todos los numeros es: " + suma);
        System.out.println("La media total de los numeros es: " + media);
        System.out.println();
        
        for (int i = 0; i < l1.size(); i++) {
        	int numActual = l1.get(i);
        	if(numActual > media) {
        		System.out.println("El numero " + numActual + " es mayor que la media");
        	}else {
        		System.out.println(numActual);
        	}
		}
    }
}
