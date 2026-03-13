package com.gsd.programacion;

public class App {
	public static void main(String[] args) {
		try {
			// Validar que hay 2 argumentos
			if (args.length != 2) {
				System.err.println("Error: Se requieren exactamente 2 argumentos");
				return;
			}

			// Sacamos a string la IP a un array
			String ipString = args[0];
			// Sacamos a String el valor de la máscara
			String mascaraString = args[1];

			// Validar formato de IP (debe tener exactamente 4 números)
			String[] dimension = ipString.split("\\.");
			if (dimension.length != 4) {
				System.err.println("Error: La IP debe tener exactamente 4 números");
				return;
			}

			int[] dirIp = new int[4];
			for (int i = 0; i < dimension.length; i++) {
				try {
					// Convertimos la ip a un numero entero
					dirIp[i] = Integer.parseInt(dimension[i]);

					// Validar que la IP no sea negativo ni mayor que 255
					if (dirIp[i] < 0 || dirIp[i] > 255) {
						System.err.println("Error: Los números de la IP deben estar entre 0 y 255");
						return;
					}
				} catch (NumberFormatException e) {
					System.err.println("Error: La IP debe contener solo números");
					return;
				}
			}

			// Validar que el primer byte no sea 0 ni 255
			if (dirIp[0] == 0 || dirIp[0] == 255) {
				System.err.println("Error: El primer byte de la IP no puede ser 0 ni 255");
				return;
			}

			// Mascara
			int numeroMascara = 0;
			try {
				// Convertir máscara a numero entero
				numeroMascara = Integer.parseInt(mascaraString);

				// Validar que la máscara esté entre 1 y 32
				if (numeroMascara < 1 || numeroMascara > 32) {
					System.err.println("Error: La máscara debe estar entre 1 y 32");
					return;
				}
			} catch (NumberFormatException e) {
				System.err.println("Error: La máscara debe ser un número válido");
				return;
			}

			// Imprimir IP en formato x.x.x.x/m
			for (int i = 0; i < dirIp.length; i++) {
				if (i < dirIp.length - 1) {
					System.out.print(dirIp[i] + ".");
				} else {
					// Que en la ultima pos del array no me ponga un punto y lo concatene con la
					// mascara
					System.out.println(dirIp[i] + "/" + numeroMascara);
				}
			}

			// Verificar Clase
			int primerNumero = dirIp[0];
			String clase = "";
			if (primerNumero >= 0 && primerNumero <= 127) {
				clase = "A";
			} else if (primerNumero >= 128 && primerNumero <= 191) {
				clase = "B";
			} else if (primerNumero >= 192 && primerNumero <= 223) {
				clase = "C";
			} else {
				clase = "OTRA";
			}

			System.out.println("Class " + clase);

			// Verificar Subnetting y Superneting
			switch (clase) {
			case "A":
				if (numeroMascara > 8) {
					System.out.println("Subnetting:true");
					System.out.println("Supernetting:false");
				} else {
					System.out.println("Subnetting:false");
					System.out.println("Supernetting:True");
				}
				break;

			case "B":
				if (numeroMascara > 16) {
					System.out.println("Subnetting:true");
					System.out.println("Superneting:false");
				} else {
					System.out.println("Subnetting:false");
					System.out.println("Supernetting:True");
				}
				break;

			case "C":
				if (numeroMascara > 24) {
					System.out.println("Subnetting:true");
					System.out.println("Superneting:false");
				} else {
					System.out.println("Subnetting:false");
					System.out.println("Supernetting:True");
				}
				break;
			}

		} catch (Exception e) {
			System.err.println("Error: Ha ocurrido un error inesperado");
		}
	}
}