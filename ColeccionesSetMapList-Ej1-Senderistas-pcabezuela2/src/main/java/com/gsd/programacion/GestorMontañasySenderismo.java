package com.gsd.programacion;
import java.util.*;
public class GestorMontañasySenderismo {
	
	private List <String> montañas = new ArrayList <> ();
	private Map <String ,List<String>> mapaSenderos  = new HashMap<>();
	private Set <Senderista> senderistas = new HashSet <>();
	
	public void mostrarMontañasYSenderos() {
		System.out.println("----MONTAÑAS Y SENDEROS----");
		for(String m : montañas) {
			System.out.println("Montaña: " + m + " - Senderos: " + mapaSenderos.get(m) );
		}
	}
	public void añadirSenderista(Senderista s) {
	    this.senderistas.add(s);
	}
	
	public boolean añadirSendero(String sendero, String montaña) {
		if(montañas.contains(montaña)) {
			if (!mapaSenderos.containsKey(montaña)) {
	            mapaSenderos.put(montaña, new ArrayList<>());
	        }
			
			mapaSenderos.get(montaña).add(sendero);
			System.out.println(sendero + " añadido a " + montaña);
			return true;
		}
		System.err.println("No se ha encontrado la montaña");
		return false;
	}
	
	public boolean añadirMontaña(String Montaña) {
		if(montañas.contains(Montaña)) {
			System.err.println("La montaña" + Montaña +  "ya existe");
			return false;
		}
		montañas.add(Montaña);
		mostrarMontañasYSenderos();
		return true;
	}
	
	public void mostrarNombreSenderistas() {
		System.out.println("----SENDERISTAS----");
		for(Senderista senderista : senderistas) {
	        System.out.println(senderista.toString()); 
		}
	}
	
	public boolean recorrerSendero(Senderista s, String nombreSendero, String montaña) {
		   if (s != null && mapaSenderos.containsKey(montaña) ) {
			   if(mapaSenderos.get(montaña).contains(nombreSendero)) {
				   s.getSenderosRecorridos().add(nombreSendero);
				   System.out.println("Sendero Recorrido");
			       return true;
			   }
		    }
		   	System.err.println(nombreSendero + " no existe en la montaña " + montaña);
		    return false;
		}
}
