package com.gsd.programacion;

import java.util.stream.Stream;

public class Exploradora extends Nave {

	public Exploradora(String nombre, double combustible, int nivelEnergia) 
	throws EstadisticaInvalidaException{	
		super(nombre, combustible, nivelEnergia);
	}

	@Override
	public void mostrarReporte() {
		Stream.of(this).forEach(n -> System.out.println(
			    "- Nombre: " + n.getNombre() + 
			    ", Combustible: " + n.getCombustible() + 
			    ", Nivel de energía: " + n.getNivelEnergia() + 
			    ", Ubicacion Actual: " + (n.getUbicacionActual() != null ? n.getUbicacionActual().planeta() : "Base Estelar") + 
			    ", Riesgo Ambiental -50%"
			));
	}
	
	@Override
	protected double calcularConsumo(double distancia) {
		return (distancia * 0.5) * 0.7;
	}

	@Override
	public boolean tieneAutonomia(double distancia) {
		return calcularConsumo(distancia) <= getCombustible();
	}
}
