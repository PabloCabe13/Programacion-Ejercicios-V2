package com.gsd.programacion;

public class Habilidad {
	String nombre;
	String nivelDominio;
	
	public Habilidad(String nombre, String nivelDominio) {
		this.nombre = nombre;
		this.nivelDominio = nivelDominio;
	}

	public String getNombre() {
		return nombre;
	}

	public String getNivelDominio() {
		return nivelDominio;
	}

	@Override
	public String toString() {
		return "Habilidad " + nombre + ", Nivel de Dominio: " + nivelDominio;
	}
	
	
	
}

