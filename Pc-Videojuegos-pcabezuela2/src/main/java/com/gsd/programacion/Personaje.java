package com.gsd.programacion;

public abstract class Personaje implements Combatible {
    private String nombre;
    private int salud;
    private int ataque;
    private int defensa;
    private int pociones;
    private int nivel;

    public Personaje(String nombre, int ataque, int defensa, int pociones, int nivel) 
            throws EstadisticaInvalidaException { 
        this.nombre = nombre;
        this.salud = 100;    
        setAtaque(ataque);
        setDefensa(defensa);
        setPociones(pociones);
        setNivel(nivel);
    }

    public String getNombre() { return nombre; }
    public int getAtaque() { return ataque; }
    public int getDefensa() { return defensa; }
    public int getPociones() { return pociones; }
    public int getNivel() { return nivel; }
    public int getSalud() { return salud; }
    public void setSalud(int salud) { this.salud = salud; }

    public void setAtaque(int ataque) throws EstadisticaInvalidaException {
        if (ataque <= 0) throw new EstadisticaInvalidaException("Ataque > 0");
        this.ataque = ataque;
    }

    public void setDefensa(int defensa) throws EstadisticaInvalidaException {
        if (defensa <= 0) throw new EstadisticaInvalidaException("Defensa > 0");
        this.defensa = defensa;
    }

    public void setPociones(int pociones) throws EstadisticaInvalidaException {
        if (pociones < 1 || pociones > 5) throw new EstadisticaInvalidaException("Pociones 1-5");
        this.pociones = pociones;
    }

    public void setNivel(int nivel) throws EstadisticaInvalidaException {
        if (nivel < 1 || nivel > 10) throw new EstadisticaInvalidaException("Nivel 1-10");
        this.nivel = nivel;
    }

    public abstract void mostrarInfo();
    
    public void defender(int daño) {
        int dañoFinal = Math.max(0, daño - defensa);
        salud -= dañoFinal;
        if (salud <= 0) {
            salud = 0; 
        }
    }

    public boolean estaVivo() {
        return salud > 0;
    }
    
    public void autoCurar() {
        if (salud < 50 && pociones > 0) {
            pociones--; 
            double porcentaje = 0.15 + (Math.random() * 0.11); 
            int aumento = (int) (salud * porcentaje);
            salud += aumento;
            System.out.println(nombre + " toma poción, restaura vida (" + salud + ")");
        }
    }

    @Override
    public String toString() {
        return nombre + " (" + salud + ")";
    }
}
