package com.gsd.programacion;

public class Tanque implements UnidadMilitar{
	private String modelo;
	private String blindaje;
	private String armamento;
	
	public Tanque(String modelo, String blindaje, String armamento) {
		super();
		this.modelo = modelo;
		this.blindaje = blindaje;
		this.armamento = armamento;
	}

	public String getModelo() {
		return modelo;
	}

	public String getBlindaje() {
		return blindaje;
	}

	public String getArmamento() {
		return armamento;
	}
	
	public void mover() {
		
	}
	
	public void atacar() {
		
	}
	
	public void recibirDanio() {
		
	}
}
