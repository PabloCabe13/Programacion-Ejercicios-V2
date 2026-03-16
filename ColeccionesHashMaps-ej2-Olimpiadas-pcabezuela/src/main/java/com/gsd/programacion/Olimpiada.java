package com.gsd.programacion;
import java.util.*;

public class Olimpiada {
	private Map <String, List<deportista>> nacionalidades;
	private String sede;
	private int anio;
	
	public Olimpiada(String sede, int anio) {
		this.nacionalidades = new HashMap<>();
		this.sede = sede;
		this.anio = anio;
	}

	public boolean addDeportista(deportista d) {	
	    String pais = d.getNacionalidad().toUpperCase();

	    if (comprobarSiExiste(d)) {
	        System.err.println("El ID de ese deportista ya existe");
	        return false;
	    }
	    
	    if (nacionalidades.containsKey(pais)) {
	        nacionalidades.get(pais).add(d);
	    } else {
	        List<deportista> nuevaLista = new ArrayList<>();
	        nuevaLista.add(d);
	        nacionalidades.put(pais, nuevaLista);
	    }
	    
	    System.out.println("Deportista " + d.getNombre() + " añadido a " + pais);
	    return true;
	}
	
	public void showAll() {
		System.out.println(" ---- NACIONALIDADES ----");
		for(String pais : nacionalidades.keySet()) {
			List <deportista> lista = nacionalidades.get(pais);
			
			int  numDeportistas = lista.size();
			
			System.out.println(pais + ", numero de deportistas: " + numDeportistas);
		}
	}
	
	public void showNacionalidad(String nacionalidad) {
		nacionalidad = nacionalidad.toUpperCase();
		if(nacionalidades.containsKey(nacionalidad)) {
			System.out.println("Nacionalidad: " + nacionalidad);
		     System.out.println("Deportistas: " + nacionalidades.get(nacionalidad));
		}else {
			System.err.println("No existe esa nacionalidad");
		}
	}
	
	public void showDeporte(String deporte) {
		System.out.println("PARTICIPANTES DEL DEPORTE " + deporte.toUpperCase());
		for(List<deportista> lista : nacionalidades.values()) {
			for(deportista temp : lista) {
				if(temp.getDeporte().equalsIgnoreCase(deporte)) {
					System.out.println("- " + temp.getNombre());
				}
					
			}
		}
	}
	
	public int cuantasNaciones() {
		int paises = 0;
		for(String pais : nacionalidades.keySet()) {
			paises++;
		}
		return paises;
	}
	
	
	
	public boolean comprobarSiExiste(deportista d) {
	    for (List<deportista> lista : nacionalidades.values()) {
	        for (deportista temp : lista) {
	            if (temp.getID() == d.getID()) { 
	                return true;
	            }
	        }
	    }
	    return false;
	}

	
	public String getSede() {
		return sede;
	}

	public int getAnio() {
		return anio;
	}
	
	
}
