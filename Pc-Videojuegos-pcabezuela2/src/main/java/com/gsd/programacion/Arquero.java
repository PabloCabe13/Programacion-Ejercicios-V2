package com.gsd.programacion;

public class Arquero extends Personaje {
    public Arquero(String nombre, int ataque, int defensa, int pociones, int nivel) throws EstadisticaInvalidaException {
        super(nombre, ataque, defensa, pociones, nivel);
        double[] mods = {1.1, 1.3, 1.5, 1.7, 2.0, 2.2, 2.4, 2.6, 2.9, 3.2};
        double modNivel = mods[nivel - 1];
        int bono = (int) (3 * modNivel);
        setAtaque(ataque + bono);
        setDefensa(defensa + bono);
    }
    
    public void disparoAcertado(Personaje enemigo) {
        System.out.println(getNombre() + " realiza un disparo preciso a " + enemigo.getNombre());
        int daño = getAtaque();
        if (Math.random() < 0.25) {
            daño = daño * 2;
            System.out.println("¡Golpe doble!");
        }
        
        enemigo.defender(daño);
    }
    
    @Override
    public void atacar(Personaje enemigo) {
        System.out.println(getNombre() + " dispara una flecha a " + enemigo.getNombre());
        enemigo.defender(getAtaque());
    }
    
    @Override
    public void mostrarInfo() {
        System.out.println("Clase: Arquero");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Nivel: " + getNivel());
        System.out.println("Salud: " + getSalud());
        System.out.println("Ataque: " + getAtaque());
        System.out.println("Defensa: " + getDefensa());
        System.out.println("Pociones: " + getPociones());
    }
}
