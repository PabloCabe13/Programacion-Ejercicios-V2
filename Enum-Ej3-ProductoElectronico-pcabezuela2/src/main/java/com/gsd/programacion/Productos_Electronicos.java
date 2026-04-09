package com.gsd.programacion;
import java.util.*;

public class Productos_Electronicos {
	private Map <TipoProducto, List <Producto>> inventario;
	private List <Producto> carrito;
	
	public Productos_Electronicos() {
		this.inventario = new HashMap <>();
		this.carrito = new ArrayList <> ();
	}
	
	public boolean aniadirProductoTienda (Producto prod) {
		boolean existeTipo = false;
		 if (prod == null || prod.getTipo_de_producto() == null) {
		        System.err.println("Producto no ha sido añadido (el tipo es nulo)");
		        return false;
		    }
		for(TipoProducto pr : TipoProducto.values()) {
			if(prod.getTipo_de_producto().equals(pr)) {				
				existeTipo = true;
				break;
			}
		}
		if(existeTipo) {
			String tipo = prod.getTipo_de_producto().name();
			for(TipoProducto pr2 : inventario.keySet()) {
				if(pr2.name().equalsIgnoreCase(tipo)) {
					inventario.get(pr2).add(prod);
					
					return true;
				}
			}
			List <Producto> productos = new ArrayList <>();
			inventario.put(prod.getTipo_de_producto(), productos);
			inventario.get(prod.getTipo_de_producto()).add(prod);
			System.out.println("Producto añadido");
			return true;
		}
		System.err.println("Producto no ha sido añadido");
		return false;
	}
	
	
	
	
}
