
package com.gsd.programacion;

import java.util.*;

public class Agenda {
	Set<Contacto> agenda;

	public Agenda() {
		this.agenda = new TreeSet<Contacto>();
	}

	public void addContacto(String nombre) {
		agenda.add(new Contacto(nombre));
	}

	public void delContacto(String nombre) {
		agenda.remove(new Contacto(nombre));
	}

	public void addTlfContacto(String nombre, int tlfn) {
		for (Contacto c : agenda) {
			if (c.getNombre().equalsIgnoreCase(nombre)) {
				c.addTlfn(tlfn);
				return;
			}
		}
	}
	
	public void delTlfContacto(String nombre, int tlfn) {
	    for (Contacto c : agenda) {
	        if (c.getNombre().equalsIgnoreCase(nombre)) {
	            c.delTlfn(tlfn);
	            return;
	        }
	    }
	}

	@Override
	public String toString() {
		String dev = "";
		for(Contacto c : agenda) {
			dev+=c.toString()+"\n";
		}
		return dev.toString();
	}
	
	
}
