package com.gsd.programacion;

public class Cazas extends Nave implements Combate{
	private int numMisiles;

	public Cazas(String nombre, int propulsion, int numMisiles) {
		super(nombre, propulsion);
		this.numMisiles = numMisiles;
	}

	public int getNumMisiles() {
		return numMisiles;
	}
	
	@Override
	public void atacar() {
		System.out.println("El caza " + getNombre() + " ataca!");
	}
}
