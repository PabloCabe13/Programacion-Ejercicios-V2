package com.gsd.programacion;
import java.util.*;
public class App {
    public static void main(String[] args) {
        Libreria lib1 = new Libreria();
        Scanner teclado = new Scanner (System.in);
        int num;
        do {
        	System.out.println("----  MENU BIBLIOTECA ----");
        	System.out.println("1- Añadir Nuevo Libro");
        	System.out.println("2- Mostrar Libros de una categoría determinada");
        	System.out.println("3- Mostrar todos los libros");
        	System.out.println("4- Salir del Programa");
        	num = teclado.nextInt();
        	switch(num) {
        		case 1:
        			 teclado.nextLine(); 
        			    
        			    System.out.println("Dime el titulo del libro: ");
        			    String titulo = teclado.nextLine(); 
        			    
        			    System.out.println("Dime el autor del Libro: ");
        			    String autor = teclado.nextLine();
        			    
        			    System.out.println("Año de publicación del libro: ");
        			    int anio_publicacion = teclado.nextInt();
        			    teclado.nextLine();
        			    
        			    System.out.println("Dime la categoría (POESIA/CIENCIA_FICCION/NOVELA/HISTORIA): ");
        			    String categoriaInput = teclado.next().toUpperCase().trim();
        			       			 
        			    try {
        			    	Categoria categoriaIntorducida = Categoria.valueOf(categoriaInput);
        			    	Libro nuevoLibro = new Libro(titulo, autor, anio_publicacion, categoriaIntorducida );
            			    lib1.aniadirLibro(nuevoLibro);
        			    }catch (IllegalArgumentException e) {
            		        System.err.println("Error: La categoría '" + categoriaInput + "' no es válida.");
            		    }		   
        			    break;
        		case 2:
        		    System.out.println("¿Qué categoría quieres ver? (POESIA, CIENCIA_FICCION, NOVELA, HISTORIA):");
        		    String categoriaVer = teclado.next().toUpperCase().trim();

        		    try {
        		        Categoria catEncontrada = Categoria.valueOf(categoriaVer);
        		        lib1.mostrarLibrosCategoria(catEncontrada);
        		    } catch (IllegalArgumentException e) {
        		        System.err.println("Error: La categoría '" + categoriaVer + "' no es válida.");
        		    }
        		    break;
        		case 3:
        			lib1.mostrarLibros();
        			break;
        		case 4: 
        			System.out.println("Chao pescao");
        			return;
        	}
        }while(num != 4);
    }
}
