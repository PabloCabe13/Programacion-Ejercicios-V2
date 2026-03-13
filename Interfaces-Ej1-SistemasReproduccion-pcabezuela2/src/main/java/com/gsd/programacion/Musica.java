package com.gsd.programacion;

public class Musica extends Medio {
	
	private String artista;

	public Musica(int duracion, String nombre, String artista) {
		super(duracion, nombre);
		this.artista = artista;
	}
	
	public String getArtista() {
		return artista;
	}

	@Override
	public void pausar() {
		// TODO Auto-generated method stub
		System.out.println("La cancion " + getNombre() + " esta pausada.");
		setEstado(false);
	}
	
	@Override
	public void detener() {
		// TODO Auto-generated method stub
		System.out.println("La cancion " + getNombre() + " esta detenida.");
		setEstado(false);
	}
	
	public void reproducir() {
		System.out.println("La cancion " + getNombre() + " se esta reproduciendo.");
		setEstado(true);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
	
	
}
