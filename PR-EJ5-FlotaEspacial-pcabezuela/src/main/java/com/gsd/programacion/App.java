package com.gsd.programacion;

public class App {
    public static void main(String[] args) {
        Cazas caza1 = new Cazas("CazaV2", 3000, 5);
        Cargueros carguero1 = new Cargueros("Carguero242", 1500, 200);
        Cazas caza2 = new Cazas("CazaF25", 3000, 5);
        
        BaseEspacial base = new BaseEspacial();
        
        base.registrarNave(caza1);
        base.registrarNave(caza2);
        base.registrarNave(carguero1);
        
        //Error esperado
        base.registrarNave(caza2);
        
        base.ordenDeAtaque();
        
        base.mostrarFlota();
    }
}
