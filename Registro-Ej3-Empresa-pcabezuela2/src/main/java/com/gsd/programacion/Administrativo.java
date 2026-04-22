package com.gsd.programacion;

public class Administrativo extends EmpleadoBase{
	String controlDeVersiones;
	String documentacion;
	
	public Administrativo(int numIdentificacion, String nombre, int edad, double salario, String controlDeVersiones, String documentacion) {
		super(numIdentificacion, nombre, edad, salario);
		this.controlDeVersiones = controlDeVersiones;
		this.documentacion = documentacion;
	}

	public String getControlDeVersiones() {
		return controlDeVersiones;
	}

	public String getDocumentacion() {
		return documentacion;
	}

	@Override
	public void calcularSalario() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mostrarDetalles() {
		System.out.println();
		
	}

	@Override
	public String toString() {
		return super().toString() +"Administrativo [controlDeVersiones=" + controlDeVersiones + ", documentacion=" + documentacion + "]";
	}
	
	
	
}
