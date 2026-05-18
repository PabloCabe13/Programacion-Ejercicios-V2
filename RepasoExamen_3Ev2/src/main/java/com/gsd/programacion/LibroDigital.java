package com.gsd.programacion;

public class LibroDigital extends Libro{
	public LibroDigital(String titulo, int numPaginas, CategoriaLibro catLibro) {
		super(titulo, numPaginas, catLibro);
	}

	@Override
	public String formatoLibro() {
		return "Formato Digital";
	}
	
	
}
