package com.gsd.programacion;
public abstract class Nave implements Navegable{
	 String nombre;
	 double combustible;
	 int nivelEnergia;
	 Destino UbicacionActual;
	 
	 public Nave(String nombre, double combustible, int nivelEnergia, Destino ubicacionActual) 
	 throws EstadisticaInvalidaException{
		this.nombre = nombre;
		setCombustible(combustible);
		setNivelEnergia(nivelEnergia);
		setUbicacionActual(ubicacionActual);
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

	 public void setCombustible(double combustible) throws EstadisticaInvalidaException {
		 if(combustible < 0 || combustible > 100) {
			 throw new EstadisticaInvalidaException("Combustible debe ser entre 0 y 100");
		 }
		 this.combustible = combustible;
	 }

	 public void setNivelEnergia(int nivelEnergia) throws EstadisticaInvalidaException  {
		 if(nivelEnergia < 1 || nivelEnergia > 5) {
			 throw new EstadisticaInvalidaException("Nivel de energía debe ser entre 1 y 5");
		 }
		 this.nivelEnergia = nivelEnergia;
	 }

	 public void setUbicacionActual(Destino ubicacionActual) {
		 if(ubicacionActual == null) {
			 ubicacionActual = new Destino ("Base Estelar", 0);			
			 UbicacionActual = ubicacionActual;
		 }else{
			 UbicacionActual = ubicacionActual;
		 }
	 }
	 //FIN SETTERS
	
	 
	 
	 //METODOS
	 public abstract void mostrarReporte();

	 public abstract boolean tieneAutonomia(double distancia);
	 
	 @Override
	 public void viajar(Destino destino) throws CombustibleInsuficienteException, EstadisticaInvalidaException {
		boolean tieneAutonomia = tieneAutonomia(destino.distanciaAl());
		if(!tieneAutonomia) {
			throw new CombustibleInsuficienteException("Combustible Insuficiente");
		}
		setUbicacionActual(destino); 
		Mision mision = new Mision("A-01", destino, 0.2);
		
		EstadoMision resultado = mision.calculoExito(this);
		System.out.println("Resultado de la misión: " + resultado);
	 }
	 
	 
}
