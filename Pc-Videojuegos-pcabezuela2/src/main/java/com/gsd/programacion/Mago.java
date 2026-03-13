package com.gsd.programacion;

public class Mago extends Personaje {

    public Mago(String nombre, int ataque, int defensa, int pociones, int nivel) throws EstadisticaInvalidaException {
        super(nombre, ataque, defensa, pociones, nivel);
        setSalud(80); 
        double[] mods = {1.1, 1.3, 1.5, 1.7, 2.0, 2.2, 2.4, 2.6, 2.9, 3.2};
        double modNivel = mods[nivel - 1];
        int ataqueModificado = (int) (ataque + (10 * modNivel));
        setAtaque(ataqueModificado);
    }
    
    public void lanzarHechizo(Personaje enemigo) {
        System.out.println(getNombre() + " lanza un hechizo a " + enemigo.getNombre());
        int daño = getAtaque();
        int nuevaSalud = enemigo.getSalud() - daño;  
        if (nuevaSalud < 0) nuevaSalud = 0;           
        enemigo.setSalud(nuevaSalud);
        System.out.println("¡El hechizo ignoró la defensa! Daño: " + daño);
    }
     
    @Override
    public void autoCurar() {
        if (getSalud() < 50) {
            if (Math.random() > 0.30) { 
                int aumento = (int) (getSalud() * 0.30);
                setSalud(getSalud() + aumento);
                System.out.println("¡Hechizo de curación exitoso! Salud: " + getSalud());
            } else {
                System.out.println("El hechizo de curación ha fallado.");
            }
        }
    }
    
    @Override
    public void atacar(Personaje enemigo) {
        System.out.println(getNombre() + " lanza un ataque mágico a " + enemigo.getNombre());
        enemigo.defender(getAtaque());
    }
    
    @Override
    public void mostrarInfo() {
        System.out.println("Clase: Mago");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Nivel: " + getNivel());
        System.out.println("Salud: " + getSalud());
        System.out.println("Ataque: " + getAtaque());
        System.out.println("Defensa: " + getDefensa());
        System.out.println("Pociones: " + getPociones());
    }
}
