package com.gsd.programacion;

public class App {
    public static void main(String[] args) {
        Profesor p1 = new Profesor("Pepe", "12425D", 45, "informatica", "programacion", 2500);
        PersonalAdministrativo a1 = new PersonalAdministrativo("Mamen", "2548S", 30, "Secretaria", "FP");
        
        p1.realizarTarea();
        a1.realizarTarea();
    }
}
