package com.gsd.programacion;

import java.util.*;

public class App {
    public static void main(String[] args) {
    	if(args.length != 1) {
    		System.err.println("Argumentos Vacíos");
    	}
        try {
        	List <Destino> planetas = new ArrayList<>();
        	List <Nave> navesEspaciales = new ArrayList <>();
        	
			for(int i = 0 ; i < args.length; i++) {
				 String datosLimpios = args[i].replace("naves:", "").replace("destinos:", "");
				 String [] partes = datosLimpios.split(";");	
				 String [] naves = partes[0].split(",");
				 String [] destinos = partes[1].split(",");
				 
				 System.out.println(Arrays.toString(naves));
				 System.out.println(Arrays.toString(destinos));
				 
				 for (int j = 0; j < destinos.length; j++) {
					 String [] destino = destinos[j].split("-");
					 double distancia = Double.parseDouble(destino[1]);
					 Destino destinoFinal = new Destino (destino[0], distancia);
					 planetas.add(destinoFinal);
				 }
				 System.out.println(planetas);
				 for (int j = 0; j < naves.length; j++) {
					String [] nave = naves[j].split("-");
					switch(nave[0]) {
						case "exploradora":
							String nombre = nave[1];
							double combustible = Double.parseDouble(nave[2]);
							int nivelEnergia = Integer.parseInt(nave[3]);
							String ubicacionActual = nave[4];
							if(ubicacionActual == "NADA") {
								Destino baseEspacial = Destino(null, 0);
								Exploradora exploradora = new Exploradora(nombre, combustible, nivelEnergia, baseEspacial);
							}else {
								for(Destino ubicacion : planetas) {
									if(ubicacion.planeta() == ubicacionActual) {
										Exploradora exploradora = new Exploradora(nombre, combustible, nivelEnergia, ubicacion);
									}
								}
							}
							break;
						case "carga":
					}
				}
			}
		}catch (Exception e) {
			// TODO: handle exception
		}
			
			
			
			
		/*} catch (EstadisticaInvalidaException | CombustibleInsuficienteException e) {
			System.err.println("Error: "+ e.getMessage()); 
		} */
    }

	private static Destino Destino(Object object, int i) {
		// TODO Auto-generated method stub
		return null;
	}
}
