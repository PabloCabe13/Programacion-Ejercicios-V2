package com.gsd.programacion;
import java.util.*;


public class GestionSenderismo {
	private List <String> montañas;
	private Map <String, List<String>> mapaSenderos;
	private Set <Senderista> senderistas;
	
	public GestionSenderismo() {
		this.montañas = new ArrayList<>();
		this.mapaSenderos = new HashMap<>();
		this.senderistas = new HashSet<>();
	}
	
	public boolean aniadirMontaña(String montaña) {
		montaña = montaña.toUpperCase();
		if(montañas.contains(montaña)) {
			System.err.println("La montaña " + montaña + " ya existe");
			return false;
		}
		
		montañas.add(montaña);
		List <String> senderos = new ArrayList<>(); 
		mapaSenderos.put(montaña, senderos);
		System.out.println("Añadido correctamente");
		return true;
	}
	
	public boolean aniadirSendero(String montaña, String sendero) {
		montaña = montaña.toUpperCase();
		sendero = sendero.toUpperCase();
		if(!montañas.contains(montaña) || mapaSenderos.get(montaña).contains(sendero)) {
			System.err.println("La montaña no existe O el sendero ya existe en la montaña");
			return false;
		}
		
		mapaSenderos.get(montaña).add(sendero);
		System.out.println("Sendero " + sendero + " añadido correctamente");
		return true;
	}
	
	public boolean aniadirSenderista(Senderista s) {
		String nombreSenderista = s.getNombre();
		if(senderistas.contains(s)) {
			System.err.println("El senderista " + nombreSenderista +" ya existe");
			return false;
		}
		senderistas.add(s);
		System.out.println("Senderista " + nombreSenderista + " añadido");
		return true;
	}
	
	public void mostrarMontañasySenderos() {
	    System.out.println("\n---- MONTAÑAS Y SENDEROS ----");
	    for(String m : mapaSenderos.keySet()) {
	        System.out.print("Montaña: " + m + " -- Senderos asociados: ");	        
	        List<String> senderosDeEstaMontaña = mapaSenderos.get(m);	      
	        for(String sendero : senderosDeEstaMontaña) {
	            System.out.print(sendero + " ");
	        }
	        System.out.println();
	    }
	}
	
	public boolean recorrerSendero(String sendero, Senderista s) {
		for(List <String> senderos : mapaSenderos.values()) {
			for(String temp : senderos) {
				if(temp.equalsIgnoreCase(sendero)) {
					s.getSenderosRecorridos().add(sendero);
					System.out.println("\nSendero: " + sendero + " recorrido.");
					return true;
				}
			}
		}
		System.err.println("No existe el sendero");
		return false;
	}
	
	public void mostrarNombreSenderistas() {
		System.out.println("\n\n---- SENDERISTAS ----");
		for(Senderista s : senderistas) {
			System.out.println("Nombre: " + s.getNombre() + " -- Senederos Recorridos: " +  s.getSenderosRecorridos());
		}
	}
}
