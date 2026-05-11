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
			    ", Ubicacion Actual: " + (n.getUbicacionActual() != null ? n.getUbicacionActual().planeta() : "Base Estelar") +
			    ", Capacidad de Carga: " + n.getCapacidadCarga()
			));
	}
	
	@Override
	protected double calcularConsumo(double distancia) {
	    double consumo = (distancia * 1.2) * 2.5;
	    if (this.capacidadCarga > 500) {
	        consumo *= 3;
	    }
	    return consumo;
	}

	@Override
	public boolean tieneAutonomia(double distancia) {
	    return calcularConsumo(distancia) <= getCombustible();
	}
}
