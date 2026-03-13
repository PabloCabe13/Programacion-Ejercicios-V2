package com.gsd.programacion;

public class Automovil extends Vehiculo{
	private int puertas;
	private int maletero; //Litros de capacidad
	
	public Automovil(String modelo, int anio, double precioBase, int puertas, int maletero) {
		super(modelo, anio, precioBase);
		this.puertas = puertas;
		this.maletero = maletero;
	}

	@Override
	public double calcularPrecioVenta() {
		double dev = getPrecioBase();
		int multi = maletero / 10;
		dev += dev/multi;
		return dev;
	}
	
	
	
}
