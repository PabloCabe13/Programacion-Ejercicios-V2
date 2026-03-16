package com.gsd.programacion;

public class deportista {
	private String nombre;
	private String deporte;
	private String nacionalidad;
	private int ID;
	
	public deportista(String nombre, String deporte, String nacionalidad, int ID) {
		this.nombre = nombre;
		this.deporte = deporte;
		this.nacionalidad = nacionalidad;
		this.ID = ID;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getDeporte() {
		return deporte;
	}
	
	
	
	public String getNacionalidad() {
		return nacionalidad;
	}

	public int getID() {
		return ID;
	}

	@Override
	public String toString() {
		return "Deportista " + nombre + ", deporte: " + deporte + ", ID: " + ID ;
	}
	
	
	
	
}
