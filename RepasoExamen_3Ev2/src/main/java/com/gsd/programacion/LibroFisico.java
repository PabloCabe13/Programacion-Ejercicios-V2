package com.gsd.programacion;

public class LibroFisico extends Libro{

	public LibroFisico(String titulo, int numPaginas, CategoriaLibro catLibro) {
		super(titulo, numPaginas, catLibro);
	}

	@Override
	public String formatoLibro() {
		return "Formato Fisico";
	}
}
