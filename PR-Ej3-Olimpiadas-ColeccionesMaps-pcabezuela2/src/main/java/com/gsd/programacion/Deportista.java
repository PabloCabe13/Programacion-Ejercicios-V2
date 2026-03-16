package com.gsd.programacion;

public class Deportista {
	private String nombre;
	private String deporte;
	private int ID;
	private String nacionalidad;
	
	public Deportista(String nombre, String deporte, int ID, String nacionalidad) {
		this.nombre = nombre;
		this.deporte = deporte;
		this.ID = ID;
		this.nacionalidad = nacionalidad;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDeporte() {
		return deporte;
	}

	public int getID() {
		return ID;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	@Override
	public String toString() {
		return "Deportista "+ nombre + ", Deporte:" + deporte + ", ID: " + ID + ", Nacionalidad: " + nacionalidad;
	}
	
	
	
}
