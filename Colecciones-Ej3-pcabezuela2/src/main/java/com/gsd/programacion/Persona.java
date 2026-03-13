package com.gsd.programacion;

import java.time.LocalDate;

public class Persona {
	private String nombre;
	private String DNI;
	private Fecha fechaNacimiento;
	
	public Persona(String nombre, String DNI, Fecha fechaNacimiento) {
		this.nombre = nombre;
		this.DNI = DNI;
		this.fechaNacimiento = fechaNacimiento;
	}

	@Override
	public String toString() {
		return nombre + "\nDNI= " + DNI + "\nFecha de Nacimiento= " + fechaNacimiento;
	}
	
	
}
