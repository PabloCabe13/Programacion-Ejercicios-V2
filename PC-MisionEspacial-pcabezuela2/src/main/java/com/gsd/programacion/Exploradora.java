package com.gsd.programacion;

import java.util.stream.Stream;

public class Exploradora extends Nave {

	public Exploradora(String nombre, double combustible, int nivelEnergia, Destino ubicacionActual) 
	throws EstadisticaInvalidaException{	
		super(nombre, combustible, nivelEnergia, ubicacionActual);
	}

	@Override
	public void mostrarReporte() {
		Stream.of(this).forEach(n -> System.out.println(
			    "- Nombre: " + n.getNombre() + 
			    ", Combustible: " + n.getCombustible() + 
			    ", Nivel de energía: " + n.getNivelEnergia() + 
			    ", Ubicacion Actual: " + n.getUbicacionActual().planeta() + 
			    ", Riesgo Ambiental -50%"
			));
	}
	
	public boolean tieneAutonomia(double distancia){
		double consumo = (distancia * 0.5) * 0.7;
		if(consumo > getCombustible()) {
			return false;
		}
		return true;
	}
	
	public void repostar() throws EstadisticaInvalidaException, FueraDeSectorException{
		if(getUbicacionActual() == null) {
			setCombustible(100);
			System.out.println("Combustible repostado");
		}else {
			throw new FueraDeSectorException("La nave " + getNombre() + ", no está en la base" );
		}
	}
}
