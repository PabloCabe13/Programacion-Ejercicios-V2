package com.gsd.programacion;
import java.util.*;

public class Senderista {
	private String nombre;
	private List <String> senderosRecorridos;
	
	public Senderista(String nombre) {
		super();
		this.nombre = nombre;
		this.senderosRecorridos = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public List<String> getSenderosRecorridos() {
		return senderosRecorridos;
	}

	@Override
	public String toString() {
		return "Senderista " + nombre + ", Senderos Recorridos: " + senderosRecorridos;
	}
	
	
	
}
