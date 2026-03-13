package com.gsd.programacion;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Agenda a = new Agenda();
		Scanner teclado = new Scanner(System.in);
		int menu = 0;
		do {
			System.out.println("-----AGENDA-----");
			System.out.println("Escribe el numero en funcion de lo que quieres hacer... \n");
			System.out.println("1- Añadir Contacto a la Agenda");
			System.out.println("2- Comprobar si existe contacto");
			System.out.println("3- Listar los contactos de la agenda");
			System.out.println("4- Buscar contactos de la agenda");
			System.out.println("5- Eliminar Contacto de la agenda");
			System.out.println("6- Comprobar si la agenda esta llena");
			System.out.println("7- Comprobar si hay huecos libres");
			System.out.println("8- SALIR");
			menu = teclado.nextInt();
			switch (menu) {
			case 1:
				System.out.println("Nombre");
				String nombre = teclado.next();
				System.out.println("Numero de telefono");
				int numero = teclado.nextInt();
				Contacto c1 = new Contacto(nombre, numero);
				a.aniadirContacto(c1);
				break;
			case 2:
				System.out.println("Dime el nombre que quieres comprobar");
				String buscarNombre = teclado.next();
				if (a.existeContacto(new Contacto(buscarNombre, 0))) {
					System.out.println("El contacto existe.");
				} else {
					System.out.println("El contacto NO existe.");
				}
				break;
			case 3:
				a.listarContactos();
				break;
			case 4:
				System.out.println("Dime la persona que quieres buscar");
				String buscarContacto = teclado.next();
				a.buscarContacto(buscarContacto);
				break;
			case 5:
				System.out.println("Dime la persona que deseas eliminar");
				String personaEliminar = teclado.next();
				Contacto contactoTemporal = new Contacto(personaEliminar, 0);
				a.eliminarContacto(contactoTemporal);
				break;
			case 6:
				if(a.agendaLlena())
					System.out.println("La agenda esta llena");
				else {
					System.out.println("La agenda NO esta llena");
				}
				break;
			case 7:
				a.huecosLibres();
				break;
			case 8:
				System.out.println("Chao Pescao");
				return;
			}
		
				
		} while (menu != 8);
		return;
	}
}
