package com.gsd.programacion;
public abstract class Nave implements Navegable{
	 String nombre;
	 double combustible;
	 int nivelEnergia;
	 Destino ubicacionActual;
	 protected double distanciaRecorrida = 0.0;
	 
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
		 return ubicacionActual;
	 }
	 
	 public double getDistanciaRecorrida() { 
		 return distanciaRecorrida; 
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
		 this.ubicacionActual = ubicacionActual;
	 }
	 //FIN SETTERS
	
	 
	 
	 //METODOS
	 public abstract void mostrarReporte();
	 protected abstract double calcularConsumo(double distancia);
	 
	 public void repostar() throws EstadisticaInvalidaException, FueraDeSectorException {
	     if (this.ubicacionActual == null) {
	         setCombustible(100); 
	         System.out.println("El Combustible de la nave " + nombre + " restaurado al 100%.");
	     } else {
	         throw new FueraDeSectorException("ERROR: La nave " + nombre + " está en " + ubicacionActual.planeta() + ". No se puede repostar fuera de la Base Estelar.");
	     }
	 }

	 public abstract boolean tieneAutonomia(double distancia);
	 
	 @Override
	 public void viajar(Destino destino) throws CombustibleInsuficienteException, EstadisticaInvalidaException {
	     double consumo = calcularConsumo(destino.distanciaAl());
	     
	     if (consumo > this.combustible) {
	         throw new CombustibleInsuficienteException("La nave " + nombre + " no tiene combustible para este viaje.");
	     }
	     
	     setCombustible(this.combustible - consumo);
	     
	     setUbicacionActual(destino);
	     
	     this.distanciaRecorrida += destino.distanciaAl();
	     
	     System.out.println("Viaje realizado con éxito a " + destino.planeta() + ". Consumo: " + consumo);
	 }
	 
	 
}
