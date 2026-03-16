package com.gsd.programacion;

public class PersonalAdministrativo extends PersonalUniversitario{
	private String puesto;
	private String area;
	
	public PersonalAdministrativo(String nombre, String DNI, int edad, String puesto, String area) {
		super(nombre, DNI, edad);
		this.puesto = puesto;
		this.area = area;
	}

	public String getPuesto() {
		return puesto;
	}

	public String getArea() {
		return area;
	}

	@Override
	public void realizarTarea() {
		System.out.println("Administrativo " + getNombre() + " tiene el puesto de " + getPuesto() + " en el area de " + getArea());
	}
	
	
}
