package com.gsd.programacion;

public class App {
    public static void main(String[] args) {
        Productos_Electronicos Tienda = new Productos_Electronicos(); 
        Producto pr1 = new Producto("Ryzen34x", "Ryzen", 45.99, null);

        Tienda.aniadirProductoTienda(pr1); 
    }
}
