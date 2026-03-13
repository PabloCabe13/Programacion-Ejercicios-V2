package com.gsd.programacion;

import java.util.ArrayList;
import java.util.List;

public class Contacto implements Comparable <Contacto>{
    private  String nombre;
    private  List <Integer> telefonos;

    public Contacto(String nombre) {
        this.nombre = nombre;
        this.telefonos = new ArrayList<>();
    }
    
    public boolean addTlfn(int tlfn) {
    	if(telefonos.contains(tlfn)) {
    		System.err.println("Ya existe");
    		return false;
    	}else {
    		telefonos.add(tlfn);
    		System.out.println("Añadido");
    		return true;
    	}
    }
    
    public boolean delTlfn(int tlfn) {
    	if(!telefonos.contains(tlfn)){
    		System.out.println("no existe");
    		return false;
    	}else {
    		telefonos.remove(telefonos.indexOf(tlfn));
    		System.out.println("Telefono eliminado");
    		return true;
    	}
    }
    
    
    
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public int compareTo(Contacto o) {
		return this.nombre.compareTo(o.getNombre());
	}

	@Override
	public String toString() {
		return ""+ nombre + "\n" +  telefonos.toString();
	}

	
    
}
