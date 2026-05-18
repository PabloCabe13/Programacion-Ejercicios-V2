package com.gsd.programacion;
import java.util.*;
public class Biblioteca {
	private TreeSet <Libro> libros;
	
	public Biblioteca() {
		this.libros = new TreeSet<Libro>();
	}
	
	public boolean aniadirLibro(Libro libroNuevo) {
	    for(Libro l : libros) {
	        if(l.getTitulo().equalsIgnoreCase(libroNuevo.getTitulo())) {
	            System.err.println("El libro ya existe");
	            return false;
	        }
	    }
	    libros.add(libroNuevo);
	    System.out.println("Libro añadido");
	    return true;
	}
	
	public void mostrarCatalogo() {
		libros.stream()
			.forEach(l -> System.out.println("- Libro " + l.getTitulo() + ", NumPaginas: " + l.getNumPaginas() + ", Formato: " + l.formatoLibro()));
	}
	
	public List<Libro> librosMasNumPaginas(int numPaginas){
		List <Libro> librosNumPaginas = libros.stream()
				.filter(l -> l.getNumPaginas() > numPaginas)
				.toList();
		return librosNumPaginas;
	}
}
