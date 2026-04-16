package com.gsd.programacion;
import java.util.*;
public class Escuela {
	private Map <Integer, Persona> estudiantes;
	
	public Escuela() {
		this.estudiantes = new HashMap<>();
	}
	
	public boolean aniadirEstudiante(Persona estudiante) {
		for(int matricula : estudiantes.keySet()) {
			if(matricula == estudiante.numMatricula()) {
				System.err.println("El estudiante ya existe");
				return false;
			}
		}
		estudiantes.put(estudiante.numMatricula(), estudiante);
		System.out.println("Estudiante " + estudiante.nombre() + " añadido");
		return false;
	}
	
	public boolean aniadirNota(int NumMatricula, double nota) {
		Persona estudiante = estudiantes.get(NumMatricula);
		if(estudiante != null) {
			estudiante.notas().add(nota);
			System.out.println("Nota Añadida");
			return true;
		}
		System.err.println("El alumno no existe");
		return false;
	}
	
	public void mostrarEstudiantes() {
		System.out.println("------- ALUMNOS DEL COLEGIO -------");
		for(int matricula : estudiantes.keySet()) {
			Persona estudiante = estudiantes.get(matricula);
			System.out.println(estudiante.toString());
		}
	}
}
