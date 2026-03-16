package com.gsd.programacion;
import java.util.*;

public class Olimpiada {
	private Map <String, List<Deportista>> mapNaciones;
	private String sede;
	private int anio;
	
	public Olimpiada(String sede, int anio) {
		this.mapNaciones = new HashMap<>();
		this.sede = sede;
		this.anio = anio;
	}

	public String getSede() {
		return sede;
	}

	public int getAnio() {
		return anio;
	}
	
	public boolean addDeportista(Deportista d) {
		String nacionalidad = d.getNacionalidad().toUpperCase();
		if(existeDeportista(d)) {
			System.err.println("Ya existe un deportista con ese ID en estas olimpiada de " + getSede());
			return false;
		}
		
		if(!mapNaciones.containsKey(nacionalidad)) {
			List <Deportista>listaDeportistas = new ArrayList <>();
			mapNaciones.put(nacionalidad, listaDeportistas);
		}
			mapNaciones.get(nacionalidad).add(d);
		
		System.out.println("Deportista " + d.getNombre() + " añadido!");
		return true;
	}
	
	public boolean existeDeportista (Deportista d) {
		for(List<Deportista> lista : mapNaciones.values()) {
			for(Deportista temp : lista) {
				if (temp.getID() == (d.getID())) {
					return true;
				}
			}
		}
		return false;
	}
	
	public void showAll() {
		System.out.println("\n----- NACIONALIDADES -----");
		for(String n : mapNaciones.keySet()) {
			 System.out.print(n);
			 int deportistas = mapNaciones.get(n).size();
			 System.out.println(" - Num de deportistas: " + deportistas );
		}
	}
	
	public void showNacionalidad(String nacionalidad) {
		nacionalidad = nacionalidad.toUpperCase();
		if(mapNaciones.containsKey(nacionalidad)) {
			System.out.print("\nNacionalidad buscada: " + nacionalidad);
			 int deportistas = mapNaciones.get(nacionalidad).size();
			 System.out.println(" - Num de deportistas: " + deportistas );
			 return;
		}else {
			System.err.println("\nNo existe esa nacionalidad buscada: " + nacionalidad );
			return;
		}
	}
	
	public void showDeporte(String deporte) {
		boolean existeDeporte = false;
		System.out.println("\n---- DEPORTE BUSCADO: " + deporte + " ----");
		for(List <Deportista> lista : mapNaciones.values()) {
			for(Deportista temp : lista) {
				if(temp.getDeporte().equalsIgnoreCase(deporte)) {
					existeDeporte = true;
					System.out.println("- " + temp.getNombre());
				}
			}
		}
		if(!existeDeporte) {
			System.err.println("No existe ese deporte: " + deporte);
			return;
		}
	}
	
	public int cuantasNaciones() {
		return mapNaciones.keySet().size();
	}
	
	public void borra() {
	    mapNaciones.clear();
	    System.out.println("Se han eliminado todos los datos de la olimpiada.");
	}
	
}
