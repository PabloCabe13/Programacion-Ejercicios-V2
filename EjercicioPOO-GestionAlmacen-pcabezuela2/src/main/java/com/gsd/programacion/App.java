package com.gsd.programacion;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Producto p1 = new Producto (12345, "Mesa" , 14 , 2);
        Producto p2 = new Producto (125, "Messi" , 10 , 2);
        Almacen a1 = new Almacen();
        
        a1.agregarProducto(p1);
        a1.agregarProducto(p2);
        a1.actualizarStock(1, p2);
        a1.mostrarProductos();
        a1.valorTotalAlmacen();
        a1.productosSinStock();
    }
}
