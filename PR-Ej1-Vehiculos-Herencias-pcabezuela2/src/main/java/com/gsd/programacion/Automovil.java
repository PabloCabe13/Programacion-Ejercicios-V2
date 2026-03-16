package com.gsd.programacion;

public class Automovil extends Vehiculo{
	private int numPuertas;
	private int capacidadMaletero;
	
	public Automovil(String modelo, int anioFabricacion, float precioBase, int numPuertas, int capacidadMaletero) {
		super(modelo, anioFabricacion, precioBase);
		this.numPuertas = numPuertas;
		this.capacidadMaletero = capacidadMaletero;
	}
	
	public int getNumPuertas() {
		return numPuertas;
	}

	public int getCapacidadMaletero() {
		return capacidadMaletero;
	}

	public float calcularPrecioVenta() {
		   float porcentaje = getCapacidadMaletero() / 10.0f; 
		   float incremento = getPrecioBase() * (porcentaje / 100.0f);
		    
		    return getPrecioBase() + incremento;
 	}
}
