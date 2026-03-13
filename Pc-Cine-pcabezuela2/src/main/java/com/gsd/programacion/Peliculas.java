package com.gsd.programacion;

public class Peliculas {
	private String titulo;
	private float duracion;
	private int edadMin;
	private String director;
	
	public Peliculas(String titulo, float duracion, int edadMin, String director) {
		this.titulo = titulo;
		this.duracion = duracion;
		this.edadMin = edadMin;
		this.director = director;
	}
	
	public String getTitulo() {return titulo;}
	public int getEdadMin() {return edadMin;}

	@Override
	public String toString() {
		return  titulo + "";
	}
	
	
}
