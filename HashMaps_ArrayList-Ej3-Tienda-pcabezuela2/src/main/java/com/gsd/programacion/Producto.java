package com.gsd.programacion;

public class Producto {
	private String nombre;
	private int unidades;
	private float precio;
	
	public Producto(String nombre,int unidades, float precio) {
		this.nombre = nombre;
		this.unidades = unidades;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public int getUnidades() {
		return unidades;
	}

	public float getPrecio() {
		return precio;
	}

	
	
	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Producto: " + nombre + "\nUnidades= " + unidades + "\nPrecio =" + precio;
	}
	
	
}
