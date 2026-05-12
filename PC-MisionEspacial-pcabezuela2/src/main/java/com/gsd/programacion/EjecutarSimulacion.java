package com.gsd.programacion;
import java.util.*;
import java.util.stream.Collectors;
public class EjecutarSimulacion {
    public static void ejecutarSimulacion(List<Nave> naves, List<Destino> planetas) {
    	List<EstadoMision> historial = new ArrayList<>();
    	List<Nave> navesDERIVA = new ArrayList<Nave>();
    	
    	for (Nave nave : naves) {
    		System.out.println("\n----- Iniciando simulacro para la nave " + nave.getNombre() + " -----");
    		nave.mostrarReporte();
    		EstadoMision estadoAnterior = EstadoMision.COMPLETADA;
    		
    		// Misiones
    		Destino ultimoDestino = null; 
    		for (int i = 0; i < 3; i++) {
    		    if (estadoAnterior == EstadoMision.COMPLETADA || estadoAnterior == EstadoMision.FALLIDA) {
    		        String id = "M" + i;
    		        int numeroAleatorio = (int)(Math.random() * planetas.size());
    		        Destino destino = planetas.get(numeroAleatorio);
    		        double riesgoAmbiental = Math.random() * 0.2;
    		        
    		        Mision mision = new Mision(id, destino, riesgoAmbiental);
    		        System.out.println("Intentando " + id + " hacia " + destino.planeta());
    		        
    		        try {
    		            nave.viajar(mision.destino());
    		            ultimoDestino = destino; 
    		            estadoAnterior = mision.calculoExito(nave);    	
    		        } catch(CombustibleInsuficienteException | EstadisticaInvalidaException e) {
    		            System.err.println("Error " + e);
    		            estadoAnterior = EstadoMision.FALLIDA;
    		        }
    		        historial.add(estadoAnterior);
    		    }
    		}
    		// Volver a Base
    		System.out.println("Intentando regresar a Base Estelar...");

    		if (ultimoDestino != null && nave.tieneAutonomia(ultimoDestino.distanciaAl())) {
    		    Destino base = new Destino("Base Estelar", ultimoDestino.distanciaAl());
    		    try {
    		        nave.viajar(base);
    		        nave.setUbicacionActual(null);
    		        System.out.println("Regreso exitoso. La nave está lista para repostar.");
    		        nave.repostar();
    		    } catch (CombustibleInsuficienteException | EstadisticaInvalidaException | FueraDeSectorException e) {
    		        System.err.println("¡ALERTA! La nave se ha quedado sin combustible.");
    		        navesDERIVA.add(nave);
    		    }
    		} else {
    		    System.err.println("¡ALERTA! La nave " + nave.getNombre() + " no tiene combustible para volver. Queda en DERIVA.");
    		    navesDERIVA.add(nave);
    		}
    	}
    	
    	System.out.println("\n----- REPORTE FINAL ------");
    	List <String> nombresDeriva = naves.stream()
    			.filter(n -> navesDERIVA.contains(n))
    			.map(Nave :: getNombre)
    			.toList();
    	System.out.println("- Naves en DERIVA: " + nombresDeriva);
    	
    	Map<EstadoMision, Long> conteoMisiones = historial.stream()
    			.collect(Collectors.groupingBy(estado -> estado, Collectors.counting()));
    	System.out.println("- Historial general de misiones: " + conteoMisiones);
    	
    	naves.stream()
    		.max(Comparator.comparingDouble(Nave::getDistanciaRecorrida))
    		.ifPresent(n -> System.out.println("- Nave que más ha viajado: " + n.getNombre() + " (" + n.getDistanciaRecorrida() + ")"));
    	
    	naves.stream()
	        .mapToDouble(Nave::getCombustible)
	        .average()
	        .ifPresent(media -> System.out.println("- Promedio de combustible de la flota: " + media + "%"));
    	System.out.println("--------------------------------");
    }
}
