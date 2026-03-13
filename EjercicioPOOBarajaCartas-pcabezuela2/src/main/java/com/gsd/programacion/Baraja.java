package com.gsd.programacion;

public class Baraja {
	private Carta [] cartas;
	private Carta [] monton;
	public Baraja() {
		this.cartas = new Carta [40];
		this.monton = new Carta [40];
		String [] palos = {"espadas" , "oros" , "copas", "bastos"};
		int pos = 0;
		for(int j = 0; j < palos.length; j++) {
			for (int i = 1; i <= 12; i++) {
				if(i != 8 && i != 9) {
					cartas[pos] = new Carta(i, palos[j]);
					pos++;
				}
			}
		}
	}
	
	public void barajar() {
		for (int i = 0; i < cartas.length; i++) {
			int numRandom = (int)(Math.random()*40);
			Carta temp = cartas[i];
			cartas[i] = cartas[numRandom];
	        cartas[numRandom] = temp;
		}
	}
	
	public int cartasDisponibles() {
	    int disponibles = 0;
	    for (int i = 0; i < cartas.length; i++) {
	        if (cartas[i] != null) {
	            disponibles++;
	        }
	    }
	    return disponibles; 
	}

	
	public Carta [] darCartas(int cartasPedidas) {
		int disponibles = cartasDisponibles();
		 if (cartasPedidas > disponibles) {
		        System.out.println("No hay suficientes cartas. Quedan: " + cartasDisponibles());
		        return null; 
		    }
		 Carta [] entregadas = new Carta [cartasPedidas];
		 int contador = 0;
		for (int i = 0; i < cartas.length && contador < cartasPedidas; i++) {
			if (cartas[i] != null) {
	            entregadas[contador] = cartas[i]; // La movemos al mazo del jugador
	            monton[i] = cartas[i];
	            cartas[i] = null;                // La borramos de la baraja (se "repartió")
	            
	            contador++;
	        }
		}
		return entregadas;
	}
	
	public void mostrarBaraja() {
		for (int i = 0; i < cartas.length; i++) {
			System.out.println(cartas[i]);
		}
	}
	
}
