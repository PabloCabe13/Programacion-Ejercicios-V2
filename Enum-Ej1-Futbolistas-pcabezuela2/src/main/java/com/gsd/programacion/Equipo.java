package com.gsd.programacion;

public enum Equipo {
	ATLETICO_DE_MADRID("Atletico de Madrid", 4, "Cholo"),
	BARCA("FC Barcelona", 1 , "Flick"),
	VILLAREAL("Villareal FC", 3, "Marcelino");
	
	private String nombreClub;
	private int pos;
	private String entrenador;
	
	private Equipo (String nombre, int pos, String entrenador) {
		this.nombreClub = nombre;
		this.pos = pos;
		this.entrenador = entrenador;
	}

	public String getNombreClub() {
		return nombreClub;
	}

	public int getPos() {
		return pos;
	}

	public String getEntrenador() {
		return entrenador;
	}

	public void setNombreClub(String nombreClub) {
		this.nombreClub = nombreClub;
	}

	public void setPos(int pos) {
		this.pos = pos;
	}

	public void setEntrenador(String entrenador) {
		this.entrenador = entrenador;
	}
	
	
}
