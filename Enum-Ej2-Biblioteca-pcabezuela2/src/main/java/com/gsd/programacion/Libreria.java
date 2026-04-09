package com.gsd.programacion;

import java.util.*;

public class Libreria {
	List <Libro> libreria;

	public Libreria() {
		this.libreria = new ArrayList<>();
	}
	
	public boolean aniadirLibro(Libro libro) {
		for(Libro l1 : libreria) {
			if(l1.getTitulo().equalsIgnoreCase(libro.getTitulo())) {
				System.err.println("El libro " + libro.getTitulo() + " ya exite en la librería");
				return false;
			}
		}
		libreria.add(libro);
		System.out.println("Libro " + libro.getTitulo() + " añadido a la libreria.");
		return true;		
	}
	
	public void mostrarLibrosCategoria (Categoria cat) {
		System.out.println("---- LIBROS PARA lA CATEGORÍA " + cat.toString());
		for(Libro l1 : libreria) {
			if(l1.getCategoria().equals(cat)) {
				System.out.println("-" + l1.toString());
			}
		}
	}
	
	public void mostrarLibros() {
		System.out.println("---- LIBROS DE TODA LA BIBLIOTECA ---");
		for(Libro l1 : libreria) {
			System.out.println(" - " + l1.toString() );
		}
	}
}
