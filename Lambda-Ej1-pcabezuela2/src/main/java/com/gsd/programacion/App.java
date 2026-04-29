package com.gsd.programacion;
import java.util.*;
public class App {
    public static void main(String[] args) {
    	// 1. Filtrar una lista de enteros pares
    	List <Integer> numeros = List.of(1,4,2,5,7,8);
    	numeros.stream().filter(n -> n % 2 == 0).forEach(n -> System.out.println(n));
    	
    	// 2. Ordenar una lista de cadenas por longitud
    	List <String> nombres = List.of("Pablo", "Pepe", "Mamen", "Manolin");
    	
    	List<String> nombresOrdenados = nombres.stream().
    	sorted(Comparator.comparingInt(String :: length)).
    	toList();
    	
    	System.out.println(nombresOrdenados);
    	
    	// 3. Imprimir cada elemento en mayúsculas
    	List <String> nombresAMaysc = List.of("Pablo", "Pepe", "Mamen", "Manolin");
    	nombresAMaysc.stream().
    	map(nombre -> nombre.toUpperCase()).
    	forEach(n -> System.out.print("- " + n + " "));
    }
}
