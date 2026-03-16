package com.gsd.programacion;

public abstract class Nave {
	private String nombre;
	private int propulsion;
	
	public Nave(String nombre, int propulsion) {
		super();
		this.nombre = nombre;
		this.propulsion = propulsion;
	}

	public String getNombre() {
		return nombre;
	}

	public int getPropulsion() {
		return propulsion;
	}
	
	
}
