package com.gsd.programacion;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
    	Scanner teclado = new Scanner (System.in);
    	Mundo mundo = new Mundo();
        System.out.println("Bienvenido al Mundo!");
        int opcion;
        do {
        	System.out.println("1- Agregar un nuevo país");
        	System.out.println("2- Mostrar todos los países del contintente seleccionado");
        	System.out.println("3- Mostar todos los países");
        	System.out.println("4- Mostrar info de un país");
        	System.out.println("5- Mostrar población de un continete");
        	System.out.println("6- Mostrar Porcentaje de población de país de su continente");
        	System.out.println("7- Salir");
        	opcion = teclado.nextInt();
        	switch(opcion) {
        	case 1:
        		System.out.println("Dime el Nombre del País: ");
        		teclado.nextLine();
        		String nombrePais = teclado.nextLine().toUpperCase().trim();
        		
        		System.out.println("Dime la Población del País");
        		int poblacionPais = teclado.nextInt();
        		
        		System.out.println("Dime la Capital del País");
        		teclado.nextLine();
        		String capitalPais = teclado.nextLine().toUpperCase().trim();
        		
        		boolean existeContinente = false;
        		
        		while (!existeContinente) {
        			System.out.println("Dime al continente que pertenece");
            		String continente = teclado.nextLine();
            		try {
            			Continentes contSelec = Continentes.valueOf(continente.toUpperCase().trim());
            			Pais pais = new Pais (nombrePais, poblacionPais, capitalPais, contSelec);
            			mundo.aniadirPais(pais);
            			existeContinente = true;
            		}catch(IllegalArgumentException e) {
            			System.err.println("Ese continente no existe ");
            		}
        		}
        		break;
        	case 2:
        		System.out.println("Dime el continente: ");
        		teclado.nextLine();
        		String continente = teclado.nextLine();
        		mundo.mostrarPaisesDeContinente(continente);
        		break;
        	case 3:
        		mundo.mostrarTodosPaises();
        		break;
        	case 4: 
        		System.out.println("Dime el nombre del país: ");
        		teclado.nextLine();
        		String paisNombre = teclado.nextLine();
        		System.out.println(mundo.buscarPais(paisNombre));
        		break;
        	case 5:
        		System.out.println("Dime el continente: ");
        		teclado.nextLine();
        		String conti = teclado.next();
        		mundo.mostrarPoblacionContinente(conti);
        		break;
        	case 6: 
        		System.out.println("Dime el nombre de un país");
        		teclado.nextLine();
        		String nombPais = teclado.nextLine();
        		mundo.mostrarPorcentajePoblacionDePais(nombPais);
        		break;
        	case 7:
        		System.out.println("Chao Pescao");
        		return;
        	}
        }while(opcion != 7);
    }
}
