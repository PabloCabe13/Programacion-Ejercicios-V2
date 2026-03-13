package com.gsd.programacion;

public class Producto {
	private int codigo;
	private String nombre;
	private double precio;
	private int stock;
	
	public Producto () {
		this.codigo = 0;
		this.nombre = "Sin nombre";
		this.precio = 0.0;
		this.stock = 1;
	}
	
	public Producto (int codigo, String nombre, double precio, int stock) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		if(stock <= 0) {
			this.stock = 0;
		}
		this.stock = stock;
	}
	
	public String toString() {
		return "\nPRODUCTO " + "\nCodigo del producto: " + codigo + "\nNombre del producto: " + nombre + "\nPrecio del producto: " + precio + "\nNumero de Stock: " + stock +"\n";
	}
}
