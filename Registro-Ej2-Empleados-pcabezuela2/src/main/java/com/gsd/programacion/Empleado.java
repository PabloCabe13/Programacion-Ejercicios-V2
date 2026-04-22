package com.gsd.programacion;
import java.util.*;
public record Empleado(int idEmpresa, String nombre, int edad, double salario, List <Habilidad> habilidades) {
	
	public boolean aniadirHabilidad(Habilidad habilidad) {
		for(Habilidad h : habilidades) {
			if(h.getNombre().equalsIgnoreCase(habilidad.getNombre())) {
				System.err.println("Ya tiene esa habilidad");
				return false;
			}
		}
		habilidades.add(habilidad);
		System.out.println("Habilidad añadida");
		return true;
	}
	
	public boolean eliminarHabilidad(Habilidad habilidad) {
		for(Habilidad h : habilidades) {
			if(h.getNombre().equalsIgnoreCase(habilidad.getNombre())) {
				habilidades.remove(habilidad);
				System.out.println("Habilidad Eliminada.");
				return true;
			}
		}
		System.err.println("El estudiante no tiene esa habilidad");
		return false;
	}
}
