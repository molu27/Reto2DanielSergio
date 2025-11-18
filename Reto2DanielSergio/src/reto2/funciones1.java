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

			// Aquí hacemos el panel añadiendo las opciones y las conversiones con la
			// función que habíamos configurado previamente y así con todos los demás.
			switch (opcion) {
			// Opción para pasar de Millas a Km
			case 1:
				n1 = Funciones.dimeDouble("Dime un numero", sc);
				System.out.println("Millas a Km: " + (funciones1.MillasAKm(n1)));
				break;
			// Opción para pasar de Km a Millas
			case 2:
				n1 = Funciones.dimeDouble("Dime un numero", sc);
				System.out.println("Km a Millas: " + (funciones1.KmAMillas(n1)));
				break;
			// Salir del menú tras elegir la opción 0
			case 0:
				System.out.println("Salir");
				break;
			// Responde al error en caso de no poner un número
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
			// Aquí hacemos el panel añadiendo las opciones y las conversiones con la
			// función que habíamos configurado previamente y así con todos los demás.
			switch (opcion) {
			// Opción para pasar de Kg a Libras
			case 1:
				n1 = Funciones.dimeDouble("Dime un numero", sc);
				System.out.println("Kg a Libras: " + (funciones1.KgALibras(n1)));
				break;
			// Opción para pasar de Libras a Kg
			case 2:
				n1 = Funciones.dimeDouble("Dime un numero", sc);
				System.out.println("Libras a Kg: " + (funciones1.LibrasAKg(n1)));
				break;
			// Salir del menú tras elegir la opción 0
			case 0:
				System.out.println("Salir");
				break;
			// Responde al error tras no poner un número
			default:
				System.out.println("Te has equivocado");
				break;
			}
		} while (opcion != 0);
	}

}
