package com.gsd.programacion;

public class Television extends Electrodoméstico {
	private int resolucion;
	private boolean tdt;
	
	public Television(){
		super();
		this.resolucion = 20;
		this.tdt = false;
	}

	public Television(double precioBase, double peso, int resolucion, boolean tdt) {
		super(precioBase, peso);
		this.resolucion = 20;
		this.tdt = false;
	}

	public Television(double precioBase, String color, char consumoEnergetico, double peso, int resolucion,boolean tdt) {
		super(precioBase, color, consumoEnergetico, peso);
		this.resolucion = resolucion;
		this.tdt = tdt;
	}

	public int getResolucion() {
		return resolucion;
	}

	public boolean isTdt() {
		return tdt;
	}

	@Override
	public double precioFinal() {
		// TODO Auto-generated method stub
		double dev =  super.precioFinal();
		if(resolucion > 40)
			dev *= 1.3;
		if(isTdt())
			dev +=50;
		return dev;
	}
	
	
	
}
