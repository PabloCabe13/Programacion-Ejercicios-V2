package com.gsd.programacion;
import java.util.*;
public class App {
    public static void main(String[] args) {
        SedeEmpresa empresa = new SedeEmpresa("Valentin Beato 3", new ArrayList<>());
        Gerente g1 = new Gerente(1234, "Pablo", 18, 3500, 1500, 2);
        Administrativo a1 = new Administrativo(123, "José", 54, 3000, "JUnit", "Word");
        Tecnico t1 = new Tecnico(12, "Hectiri", 24, 2000, "Soporte", 5);
        
        empresa.aniadirEmpleado(g1);
        empresa.aniadirEmpleado(a1);
        empresa.aniadirEmpleado(t1);
        
        //Error esperado
        empresa.aniadirEmpleado(g1);
        //
        
        empresa.calcularSalarioTotal();
        empresa.mostrarInfoEmpleados();
    }
}
