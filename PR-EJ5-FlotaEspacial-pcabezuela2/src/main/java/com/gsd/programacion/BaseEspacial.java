package com.gsd.programacion;
import java.util.*;

public class BaseEspacial {
	private Map <String , Nave> flota;
	
	public BaseEspacial() {
		this.flota = new HashMap<>();
	}
	
	public void registrarNave(Nave n) {
		if(flota.containsKey(n.getNombre())) {
			System.err.println("La nave " + n.getNombre() + " ya existe");
			return;
		}
		flota.put(n.getNombre(), n);
		System.out.println("Nave " + n.getNombre() + " añadida a la flota");
		return;
	}
	
	public void ordenDeAtaque() {
		for(Nave n : flota.values()) {
			if(n instanceof Combate) {
				((Combate) n).atacar();
			}
		}
	}
	
	public void mostrarFlota() {
        System.out.println("\n--- ESTADO DE LA FLOTA ---");
        for (Nave n : flota.values()) {
            System.out.println("Nave: " + n.getNombre() + " | Propulsión: " + n.getPropulsion());
        }
    }
}
