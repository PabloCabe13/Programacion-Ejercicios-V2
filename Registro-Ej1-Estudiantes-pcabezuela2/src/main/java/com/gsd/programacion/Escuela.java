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
		System.out.println("\n------- ALUMNOS DEL COLEGIO -------");
		for(int matricula : estudiantes.keySet()) {
			Persona estudiante = estudiantes.get(matricula);
			System.out.println("- " + estudiante.toString());
		}
	}
	
	public void buscarEstudiante(String nombre){
		for(int matricula : estudiantes.keySet()) {
			Persona estudiante = estudiantes.get(matricula);
			if(estudiante.nombre().equalsIgnoreCase(nombre)) {
				System.out.println("\n---- ESTUDIANTE " + estudiante.nombre() + " ----");
				System.out.println("- " + estudiante.toString());
				return;
			}
		}
		System.err.println("No existe ese alumno");
		return;
	}
	
	public boolean actualizarInfoEstu(int NumMatricula, int NuevaEdad, String grado) {
		for(int matricula : estudiantes.keySet()) {
			if(matricula == NumMatricula) {
				Persona estudiante = estudiantes.get(matricula);
				Persona estuActualizado = new Persona (estudiante.nombre(), estudiante.numMatricula(), NuevaEdad, grado, estudiante.notas());
				estudiantes.put(matricula, estuActualizado);
				System.out.println("Estudiante actualizado");
				return true;
			}
		}
		System.err.println("Error");
		return false;
	}
	
	public void calcularMediaNotas () {
		int estus = 0;
		double MediaFinal = 0;
		for(int m : estudiantes.keySet()) {
			Persona estudiante = estudiantes.get(m);
			int NumNotas = 0;
			double notas = 0;
			for(Double nota : estudiante.notas()) {
				notas += nota;
				NumNotas++;
			}
			double MediaEstudiante = (double) notas / NumNotas;
			MediaFinal += MediaEstudiante;
			estus++;
		}
		
		MediaFinal /= estus;
		System.out.println("La nota media de todos los alumnos es " + MediaFinal);
	}
}
