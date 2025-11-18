package reto2;

import java.util.Scanner;

public class funciones1 {

	public static double MillasAKm(double millas) {
		return millas * 1.60934;
	}

	public static double KmAMillas(double km) {
		return km * 0.621371;
	}

	public static double KgALibras(double kg) {
		return kg * 2.20462;
	}

	public static double LibrasAKg(double libras) {
		return 0.453592 * libras;
	}

	public static void MenuLongitud(Scanner sc) {
		int opcion = 0;
		double n1 = 0;
		do {
			System.out.println("Selecciona la conversión de longitud: ");
			System.out.println("1. Millas a Kilómetros: ");
			System.out.println("2. Kilómetros a Millas: ");
			System.out.println("0. Salir: ");
			String numt = sc.nextLine();
			opcion = Integer.parseInt(numt);
			
			//Aquí hacemos el panel añadiendo las opciones y las conversiones con la función que habíamos configurado previamente y así con todos los demás.
			switch (opcion) {
			case 1:
				n1 = Funciones.dimeDouble("Dime un numero", sc);
				System.out.println("Millas a Km: " + (funciones1.MillasAKm(n1)));
				break;
			case 2:
				n1 = Funciones.dimeDouble("Dime un numero", sc);
				System.out.println("Km a Millas: " + (funciones1.KmAMillas(n1)));
				break;
			case 0:
				System.out.println("Salir");
				break;
			default:
				System.out.println("Te has equivocado");
				break;
			}
		} while (opcion != 0);
	}
	public static void MenuPeso(Scanner sc) {
		int opcion = 0;
		double n1 = 0;
		do {
			System.out.println("Selecciona la conversión de longitud: ");
			System.out.println("1. Kg a Libras: ");
			System.out.println("2. Libras a Kg: ");
			System.out.println("0. Salir: ");
			String numt = sc.nextLine();
			opcion = Integer.parseInt(numt);
			//Aquí hacemos el panel añadiendo las opciones y las conversiones con la función que habíamos configurado previamente y así con todos los demás.
			switch (opcion) {
			case 1:
				
				n1 = Funciones.dimeDouble("Dime un numero", sc);
				System.out.println("Kg a Libras: " + (funciones1.KgALibras(n1)));
				break;
			case 2:
				n1 = Funciones.dimeDouble("Dime un numero", sc);
				System.out.println("Libras a Kg: " + (funciones1.LibrasAKg(n1)));
				break;
			case 0:
				System.out.println("Salir");
				break;
			default:
				System.out.println("Te has equivocado");
				break;
			}
		} while (opcion != 0);
		}
			
		
	}



