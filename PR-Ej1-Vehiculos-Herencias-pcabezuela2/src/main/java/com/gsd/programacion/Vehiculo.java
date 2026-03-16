package com.gsd.programacion;

public abstract class Vehiculo {
	private String modelo;
	private int anioFabricacion;
	private float precioBase;
	
	public Vehiculo(String modelo, int anioFabricacion, float precioBase) {
		super();
		this.modelo = modelo;
		this.anioFabricacion = anioFabricacion;
		this.precioBase = precioBase;
	}

	public String getModelo() {
		return modelo;
	}

	public int getAnioFabricacion() {
		return anioFabricacion;
	}

	public float getPrecioBase() {
		return precioBase;
	}
	
	public abstract float calcularPrecioVenta();
}
