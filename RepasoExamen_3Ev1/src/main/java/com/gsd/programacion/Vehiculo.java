package com.gsd.programacion;

public abstract class Vehiculo {
	private String matricula;
	private int autonomiaKm;
	private EstadoVehiculo estadoVehiculo;
	
	public Vehiculo(String matricula, int autonomiaKm, EstadoVehiculo estadoVehiculo) {
		super();
		this.matricula = matricula;
		this.autonomiaKm = autonomiaKm;
		this.estadoVehiculo = estadoVehiculo;
	}

	public String getMatricula() {
		return matricula;
	}

	public int getAutonomiaKm() {
		return autonomiaKm;
	}

	public EstadoVehiculo getEstadoVehiculo() {
		return estadoVehiculo;
	}
	
	protected abstract String obtenerTipoCarnet();
	
	
}
