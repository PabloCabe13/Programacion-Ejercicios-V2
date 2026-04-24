package com.gsd.programacion;

public class Tecnico extends EmpleadoBase{
	private String categoria;
	private int nivel;
	
	public Tecnico(int numIdentificacion, String nombre, int edad, double salario, String categoria, int nivel) {
		super(numIdentificacion, nombre, edad, salario);
		this.categoria = categoria;
		this.nivel = nivel;
	}

	public String getCategoria() {
		return categoria;
	}

	public int getNivel() {
		return nivel;
	}

	@Override
	public void calcularSalario() {
		
	}

	@Override
	public void mostrarDetalles() {
		
	}

	@Override
	public String toString() {
		return super.toString() + " - TECNICO - Categoria: " + categoria + ", Nivel: " + nivel;
	}
	
	
}
