package com.gsd.programacion;

public class Pais implements Comparable<Pais> {
	private String nombre;
	private int poblacion;
	private String capital;
	private Continentes continente;
	
	public Pais(String nombre, int poblacion, String capital, Continentes continente) {
		this.nombre = nombre;
		this.poblacion = poblacion;
		this.capital = capital;
		this.continente = continente;
	}

	public String getNombre() {
		return nombre;
	}

	public int getPoblacion() {
		return poblacion;
	}

	public String getCapital() {
		return capital;
	}

	public Continentes getContinente() {
		return continente;
	}
	
	public int compareTo(Pais p) {
		return p.getPoblacion() - this.poblacion;
	}

	@Override
	public String toString() {
		return "Pais " + nombre + ", Poblacion: " + poblacion + ", Capital: " + capital + ", Continente: "
				+ continente ;
	}
	
	
}
