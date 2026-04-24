package com.gsd.programacion;

public class Gerente extends EmpleadoBase{
	private double bonoAnual;
	private int capacidadEquipo;
	
	public Gerente(int numIdentificacion, String nombre, int edad, double salario, double bonoAnual, int capacidadEquipo) {
		super(numIdentificacion, nombre, edad, salario);
		this.bonoAnual = bonoAnual;
		this.capacidadEquipo = capacidadEquipo;
	}

	public double getBonoAnual() {
		return bonoAnual;
	}

	public int getCapacidadEquipo() {
		return capacidadEquipo;
	}

	@Override
	public void calcularSalario() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mostrarDetalles() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return super.toString() +  " - GERENTE - Bono Anual: " + bonoAnual + ", Capacidad de Equipo: " + capacidadEquipo;
	}
	
	
}
