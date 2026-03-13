package com.gsd.programacion;

public class Soldado implements UnidadMilitar{
	private String nombre;
	private String nivelExperiencia;
	private String equipo;
	
	public Soldado(String nombre, String nivelExperiencia, String equipo) {
		this.nombre = nombre;
		this.nivelExperiencia = nivelExperiencia;
		this.equipo = equipo;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getNivelExperiencia() {
		return nivelExperiencia;
	}
	
	public String equipo() {
		return equipo;
	}
	
	public void mover() {
		
	}
	
	public void atacar() {
		
	}
	
	public void recibirDanio() {
		
	}
}
