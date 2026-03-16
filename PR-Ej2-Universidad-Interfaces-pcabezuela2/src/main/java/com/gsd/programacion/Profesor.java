package com.gsd.programacion;

public class Profesor extends PersonalUniversitario{
	private String departamento;
	private String asignatura;
	private float salario;
	
	public Profesor(String nombre, String DNI, int edad, String departamento, String asignatura, float salario) {
		super(nombre, DNI, edad);
		this.departamento = departamento;
		this.asignatura = asignatura;
		this.salario = salario;
	}

	public String getDepartamento() {
		return departamento;
	}

	public String getAsignatura() {
		return asignatura;
	}

	public float getSalario() {
		return salario;
	}
	
	public void realizarTarea() {
		System.out.println("El profesor " + getNombre() + " esta impartiendo la asignatura " + getAsignatura());
	}
	
	
}
