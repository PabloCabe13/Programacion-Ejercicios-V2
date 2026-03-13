package com.gsd.programacion;


public class Inventario {
	private OrdenadorPortatil [] portatiles = new OrdenadorPortatil[0];
	
	public void agregarPortatil(OrdenadorPortatil nuevo) {
		OrdenadorPortatil[] temporal = new OrdenadorPortatil[portatiles.length + 1];
		 
		for (int i = 0; i < portatiles.length; i++) {
			temporal[i] = portatiles[i];
		}
		 
		temporal[temporal.length-1]= nuevo;
		portatiles = temporal;
		System.out.println(nuevo.getModelo() + " añadido correctamente");
	}
	
	public void eliminarPortatil(OrdenadorPortatil portatil) {
		for (int i = 0; i < portatiles.length; i++) {
			if(portatiles[i] == portatil) {
				portatiles[i] = null;
				
				OrdenadorPortatil [] temporal = new OrdenadorPortatil[portatiles.length-1];
				int indiceTemporal = 0;
				
				for (int j = 0; j < portatiles.length; j++) {
					if(portatiles[j] != null) {
						temporal[indiceTemporal] = portatiles[j];
						indiceTemporal++;
					}
				}
				portatiles = temporal;
				System.out.println(portatil.getModelo() + " eliminado correctamente");
				return;
			}
		}
		
		System.err.println("No existe ese portatil");
	}
	
	public void mostrarPortatiles() {
		for (int i = 0; i < portatiles.length; i++) {
			if(portatiles[i] != null)
				portatiles[i].mostrar_informacion();
		}
		
	}
}
