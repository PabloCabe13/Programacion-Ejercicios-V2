package com.gsd.programacion;

public class Password {
	private int longitud;
	private String contraseña;
	
	public Password (){
		this.longitud = 8;
		generarPassword();
	}
	public Password(int longitud, String contraseña) {
		this.longitud = longitud;
		generarPassword();
	}
	
	public int getLongitud() {return longitud;}
	public void setLongitud(int longitud) {this.longitud = longitud;}
	public String getContraseña() {return contraseña;}
	
	public void generarPassword() {
		String Contraseña = "";
		int tipo;
		for(int i = 0; i < longitud; i++) {
			tipo = (int)(Math.random()*10);
			Contraseña += String.valueOf(tipo);
		}
	}
}
