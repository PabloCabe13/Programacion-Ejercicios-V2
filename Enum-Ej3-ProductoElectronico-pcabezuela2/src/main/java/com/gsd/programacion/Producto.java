package com.gsd.programacion;

public class Producto {
	private String nombre;
	private String marca;
	private double precio;
	private TipoProducto tipo_de_producto;
	
	public Producto(String nombre, String marca, double precio, TipoProducto tipo_de_producto) {
		super();
		this.nombre = nombre;
		this.marca = marca;
		this.precio = precio;
		this.tipo_de_producto = tipo_de_producto;
	}

	public String getNombre() {
		return nombre;
	}

	public String getMarca() {
		return marca;
	}

	public double getPrecio() {
		return precio;
	}

	public TipoProducto getTipo_de_producto() {
		return tipo_de_producto;
	}

	@Override
	public String toString() {
		return "Producto " + nombre + ", Marca: " + marca + ", Precio: " + precio + ", Tipo de Producto: "
				+ tipo_de_producto + "\n-----------------";
	}
	
	
	
}
