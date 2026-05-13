package com.gsd.programacion;

import java.util.*;

public class App {
    public static void main(String[] args) {
        if(args.length != 1) {
            System.err.println("Argumentos Vacíos o más de un argumento");
            return; 
        }
        try {
            List<Destino> planetas = new ArrayList<>();
            List<Nave> navesEspaciales = new ArrayList<>();
            
            String datosLimpios = args[0].replace("naves:", "").replace("destinos:", "");
            String[] partes = datosLimpios.split(";"); 
            String[] naves = partes[0].split(",");
            String[] destinos = partes[1].split(",");
             
            // Destinos
            for (int j = 0; j < destinos.length; j++) {
                try {
                    String[] destino = destinos[j].split("-");
                    double distancia = Double.parseDouble(destino[1]);
                    Destino destinoFinal = new Destino(destino[0], distancia);
                    planetas.add(destinoFinal);
                } catch (Exception e) {
                    System.err.println("Planeta no procesado [" + destinos[j] + "]: " + e.getMessage());
                }
            }
            
            // Naves
            for (int j = 0; j < naves.length; j++) {
                try {
                    String[] nave = naves[j].split("-");
                    String tipo = nave[0].toLowerCase();
                    String nombre = nave[1];
                    double combustible = Double.parseDouble(nave[2]);
                    int nivelEnergia = Integer.parseInt(nave[3]);
                    String atributoExtra = nave[4]; 
                    
                    switch(tipo) {
                        case "exploradora":
                            Exploradora exploradora = new Exploradora(nombre, combustible, nivelEnergia);
                            navesEspaciales.add(exploradora);
                            break;
                        case "carga":
                            double capacidad = Double.parseDouble(atributoExtra);
                            Carga carga = new Carga(nombre, combustible, nivelEnergia, capacidad);
                            navesEspaciales.add(carga);
                            break;
                        case "militar":
                            int blindaje = Integer.parseInt(atributoExtra);
                            Militar militar = new Militar(nombre, combustible, nivelEnergia, blindaje);
                            navesEspaciales.add(militar);
                            break;
                        default:
                            throw new NaveInvalidaException("Tipo de nave no reconocido: " + tipo);
                    }
                } catch (NaveInvalidaException e) {
                    System.err.println("Nave no procesada [" + naves[j] + "]: " + e.getMessage());
                } catch (EstadisticaInvalidaException e) {
                    System.err.println("Nave no procesada [" + naves[j] + "]: " + e.getMessage());
                } catch (Exception e) {
                    System.err.println("Nave no procesada [" + naves[j] + "]: " + e.getMessage());
                }
            }
            
            EjecutarSimulacion.ejecutarSimulacion(navesEspaciales, planetas);

        } catch (Exception e) {
            System.err.println("Error procesando los datos: " + e.getMessage());
        }
    }
}
