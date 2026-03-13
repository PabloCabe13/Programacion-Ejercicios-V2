package com.gsd.programacion;

public class Lavadora extends Electrodoméstico{
	
	private static final int cargaDefecto = 5;
	private int carga;
	
	public Lavadora() {
		super();
		this.carga = cargaDefecto;
	}
	
	public Lavadora(double precioBase, double peso) {
		super(precioBase, peso);
		this.carga = cargaDefecto;
	}

	public Lavadora(double precioBase, String color, char consumoEnergetico, double peso, int carga) {
		super(precioBase, color, consumoEnergetico, peso);
		this.carga = carga;
	}

	public int getCarga() {
		return carga;
	}
	
	public double precioFinal() {
		double dev = super.precioFinal();
		if(carga > 30)
			dev+= 50;
		return dev;
		
	}
	
	
}
