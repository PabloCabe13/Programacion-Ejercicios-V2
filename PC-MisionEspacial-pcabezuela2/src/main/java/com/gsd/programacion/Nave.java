package com.gsd.programacion;
public abstract class Nave implements Navegable{
	 String nombre;
	 double combustible;
	 int nivelEnergia;
	 Destino UbicacionActual;
	 
	 public Nave(String nombre, double combustible, int nivelEnergia, Destino ubicacionActual) 
	 throws NaveInvalidaException{
		this.nombre = nombre;
		setCombustible(combustible);
		setNivelEnergia(nivelEnergia);
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

	 public void setCombustible(double combustible) throws NaveInvalidaException {
		 if(combustible < 0 || combustible > 100) {
			 throw new NaveInvalidaException("Combustible debe ser entre 0 y 100");
		 }
		 this.combustible = combustible;
	 }

	 public void setNivelEnergia(int nivelEnergia) throws NaveInvalidaException  {
		 if(nivelEnergia < 1 || nivelEnergia > 5) {
			 throw new NaveInvalidaException("Nivel de energía debe ser entre 1 y 5");
		 }
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
		setUbicacionActual(destino); 
	 }
	 
	 
}
