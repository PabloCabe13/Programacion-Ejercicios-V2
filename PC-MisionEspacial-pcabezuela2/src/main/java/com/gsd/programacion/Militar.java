package com.gsd.programacion;

import java.util.stream.Stream;

public class Militar extends Nave{
	private int blindaje;

	public Militar(String nombre, double combustible, int nivelEnergia, int blindaje)
	throws EstadisticaInvalidaException {
		super(nombre, combustible, nivelEnergia);
		setBlindaje(blindaje);
	}

	public int getBlindaje() {
		return blindaje;
	}

	public void setBlindaje(int blindaje) throws EstadisticaInvalidaException {
		if(blindaje < 1 || blindaje > 100) {
			throw new EstadisticaInvalidaException("El blindaje debe ser 1-100");
		}
		this.blindaje = blindaje;
	}
	
	@Override
	public void mostrarReporte() {
		
		Stream.of(this).forEach(n -> System.out.println(
			    "- Nombre: " + n.getNombre() + 
			    ", Combustible: " + n.getCombustible() + 
			    ", Nivel de energía: " + n.getNivelEnergia() + 
			    ", Ubicacion Actual: " + (n.getUbicacionActual() != null ? n.getUbicacionActual().planeta() : "Base Estelar") +
			    ", Blindaje: " + n.getBlindaje()
			));
	}
	
	@Override
	protected double calcularConsumo(double distancia) {
		return (distancia * 0.8) * 1.5;
	}

	@Override
	public boolean tieneAutonomia(double distancia) {
		return calcularConsumo(distancia) <= getCombustible();
	}
	
	public boolean probabilidadHostil() throws EstadisticaInvalidaException {
	    double probabilidad = 0.20;
	    if (Math.random() <= probabilidad) {
	        System.out.println("¡ALERTA! Encuentro hostil detectado. Maniobras evasivas ejecutadas.");
	        
	        double nuevoCombustible = getCombustible() - 10;
	        
	        if (nuevoCombustible < 0) {
	            nuevoCombustible = 0;
	        }
	        
	        setCombustible(nuevoCombustible);
	        return true;
	    }
	    return false;
	}

	@Override
	public void viajar(Destino destino) throws CombustibleInsuficienteException, EstadisticaInvalidaException {
	    super.viajar(destino);
	    if (!destino.planeta().equals("Base Estelar")) {
	        probabilidadHostil();
	    }
	}
}
