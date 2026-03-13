package com.gsd.programacion;

public abstract class Medio implements Reproducible{
	private int duracion;
	private String nombre;
	private boolean estado; //false es parado, true es ejec
	
	public Medio(int duracion, String nombre) {
		this.duracion = duracion;
		this.nombre = nombre;
		this.estado = false;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public int getDuracion() {
		return duracion;
	}

	public String getNombre() {
		return nombre;
	}

	@Override
	public void reproducir() {
		System.out.println("Reproduciendo Medio");
		setEstado(true);
	}

	@Override
	public String toString() {
		return "Medio [duracion=" + duracion + ", nombre=" + nombre + ", estado=" + estado + "]";
	}
	
	
	
	
}
