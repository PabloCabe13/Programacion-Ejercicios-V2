package com.gsd.programacion;

public class App {
    public static void main(String[] args) {
        Electrodoméstico [] tienda = new Electrodoméstico [5];
        
        Electrodoméstico e1 = new Electrodoméstico();
        Television t1 = new Television();
        Lavadora l1 = new Lavadora();
        Television t2 = new Television(300, "Rojo", 'A', 14, 45, true);
        Lavadora l2 = new Lavadora (450, 25);
        
        double teles = 0.0;
        double lava = 0.0;
        double elec = 0.0;
        
        tienda[0] = t1;
        tienda[1] = l1;
        tienda[2] = t2;
        tienda[3] = l2;
       
        
        for (int i = 0; i < tienda.length; i++) {
        	if(tienda[i] != null) {
	        	elec+=tienda[i].precioFinal();
	        	if(tienda[i] instanceof Television) 
	        		teles+=tienda[i].precioFinal();
	        	if(tienda[i] instanceof Lavadora) 
	        		lava+=tienda[i].precioFinal();
        	}
		}
        
        System.out.println("El total de electrodomésticos es: " + elec + "\n");
        System.out.println("De los cuales " + lava + " son de lavadoras");
        System.out.println("y " + teles + " de televisiones");
    }
}
