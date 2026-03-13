package com.gsd.programacion;

public class Motocicleta extends Vehiculo{
	private int cilindrada;
	private String tipoMotor;
	
	public Motocicleta(String modelo, int anio, double precioBase, int cilindrada, String tipoMotor) {
		super(modelo, anio, precioBase);
		this.cilindrada = cilindrada;
		this.tipoMotor = tipoMotor;
	}

	@Override
	public double calcularPrecioVenta() {
		double dev = getPrecioBase();
		int multi = cilindrada / 10;
		dev += dev/multi;
		return dev;
	}
	
	
	
}
