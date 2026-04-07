package com.gsd.programacion;

public class App {
    public static void main(String[] args) {
        Libreria lib1 = new Libreria();
        Libro l1 = new Libro ("Cenicienta", "manolo", 2002, Categoria.POESIA);
        
        lib1.aniadirLibro(l1);
        lib1.aniadirLibro(l1);
        lib1.mostrarLibrosCategoria(Categoria.POESIA);
    }
}
