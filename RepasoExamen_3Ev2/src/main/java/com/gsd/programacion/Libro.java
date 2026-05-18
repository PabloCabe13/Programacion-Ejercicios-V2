package com.gsd.programacion;

public abstract class Libro implements Comparable<Libro>{
	private String titulo;
	private int numPaginas;
	private CategoriaLibro catLibro;
	
	public Libro (String titulo, int numPaginas, CategoriaLibro catLibro) {
		this.titulo = titulo;
		this.numPaginas = numPaginas;
		this.catLibro = catLibro;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public int getNumPaginas() {
		return numPaginas;
	}
	
	public CategoriaLibro getCatLibro() {
		return catLibro;
	}
	
	public abstract String formatoLibro();

	@Override
	public int compareTo(Libro otroLibro) {
	    int comparacion = Integer.compare(this.numPaginas, otroLibro.numPaginas);
	    if (comparacion == 0) {
	        return this.titulo.compareTo(otroLibro.titulo);
	    }
	    return comparacion;
	}
	
	
}
