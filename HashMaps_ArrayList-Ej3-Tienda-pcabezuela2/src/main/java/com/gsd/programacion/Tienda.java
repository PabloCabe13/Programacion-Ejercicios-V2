package com.gsd.programacion;
import java.util.*;

public class Tienda {
	private Map <String,Producto> productos;
	Scanner teclado = new Scanner(System.in);
	
	public Tienda() {
		this.productos = new HashMap<String, Producto>();
	}
	
	public void aniadirProducto(Producto p) {
		if(productos.containsKey(p.getNombre())) {
			System.out.println("El producto"+ p.getNombre() + " ya existe, deseas modificar su precio y la cantidad? Y o N");
			String confirmacion = teclado.next();
			if(confirmacion.equalsIgnoreCase("y")) {
				Producto productoExistente = productos.get(p.getNombre());
				System.out.println("Precio Antiguo: " + productoExistente.getPrecio());
				System.out.println("Nuevo precio: "); 
				float nuevoPrecio = teclado.nextFloat();
				productoExistente.setPrecio(nuevoPrecio); 
				
				System.out.println("Unidades actuales: " + productoExistente.getUnidades());
				System.out.println("Unidades a Ingresar");
				int unidadesNuevas = teclado.nextInt();
				productoExistente.setUnidades(productoExistente.getUnidades()+unidadesNuevas);
				
				System.out.println("Producto añadido!");
				return;
			}
			productos.put(p.getNombre(), p);
			System.out.println("Producto " + p.getNombre() + "añadido");
		}
	}
	
	public boolean eliminarProducto(Producto p) {
		if(productos.containsKey(p.getNombre())) {
			productos.remove(p.getNombre());
			System.out.println("Producto " + p.getNombre() + " ha sido eliminado de la tienda");
			return true;
		}
		System.err.println("El producto no existe");
		return false;
	}
	
	public void imprimirPrecio (Producto p) {
		if(productos.containsKey(p.getNombre())) {
			Producto productoActual = productos.get(p.getNombre());
			System.out.println("Precio del producto: " + productoActual.getPrecio());
			float precioTotal = productoActual.getPrecio() * productoActual.getUnidades();
			System.out.println("Precio total de todas las unidades: " + precioTotal);
			return;
		}
		System.err.println("El producto no existe");
		return;
	}
}
