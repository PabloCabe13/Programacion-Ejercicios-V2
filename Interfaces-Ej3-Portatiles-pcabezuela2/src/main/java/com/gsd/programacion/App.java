package com.gsd.programacion;

public class App {
    public static void main(String[] args) {
        Laptop lap1 = new Laptop(200, 5 , "Lenovo" , "Lenovix" , 15);
        Ultrabook ult1 = new Ultrabook(350, 20 , "Asus" , "hybridA" , 20);
        
        Inventario inventario = new Inventario();
        
        inventario.agregarPortatil(lap1);
        inventario.mostrarPortatiles();
        inventario.eliminarPortatil(lap1);
    }
}
