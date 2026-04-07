package com.gsd.programacion;

public class Jugador {
	private String nombre;
	private int dorsal;
	private Demarcacion dem;
	private Equipo equipo;
	
	public Jugador(String nombre, int dorsal, Demarcacion dem, Equipo equipo) {
		this.nombre = nombre;
		this.dorsal = dorsal;
		this.dem = dem;
		this.equipo = equipo;
	}

	public String getNombre() {
		return nombre;
	}

	public int getDorsal() {
		return dorsal;
	}

	public Demarcacion getDem() {
		return dem;
	}

	public Equipo getEquipo() {
		return equipo;
	}
	
	public void bajarPosicion() {
		this.equipo.setPos(this.equipo.getPos()+1);
	}

	@Override
	public String toString() {
		return "Jugador " + nombre + "\nDorsal: " + dorsal + "\nPosicion: " + dem + "\nEquipo: " + equipo.getNombreClub() + "\nPosicion en la tabla: " + equipo.getPos();
	}
	
	
	
}
