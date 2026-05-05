package com.gsd.programacion;

public class Exploradora extends Nave {

	public Exploradora(String nombre, double combustible, int nivelEnergia, Destino ubicacionActual) 
	throws NaveInvalidaException{	
		super(nombre, combustible, nivelEnergia, ubicacionActual);
	}

	@Override
	public void mostrarReporte() {
		
	}
	
	public boolean tieneAutonomia(double distancia){
		double consumo = (distancia * 0.5) * 0.7;
		if(consumo > getCombustible()) {
			return false;
		}
		return true;
	}
}
