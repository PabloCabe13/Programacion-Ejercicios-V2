package com.gsd.programacion;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Fecha f1 = new Fecha(29, 2 ,2024);
    	f1.fechaCorrecta();
    	for (int i = 0; i < 5; i++) {
			f1.diaSiguiente();
			System.out.println(f1.toString());
		}
    }
}
