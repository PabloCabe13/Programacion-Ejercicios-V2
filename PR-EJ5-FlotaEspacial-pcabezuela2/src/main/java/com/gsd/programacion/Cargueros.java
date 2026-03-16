package com.gsd.programacion;

public class Cargueros extends Nave{
	private int capacidadCarga;

	public Cargueros(String nombre, int propulsion, int capacidadCarga) {
		super(nombre, propulsion);
		this.capacidadCarga = capacidadCarga;
	}

	public int getCapacidadCarga() {
		return capacidadCarga;
	}
	
}
