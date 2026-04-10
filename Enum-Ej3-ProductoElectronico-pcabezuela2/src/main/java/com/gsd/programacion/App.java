package com.gsd.programacion;
import java.util.*;
public class App {
    public static void main(String[] args) {
        Productos_Electronicos Tienda = new Productos_Electronicos(); 
        Scanner teclado = new Scanner (System.in);
        System.out.println("----- TIENDA DE PRODUCTOS ELECTRÓNICOS -----");
        int opcion;
        do {
        	System.out.println("1- Agregar Producto");
        	System.out.println("2- Mostrar productos de un tipo");
        	System.out.println("3- Mostrar productos del Invemtario");
        	System.out.println("4- Mostrar Precio total del Inventario");
        	System.out.println("5- Hacer una compra");
        	System.out.println("6- Mostrar carrito y precio");
        	System.out.println("7- Finalizar Compra");
        	System.out.println("8- SALIR");
        	opcion = teclado.nextInt();
        	
        	switch(opcion) {
        	case 1:
        		teclado.nextLine();
        		System.out.println("Dime el nombre del Producto");
        		String nombreProd = teclado.nextLine();
        		
        		System.out.println("Dime el nombre de la Marca del producto");
        		String marca = teclado.nextLine();
        		
        		System.out.println("Dime el precio del producto");
        		double precio = teclado.nextDouble();
        		teclado.nextLine();
        		
        		System.out.println("Dime el tipo del producto (TELEFONO, TABLET, COMPUTADORA, RATON, TECLADO)");
        		String tipo = teclado.next();
        		try {
        			TipoProducto tipoDeProd = TipoProducto.valueOf(tipo.toUpperCase().trim());		
        			Producto nuevoProd = new Producto(nombreProd, marca, precio, tipoDeProd);
        			Tienda.aniadirProductoTienda(nuevoProd);
        		}catch(IllegalArgumentException e) {
        			System.err.println("Ese tipo no existe");
        		}
        		break;
        	case 2:
        		System.out.println("Dime el tipo de producto que quieres ver: ");
        		String tipoProd = teclado.next().toUpperCase().trim();
        		Tienda.mostrarProdTipo(tipoProd);
        		break;
        	case 3:
        		
        		break;
        	case 4:
        		
        		break;
        	case 5: 
        		
        		break;
        	case 6:
        		
        		break;
        	case 7:
        		
        		break;
        	case 8:
        		return;
        	}
        	
        }while(opcion != 8);
        try {
        	String tipo = "telefono";
            Producto pr1 = new Producto("Ryzen34x", "Ryzen", 45.99, TipoProducto.valueOf(tipo.toUpperCase()));
            Tienda.aniadirProductoTienda(pr1); 
        }catch(IllegalArgumentException e) {
        	System.err.println("Error: El tipo de producto no existe en la tienda");
        }
        
    }
}
