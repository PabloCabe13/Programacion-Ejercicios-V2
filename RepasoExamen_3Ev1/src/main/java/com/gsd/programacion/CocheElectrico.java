package com.gsd.programacion;

public class CocheElectrico extends Vehiculo{
	public CocheElectrico(String matricula, int autonomiaKm, EstadoVehiculo estadoVehiculo) {
		super(matricula, autonomiaKm, estadoVehiculo);
	}

	@Override
	protected String obtenerTipoCarnet() {
		return "Requiere Tipo Carnet B";
	}
}
