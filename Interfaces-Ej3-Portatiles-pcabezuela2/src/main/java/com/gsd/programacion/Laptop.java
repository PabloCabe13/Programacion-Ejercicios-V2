package com.gsd.programacion;

public class Laptop extends OrdenadorPortatil{
	private int capacidad_almacen;
	private double peso;
	
	public Laptop(int capacidad_almacen, double peso, String marca, String modelo, int tamano_pantalla) {
		super(marca, modelo, tamano_pantalla);
		this.capacidad_almacen = capacidad_almacen;
		this.peso = peso;
	}
	
	public int getCapacidadAlmacen() {
		return capacidad_almacen;
	}
	
	public double getPeso() {
		return peso;
	}
	
	public void mostrar_informacion() {
		System.out.println("La marca del Laptop es: " + getMarca() + "\nModelo: " + getModelo() + "\nTamaño de pantalla del Laptop: " + getTamano_Pantalla());
	}
}
