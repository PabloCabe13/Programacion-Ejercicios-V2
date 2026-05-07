package com.gsd.programacion;

public interface Navegable {
	void viajar(Destino destino) throws CombustibleInsuficienteException, EstadisticaInvalidaException;
	boolean tieneAutonomia(double distancia);
	void repostar() throws EstadisticaInvalidaException, FueraDeSectorException;
}
