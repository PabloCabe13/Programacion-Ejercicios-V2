package com.gsd.programacion;

public class Rectangulo implements FiguraGeometrica{
	private double longitud;
	private double ancho;
	
	public Rectangulo(double longitud, double ancho) {
		this.longitud = longitud;
		this.ancho = ancho;
	}
	
	public double getLongitud() {
		return longitud;
	}
	
	public double getAncho() {
		return ancho;
	}
	
	public double calcularArea() {
		double area = longitud * ancho;
		return area;
	}
	
	public double calcularPerimetro() {
		double perimetro = (2*longitud) + (2*ancho);
		return perimetro;
	}
}
