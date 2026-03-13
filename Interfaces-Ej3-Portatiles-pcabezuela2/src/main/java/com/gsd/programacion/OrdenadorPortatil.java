package com.gsd.programacion;

public abstract class OrdenadorPortatil implements Encendible{
	private String marca;
	private String modelo;
	private int tamano_pantalla;
	
	public OrdenadorPortatil(String marca, String modelo, int tamano_pantalla) {
		this.marca = marca;
		this.modelo = modelo;
		this.tamano_pantalla = tamano_pantalla;
	}
	
	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public int getTamano_Pantalla() {
		return tamano_pantalla;
	}
	
	public void enceder() {
		
	}
	
	public void apagar() {
		
	}

	public abstract void mostrar_informacion();
}
