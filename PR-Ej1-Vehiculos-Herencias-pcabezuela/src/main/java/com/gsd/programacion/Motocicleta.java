package com.gsd.programacion;

public class Motocicleta extends Vehiculo{
	private String tipoMotor;
	private int cilindrada;
	
	public Motocicleta(String modelo, int anioFabricacion, float precioBase, String tipoMotor, int cilindrada) {
		super(modelo, anioFabricacion, precioBase);
		this.tipoMotor = tipoMotor;
		this.cilindrada = cilindrada;
	}

	public String getTipoMotor() {
		return tipoMotor;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	@Override
	public float calcularPrecioVenta() {
	    float incremento = (this.cilindrada / 1000.0f) * 0.01f; 
	    return getPrecioBase() * (1 + incremento);
	}
	
	
	
}
