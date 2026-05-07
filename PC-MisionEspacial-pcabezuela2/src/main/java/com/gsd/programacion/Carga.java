package com.gsd.programacion;

import java.util.stream.Stream;

public class Carga extends Nave {
	private double capacidadCarga;

	public Carga(String nombre, double combustible, int nivelEnergia, Destino ubicacionActual, double capacidadCarga)
	throws EstadisticaInvalidaException {
		super(nombre, combustible, nivelEnergia, ubicacionActual);
		setCapacidadCarga(capacidadCarga);
	}
	
	public double getCapacidadCarga() {
		return capacidadCarga;
	}

	public void setCapacidadCarga(double capacidadCarga) {
		if(capacidadCarga > 500) {
			System.err.println("---- ¡AVISO! La capacidad de carga de la carga " + getNombre()+ " es mayor de 500! El consumo se multiplica x3 RIESGO DE DERIVA ----");
		}
		this.capacidadCarga = capacidadCarga;
	}

	@Override
	public void mostrarReporte() {
		
		Stream.of(this).forEach(n -> System.out.println(
			    "- Nombre: " + n.getNombre() + 
			    ", Combustible: " + n.getCombustible() + 
			    ", Nivel de energía: " + n.getNivelEnergia() + 
			    ", Ubicacion Actual: " +  n.getUbicacionActual().planeta() + 
			    ", Capacidad de Carga: " + n.getCapacidadCarga()
			));
	}

	public boolean tieneAutonomia(double distancia){
		double consumo = (distancia * 1.2) * 2.5;
		if(getCapacidadCarga() > 500) consumo *= 3;
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
