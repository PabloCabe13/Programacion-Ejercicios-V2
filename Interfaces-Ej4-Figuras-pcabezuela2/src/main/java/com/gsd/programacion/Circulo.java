package com.gsd.programacion;

public class Circulo implements FiguraGeometrica {
	private double radio;
	
	public Circulo(double radio) {
		this.radio = radio;
	}
	
	public double getRadio() {
		return radio;
	}
	
	public double calcularArea() {
		double area = Math.PI * (radio*radio);
		return area;
	}
	
	public double calcularPerimetro() {
		double perimetro = 2 * Math.PI * radio;
		return perimetro;
	}
}
