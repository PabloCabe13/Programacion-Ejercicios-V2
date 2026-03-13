package com.gsd.programacion;

public class Guerrero extends Personaje {

    public Guerrero(String nombre, int ataque, int defensa, int pociones, int nivel) throws EstadisticaInvalidaException {
        super(nombre, ataque, defensa, pociones, nivel);
        double[] mods = {1.1, 1.3, 1.5, 1.7, 2.0, 2.2, 2.4, 2.6, 2.9, 3.2};
        double modNivel = mods[nivel - 1];      
        setSalud((int)(120 * modNivel)); 
        setDefensa(getDefensa() + 5);
    }
    
    public void golpeCritico(Personaje enemigo) {
        if (Math.random() >= 0.5) {
            int daño = getAtaque() * 2;
            enemigo.defender(daño);
            System.out.println(getNombre() + " realiza golpe crítico. Daño: " + daño);
        } else {
            System.out.println(getNombre() + " usa golpe crítico... ¡Falla!");
        }
    }
    
    @Override
    public void atacar(Personaje enemigo) {
        System.out.println(getNombre() + " ataca con su espada a " + enemigo.getNombre());
        enemigo.defender(getAtaque());
    }
    
    @Override
    public void mostrarInfo() {
        System.out.println("Clase: Guerrero");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Nivel: " + getNivel());
        System.out.println("Salud: " + getSalud());
        System.out.println("Ataque: " + getAtaque());
        System.out.println("Defensa: " + getDefensa());
        System.out.println("Pociones: " + getPociones());
    }
}
