package reto2;

import java.util.Scanner;

public class funciones1 {

	public static double MillasAKm(double km, double millas) {
		return millas * 1.60934;
	}

	public static double KmAMillas(double km, double millas) {
		return km / millas;
	}

	public static double KgALibras(double kg, double libras) {
		return kg * 2.20462;
	}

	public static double LibrasAKg(double kg, double libras) {
		return 0.453592 * libras;
	}
	public static void MenuLongitud(Scanner sc) {
		int num = 0;
		do {
		System.out.println("Selecciona la conversión de longitud: ");
		System.out.println("1. Millas a Kilómetros: ");
		System.out.println("2. Kilómetros a Millas: ");
		System.out.println("0. Salir: ");
		String numt = sc.nextLine();
		num = Integer.parseInt(numt);
		int n1 = 0;
		int n2 = 0;
		
		switch (num) {
		case 1: {
			
			break;
		}
		case 2: {
			break;
		}
		case 0: {
			System.out.println("Salir");
			break;
		}
		default:
			System.out.println("Te has equivocado");
		}
		
		
		} while (num != 0);
	}

}
