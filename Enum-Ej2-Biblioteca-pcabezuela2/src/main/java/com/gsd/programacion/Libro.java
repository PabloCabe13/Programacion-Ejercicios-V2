package com.gsd.programacion;

public class Libro {

	private String titulo;
	private String autor;
	private int anio_publicacion;
	private Categoria categoria;
	
	public Libro(String titulo, String autor, int anio_publicacion, Categoria categoria) {
		this.titulo = titulo;
		this.autor = autor;
		this.anio_publicacion = anio_publicacion;
		this.categoria = categoria;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public int getAnio_publicacion() {
		return anio_publicacion;
	}

	public Categoria getCategoria() {
		return categoria;
	}
	
	
	
}
