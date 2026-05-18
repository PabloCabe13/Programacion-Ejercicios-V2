package com.gsd.programacion;

public class App {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        LibroFisico libroF1 = new LibroFisico("Messi", 100, CategoriaLibro.ADULTOS);
        LibroFisico libroF2 = new LibroFisico("Messi", 80, CategoriaLibro.ADULTOS);
        LibroDigital libroD1 = new LibroDigital("El bicho", 10, CategoriaLibro.INFANTIL);
        
        biblioteca.aniadirLibro(libroD1);
        biblioteca.aniadirLibro(libroF1);
         
        //Error Esperado
        biblioteca.aniadirLibro(libroF2);
        
        biblioteca.mostrarCatalogo();
        
        System.out.println("\n-- Libros con más Páginas -- ");
        biblioteca.librosMasNumPaginas(80)
        	.forEach(l -> System.out.println("- Libro " + l.getTitulo() + ", NumPaginas: " + l.getNumPaginas() + ", Formato: " + l.formatoLibro()));
    }
}
