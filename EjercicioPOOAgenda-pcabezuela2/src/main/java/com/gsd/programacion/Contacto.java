package com.gsd.programacion;

public class Contacto {
	private String nombre;
	private int telefono;
	
	public Contacto() {
		this.nombre = "";
		this.telefono = 0;
	}
	
	public Contacto (String nombre, int telefono) {
		this.nombre = nombre;
		this.telefono = telefono;
	}
	
	public String getNombre () {
		return nombre;
	}
	public int getTelefono () {
		return telefono;
	}

	@Override
	public String toString() {
		return "Contacto " + nombre + ", telefono =" + telefono + "\n";
	}
	
}
