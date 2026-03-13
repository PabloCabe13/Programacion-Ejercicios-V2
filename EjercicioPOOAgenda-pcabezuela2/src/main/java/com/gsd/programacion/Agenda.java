package com.gsd.programacion;

public class Agenda {
	private Contacto[] contactos;

	public Agenda() {
		this.contactos = new Contacto[10];
	}

	public void aniadirContacto(Contacto c) {
		if (agendaLlena()) {
			System.err.println("La agenda esta llena");
			return;
		}else if(existeContacto(c)){
			System.err.println("El contacto ya existe");
			return;
		}else {
			for (int i = 0; i < contactos.length; i++) {
				if (contactos[i] == null) {
					contactos[i] = c;
					System.out.println("Contacto añadido en la agenda");
					return;
				}
			}
		}

	}
	
	public boolean existeContacto(Contacto c) {
	    for (int i = 0; i < contactos.length; i++) {
	        if (contactos[i] != null && contactos[i].getNombre().equalsIgnoreCase(c.getNombre())) {
	            return true;
	        }
	    }
	    return false;
	}
	
	public void buscarContacto(String nombre) {
		boolean contactoEncontrado = false;
		for (int i = 0; i < contactos.length; i++) {
			if (contactos[i] != null && contactos[i].getNombre().equalsIgnoreCase(nombre)) {
	            System.out.println(contactos[i].toString());
	            contactoEncontrado = true;
	            return;
	        }
		}
		if(!contactoEncontrado) System.err.println("Contacto no encontrado");
	}
	
	public void listarContactos() {
		for (int i = 0; i < contactos.length; i++) {
			if(contactos[i] != null)
			System.out.println(contactos[i].toString());
		}
	}
	
	public void eliminarContacto(Contacto c) {
	    for (int i = 0; i < contactos.length; i++) {
	        if (contactos[i] != null && contactos[i].getNombre().equalsIgnoreCase(c.getNombre())) {
	            contactos[i] = null;
	            System.out.println("Contacto eliminado de la agenda");
	            return; 
	        }
	    }
	    System.err.println("El contacto no se ha encontrado");
	}

	public boolean agendaLlena() {
		for (int i = 0; i < contactos.length; i++) {
			if (contactos[i] == null) {
				return false;
			}
		}
		return true;
	}

	public void huecosLibres() {
	    int contador = 0;
	    for (int i = 0; i < contactos.length; i++) {
	        if (contactos[i] == null) contador++;
	    }
	    System.out.println("Quedan: " + contador + " huecos libres");
	}
}
