package com.gsd.programacion;

import java.util.*;

public class Libreria {
	List <Libro> libreria;

	public Libreria() {
		this.libreria = new ArrayList<>();
	}
	
	public boolean aniadirLibro(Libro libro) {
		if(!libreria.contains(libro.getTitulo())) {
			libreria.add(libro);
			System.out.println("Libro " + libro.getTitulo() + " añadido a la libreria.");
			return true;
		}
		System.err.println("El libro ya exite en la librería");
		return false;
	}
	
	public void mostrarLibrosCategoria (Categoria cat) {
		System.out.println("---- LIBROS PARA lA CATEGORÍA " + cat.toString());
		for(Libro l1 : libreria) {
			if(l1.getCategoria().equals(cat)) {
				System.out.println("-" + l1.getTitulo() + "\n");
			}
		}
	}
}
