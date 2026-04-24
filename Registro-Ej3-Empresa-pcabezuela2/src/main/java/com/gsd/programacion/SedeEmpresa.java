package com.gsd.programacion;
import java.util.*;
public record SedeEmpresa(String direccion, List<EmpleadoBase> empleados) {
	
	public boolean aniadirEmpleado(EmpleadoBase nuevoEmpleado) {
		for(EmpleadoBase e : empleados) {
			if(e.getNumIdentificacion() == nuevoEmpleado.getNumIdentificacion()) {
				System.err.println("El empleado ya existe");
				return false;
			}
		}
		empleados.add(nuevoEmpleado);
		System.out.println("Nuevo empleado añadido correctamente");
		return true;
	}
	
	public void calcularSalarioTotal() {
		System.out.println("\n----- SALARIO TOTAL DE LA EMPRESA -----");
		double salarioTotal = 0;
		for(EmpleadoBase e : empleados) {
			salarioTotal += e.getSalario();
		}
		System.out.println("El salario total de la empresa es de: " + salarioTotal);
	}
	
	public void mostrarInfoEmpleados() {
		System.out.println("\n----- INFORMACIÓN DE EMPLEADOS ----- ");
		for(EmpleadoBase e : empleados) {
			System.out.println(e.toString());
		}
	}
}
