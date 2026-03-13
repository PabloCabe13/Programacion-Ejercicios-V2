package com.gsd.programacion;

public class Pelicula extends Medio {
	private String director;

	public Pelicula(int duracion, String nombre, String director) {
		super(duracion, nombre);
		this.director = director;
	}
	
	public void volverAVer() {
		System.out.println("Estoy viendo de nuevo la peli: " + getNombre());
	}
	
	public String getDirector() {
		return director;
	}

	@Override
	public void pausar() {
		// TODO Auto-generated method stub
		System.out.println("La pelicula " + getNombre() + " esta pausada.");
		setEstado(false);
	}
	
	@Override
	public void detener() {
		// TODO Auto-generated method stub
		System.out.println("La pelicula " + getNombre() + " esta detenida.");
		setEstado(false);
	}
	
	
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
