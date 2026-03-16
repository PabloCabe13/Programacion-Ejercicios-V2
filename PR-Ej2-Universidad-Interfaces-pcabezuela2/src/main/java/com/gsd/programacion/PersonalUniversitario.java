package com.gsd.programacion;

public abstract class PersonalUniversitario implements Trabajador {
	private String nombre;
	private String DNI;
	private int edad;
	
	public PersonalUniversitario(String nombre, String DNI, int edad) {
		this.nombre = nombre;
		this.DNI = DNI;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDNI() {
		return DNI;
	}		
	
	public int getEdad() {
		return edad;
	}
}
