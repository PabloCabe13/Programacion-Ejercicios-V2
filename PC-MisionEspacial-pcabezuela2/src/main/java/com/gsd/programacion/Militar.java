package com.gsd.programacion;

import java.util.stream.Stream;

public class Militar extends Nave{
	private int blindaje;

	public Militar(String nombre, double combustible, int nivelEnergia, Destino ubicacionActual, int blindaje)
	throws EstadisticaInvalidaException {
		super(nombre, combustible, nivelEnergia, ubicacionActual);
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
			    ", Ubicacion Actual: " +  n.getUbicacionActual().planeta() + 
			    ", Capacidad de Carga: " + n.getBlindaje()
			));
	}
	
	public boolean tieneAutonomia(double distancia){
		double consumo = (distancia * 0.8) * 1.5;
		if(consumo > getCombustible()) {
			return false;
		}
		return true;
	}
	
	public void repostar() throws EstadisticaInvalidaException, FueraDeSectorException {
		if(getUbicacionActual() == null) {
			setCombustible(100);
			System.out.println("Combustible repostado");
		}else {
			throw new FueraDeSectorException("La nave " + getNombre() + ", no está en la base" );
		}
	}
	
	public boolean probabilidadHostil() throws EstadisticaInvalidaException {
		double probabilidadHostil = 0.20;
		if(Math.random() <= probabilidadHostil) {
			setCombustible(-10);
			return true;
		}
		return false;
	}

	@Override
	public void viajar(Destino destino) throws CombustibleInsuficienteException, EstadisticaInvalidaException {
		probabilidadHostil();
		super.viajar(destino);
	}
	
	
}
