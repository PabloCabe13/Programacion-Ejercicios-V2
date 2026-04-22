package com.gsd.programacion;

public abstract class EmpleadoBase implements Empleable{
	int numIdentificacion;
	String nombre;
	int edad;
	double Salario;
	
	public EmpleadoBase(int numIdentificacion, String nombre, int edad, double salario) {
		this.numIdentificacion = numIdentificacion;
		this.nombre = nombre;
		this.edad = edad;
		Salario = salario;
	}

	public int getNumIdentificacion() {
		return numIdentificacion;
	}

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	public double getSalario() {
		return Salario;
	}

	@Override
	public String toString() {
		return "EmpleadoBase - Numero de Identificacion: " + numIdentificacion + ", Mombre: " + nombre + ", Edad: " + edad
				+ ", Salario: " + Salario ;
	}
	
	
}
