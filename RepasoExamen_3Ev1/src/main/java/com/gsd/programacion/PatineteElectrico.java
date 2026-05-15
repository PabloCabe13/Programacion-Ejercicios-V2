package com.gsd.programacion;

public class PatineteElectrico extends Vehiculo{
	public PatineteElectrico(String matricula, int autonomiaKm, EstadoVehiculo estadoVehiculo) {
		super(matricula, autonomiaKm, estadoVehiculo);
	}

	@Override
	protected String obtenerTipoCarnet() {
		return "No Requiere Carnet";
	}
}
