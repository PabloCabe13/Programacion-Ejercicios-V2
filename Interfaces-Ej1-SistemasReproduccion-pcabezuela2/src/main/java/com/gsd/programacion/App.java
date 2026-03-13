package com.gsd.programacion;

public class App {
    public static void main(String[] args) {
        Reproducible [] medios = new Reproducible [4];
        
        medios[0] = new Pelicula (123, "Harry Potter 1" , "Cris Columbus");
        medios[1] = new Musica(3, "thunderstruck" , "ACDC");
        medios[2] = new Pelicula (120, "Titanic" , "Messi");
        medios[3] = new Musica(4, "La flaca" , "Fito");
        
        for (int i = 0; i < medios.length; i++) {
			medios[i].reproducir();
			medios[i].pausar();
			medios[i].reproducir();
			medios[i].detener();
			if(medios[i] instanceof Pelicula) {
				((Pelicula)medios[i]).volverAVer();
			}
			System.out.println("-----------");
			medios[i].toString();
		}
    }
}
