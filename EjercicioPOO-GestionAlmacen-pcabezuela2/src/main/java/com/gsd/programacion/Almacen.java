package com.gsd.programacion;

public class Almacen {
	private Producto [] productos;
	
	public Almacen() {
		this.productos = new Producto [10];
	}
	
	public void agregarProducto(Producto p) {
		for (int i = 0; i < productos.length; i ++) {
			if(productos[i] != null && productos[i].getCodigo() == p.getCodigo()) {
				System.err.println("El codigo de producto ya existe en la lista");
				return;
			}
		}
		for (int i = 0; i < productos.length; i++) {
			if(productos[i] == null ) {
				productos[i] = p;
				System.out.println("Producto agregado!");
				break;
			}
		}
	}
	
	public void eliminarProducto(Producto p) {
		for (int i = 0; i < productos.length; i++) {
			if(productos[i] != null && productos[i].getCodigo()== p.getCodigo()) {
				productos[i] = null;
				System.out.println("Producto Eliminado");
				return;
			}
		}
	}
	
	public Producto buscarProducto(int codigo){
		for (int i = 0; i < productos.length; i++) {
			if(productos[i] != null && productos[i].getCodigo() == codigo) {
				return productos[i];
			}
		}
		return null;
	}
	
	public void actualizarStock(int stock, Producto p) {
		boolean stockModificado = false;
		for (int i = 0; i < productos.length; i++) {
			if(productos[i] != null && productos[i].getCodigo() == p.getCodigo()) {
				productos[i].setStock(stock);
				System.out.println("Stock Modificado: " + productos[i].getStock());
				stockModificado = true;
				break;
 			}
		}
		if(!stockModificado)
			System.err.println("Lo siento, no hemos encontrado el producto");
	}
	
	public void mostrarProductos() {
		for(int i = 0 ; i < productos.length; i++) {
			if(productos[i] != null)
			System.out.println(productos[i]);
		}
	}
	
	public void productosSinStock() {
		System.out.println("----------Productos sin stock----------");
		for (int i = 0; i < productos.length; i++) {
			if(productos[i] != null && productos[i].getStock() == 0) {
				System.out.println(productos[i].getNombre() + ", Stock: " + productos[i].getStock());
			}
		}
	}
	
	public void valorTotalAlmacen() {
		double valorTotal = 0;
		double subTotal = 0;
		for (int i = 0; i < productos.length; i++) {
			if(productos[i] != null) {
				subTotal = productos[i].getPrecio() * productos[i].getStock();
				valorTotal += subTotal;
			}
		}
		System.out.println("El valor total del almacen es de: " + valorTotal + " $");
	}
}
