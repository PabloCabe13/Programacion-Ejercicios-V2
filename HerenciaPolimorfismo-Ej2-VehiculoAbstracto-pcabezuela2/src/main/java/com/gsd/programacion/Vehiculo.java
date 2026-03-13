package com.gsd.programacion;

public abstract class Vehiculo {
	private String modelo;
	private int anio;
	private double precioBase;
	
	public Vehiculo(String modelo, int anio, double precioBase) {
		this.modelo = modelo;
		this.anio = anio;
		this.precioBase = precioBase;
	}

	public String getModelo() {
		return modelo;
	}

	public int getAnio() {
		return anio;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	@Override
	public String toString() {
		return "Vehiculo [modelo=" + modelo + ", anio=" + anio + ", precioBase=" + precioBase + "]";
	}
	
	public abstract double calcularPrecioVenta();
}
