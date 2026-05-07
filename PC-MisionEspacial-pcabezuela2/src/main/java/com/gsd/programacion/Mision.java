package com.gsd.programacion;

public record Mision(String id, Destino destino, double riesgoAmbiental) {
	public EstadoMision calculoExito(Nave nave) {
		double probabilidadExito = 0.70;
		EstadoMision completada = EstadoMision.COMPLETADA;
		EstadoMision fallida = EstadoMision.FALLIDA;
		
		if(nave instanceof Exploradora){
			probabilidadExito += 0.15;
		}
		if(nave.getNivelEnergia() < 3) {
			probabilidadExito -= 0.10;
		}
		probabilidadExito -= riesgoAmbiental;
		
		if(Math.random() < probabilidadExito) {
			return completada;
		}else {
			return fallida;
		}
		
	}
}
