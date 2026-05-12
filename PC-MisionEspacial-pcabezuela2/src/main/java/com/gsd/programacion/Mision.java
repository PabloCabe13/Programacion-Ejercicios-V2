package com.gsd.programacion;

public record Mision(String id, Destino destino, double riesgoAmbiental) {
	
	public EstadoMision calculoExito(Nave nave) {
		double probabilidadExito = 0.70; 
		
		if(nave instanceof Exploradora){
			probabilidadExito += 0.15; 
			probabilidadExito -= (riesgoAmbiental / 2); 
		} else {
			probabilidadExito -= riesgoAmbiental;
		}
		
		if(nave.getNivelEnergia() < 3 && !(nave instanceof Militar)) {
		    probabilidadExito -= 0.10;
		}
		
		if(Math.random() <= probabilidadExito) {
			return EstadoMision.COMPLETADA;
		} else {
			return EstadoMision.FALLIDA;
		}
	}
}
