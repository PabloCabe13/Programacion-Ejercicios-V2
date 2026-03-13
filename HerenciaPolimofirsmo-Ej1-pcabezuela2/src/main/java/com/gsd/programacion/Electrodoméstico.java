package com.gsd.programacion;

public class Electrodoméstico {
	
	private static final double precioDefecto = 100;
	private static final double pesoDefecto = 5;
	
	private double precioBase;
	private String color;
	private char consumoEnergetico;
	private double peso;
	
	public Electrodoméstico() {
		this.precioBase = precioDefecto;
		this.color = "Blanco";
		this.consumoEnergetico = 'F';
		this.peso = pesoDefecto;
	}
	
	public Electrodoméstico (double precioBase, double peso) {
		this.precioBase = precioBase;
		this.peso = peso;
		this.consumoEnergetico = 'F';
		this.color = "Blanco";
	}
	
	public Electrodoméstico (double precioBase, String color, char consumoEnergetico,double peso) {
		this.precioBase = precioBase;
		this.color = comprobarColor(color);
		this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
		this.peso = peso;
	}
	
	private char comprobarConsumoEnergetico (char letra) {
		if(letra >= 'A' && letra <= 'F') {
			return letra;
		}
		if(letra >= 'a' && letra <= 'f') {
			return letra;
		}
		return 'F';
		
	}
	
	private String comprobarColor(String color) {
		//negro, rojo , azul , gris
		if("Negro".equalsIgnoreCase(color))
			return color;
		if("Rojo".equalsIgnoreCase(color))
			return color;
		if("Azul".equalsIgnoreCase(color))
			return color;
		if("gris".equalsIgnoreCase(color))
			return color;
		return "Blanco";
	}
	
	public double precioFinal() {
		double dev = precioBase;
		
		switch(consumoEnergetico) {
		case 'a':
		case 'A':
			dev+= 100;
			break;
			
		case 'b':
		case 'B':
			dev+= 80;
			break;
			
		case 'c':
		case 'C':
			dev+= 60;
			break;
			
		case 'd':
		case 'D':
			dev+= 50;
			break;
			
		case 'e':
		case 'E':
			dev+= 30;
			break;
			
		default:
			dev+= 100;
			break;
		}
		
		if(peso <= 19)
			dev +=10;
		if(peso >= 20 && peso <= 49)
			dev += 50;
		if(peso >= 50 && peso <= 79)
			dev += 80;
		if(peso >= 80)
			dev+=100;
		return dev;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public String getColor() {
		return color;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public double getPeso() {
		return peso;
	}
	
}
