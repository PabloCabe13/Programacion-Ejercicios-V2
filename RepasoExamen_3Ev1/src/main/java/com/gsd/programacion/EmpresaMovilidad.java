package com.gsd.programacion;
import java.util.*;

public class EmpresaMovilidad {
	List <Vehiculo> vehiculos;
	
	public EmpresaMovilidad() {
		this.vehiculos = new ArrayList<>();
	}
	
	public boolean aniadirVehiculo(Vehiculo vehiculo) {
		for(Vehiculo v : vehiculos) {
			if(v.getMatricula().equalsIgnoreCase(vehiculo.getMatricula())) {
				System.err.println("El vehículo ya existe");
				return false;
			}
		}
		vehiculos.add(vehiculo);
		System.out.println("Vehiculo añadido");
		return true;
	}
	
	public void mostrarFlota() {
		System.out.println("\n---- FLOTA ----");
		vehiculos.stream()
			.forEach(v -> System.out.println("- Matricula: " + v.getMatricula() + ", Tipo Carnet: " + v.obtenerTipoCarnet()));
	}
	
	public List<Vehiculo> buscarVehiculosDeAltaAutonomia(int limiteKm) {
		List <Vehiculo> vehiculosConAuto = vehiculos.stream()
				.filter(v -> v.getAutonomiaKm() > limiteKm)
				.toList();
		return vehiculosConAuto;
	}
}
