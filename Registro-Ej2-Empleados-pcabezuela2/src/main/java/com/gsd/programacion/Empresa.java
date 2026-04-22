package com.gsd.programacion;
import java.util.*;
public class Empresa {
	Map <Integer, Empleado> empleados;
	
	public Empresa() {
		this.empleados = new HashMap<>();
	}
	
	public boolean aniadirEmpleado(Empleado emp) {
		for(int idEmp : empleados.keySet()) {
			if(idEmp == emp.idEmpresa()) {
				System.err.println("El empleado ya está en esta empresa");
				return false;
			}
		}
		empleados.put(emp.idEmpresa(), emp);
		System.out.println("Empleado " +  emp.nombre() + " añadido.");
		return true;
	}
	
	public void mostrarEmpleados() {
		System.out.println("\n----- INFORMACIÓN DE LOS EMPLEADOS -----");
		for(Empleado e : empleados.values()) {
			System.out.println("\n- " + e.toString()); 
		}
	}
	
	public void calcularSalarioPromedio() {
		System.out.println("\n----- SALARIO PROMEDIO -----");
		double SalarioTotal = 0;
		int numEmpleados = 0;
		for(Empleado e : empleados.values()) {
			double SalarioEmpleado = e.salario();
			SalarioTotal += SalarioEmpleado;
			numEmpleados++;
		}
		System.out.println("El salario promedio de la empresa es: " + SalarioTotal/numEmpleados);
	}
}
