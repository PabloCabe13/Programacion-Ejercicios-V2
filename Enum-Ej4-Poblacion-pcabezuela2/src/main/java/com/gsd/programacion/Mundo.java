package com.gsd.programacion;
import java.util.*;

public class Mundo {
	private List <Pais> paises;

	public Mundo() {
		this.paises = new ArrayList<>();
	}
	
	public boolean aniadirPais(Pais pais) {
		for(Pais p : paises) {
			if(p.getNombre().equalsIgnoreCase(pais.getNombre())) {
				System.err.println("El país " + pais.getNombre() + " ya existe");
				return false;
			}
		}
		paises.add(pais);
		return true;
	}
	
	public void mostrarPaisesDeContinente(String continente) {
		Continentes continenteSelec = Continentes.valueOf(continente.toUpperCase().trim());
		System.out.println("----- PAISES DEL CONTINENTE DE " + continenteSelec.name() + " -----");
		for(Pais p : paises) {
			if(p.getContinente().equals(continenteSelec)) {
				System.out.println("- " + p.toString());
			}
		}
	}
	
	public void mostrarTodosPaises() {
		System.out.println("----- PAISES ACTUALES -----");
		for(Pais p : paises) {
			System.out.println("- " + p.toString());
		}
	}
	
	public String buscarPais(String nombrePais) {
		nombrePais.trim();
		for(Pais p : paises) {
			if(p.getNombre().equalsIgnoreCase(nombrePais)) {
				return p.toString();
			}
		}
		return "El pais no existe";
	}
	
	public void mostrarPoblacionContinente(String continente) {
		try {
			Continentes continenteSelec = Continentes.valueOf(continente.toUpperCase().trim());
			System.out.println("La población del continente " + continente + " es de: " + continenteSelec.getPoblacionContinente() + " M de habitantes");
			return;
		}catch(IllegalArgumentException e) {
			System.err.println("El continente " + continente + " no existe");
			return;
		}
	}
	
	public void mostrarPorcentajePoblacionDePais(String nombrePais) {
		nombrePais.trim();
		for(Pais p : paises) {
			if(p.getNombre().equalsIgnoreCase(nombrePais)) {
				Continentes cont = p.getContinente();
				 double porcentajePoblacion = (double) p.getPoblacion() / cont.getPoblacionContinente() * 100;
				System.out.println("El porcentaje de su poblacion es de: " + porcentajePoblacion + "%");
				return;
			}
		}
		System.err.println("El país no existe");
		return;
	}
}
