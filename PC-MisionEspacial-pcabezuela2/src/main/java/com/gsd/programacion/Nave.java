package com.gsd.programacion;
public abstract class Nave implements Navegable{
	 String nombre;
	 double combustible;
	 int nivelEnergia;
	 Destino UbicacionActual;
	 
	 public Nave(String nombre, double combustible, int nivelEnergia, Destino ubicacionActual) 
	 throws NaveInvalidaException{
		this.nombre = nombre;
		this.combustible = combustible;
		this.nivelEnergia = nivelEnergia;
		this.UbicacionActual = ubicacionActual;
	 }
	 
	 
	 
	 //GETTERS
	 public String getNombre() {
		return nombre;
	}

	 public double getCombustible() {
		 return combustible;
	 }

	 public int getNivelEnergia() {
		 return nivelEnergia;
	 }

	 public Destino getUbicacionActual() {
		 return UbicacionActual;
	 }
	 //FIN GETTERS
	 
	 
	 
	 //SETTERS
	 public void setNombre(String nombre)  {
		this.nombre = nombre;
	 }

	 public void setCombustible(double combustible) {
		 this.combustible = combustible;
	 }

	 public void setNivelEnergia(int nivelEnergia) {
		 this.nivelEnergia = nivelEnergia;
	 }

	 public void setUbicacionActual(Destino ubicacionActual) {
		 UbicacionActual = ubicacionActual;
	 }
	 //FIN SETTERS
	
	 
	 
	 //METODOS
	 public abstract void mostrarReporte();

	 public abstract boolean tieneAutonomia(double distancia);
	 
	 @Override
	 public void viajar(Destino destino) throws CombustibleInsuficienteException {
		boolean tieneAutonomia = tieneAutonomia(destino.distanciaAl());
		if(!tieneAutonomia) {
			throw new CombustibleInsuficienteException("Combustible Insuficiente");
		}
	 }
	 
	 
}
