package reto2;

import java.util.Scanner;

public class funciones2 {
	public static double celsiusAFahrenheit(double c) {
		return c * 9 / 5 + 32;
	}

	public static double fahrenheitACelsius(double f) {
		return (f - 32) * 5 / 9;
	}

	public static double litrosAGalones(double litros) {
		return litros * 0.264172;
	}

	public static double galonesALitros(double galones) {
		return galones * 3.78541;
	}

	public static void MenuTemperatura(Scanner sc) {
		double n1 = 0;
		int opcio = 0;
		do {
			System.out.println("Selecciona el volumen conversión");
			System.out.println("1. Celsius a Fahrenheit");
			System.out.println("2. Fahrenheit a Celsius");
			System.out.println("0. Salir");
			String opcion = sc.nextLine();
			opcio = Integer.parseInt(opcion);

			// Aquí hacemos el panel añadiendo las opciones y las conversiones con la
			// función que habíamos configurado previamente y así con todos los demás.
			switch (opcio) {
			// Menú de Celsius a Fahrenheit
			case 1:
				n1 = Funciones.dimeDouble("Dime los celsius", sc);
				System.out.println(funciones2.celsiusAFahrenheit(n1));
				break;
            // Menú de Farehnheit a Celsius
			case 2:
				n1 = Funciones.dimeDouble("Dime los Farehrenheit", sc);
				System.out.println(funciones2.fahrenheitACelsius(n1));
				break;
			//Salir al elegir 0
			case 0:
				System.out.println("Salir");

				break;
			//Responde al error de no escribir numero
			default:
				System.out.println("Opción incorrecta");
				break;
			}
		} while (opcio != 0);

	}

	public static void MenuVolumen(Scanner sc) {
		double n1 = 0;
		int opcio = 0;
		do {
			System.out.println("Selecciona el volumen conversión");
			System.out.println("1. Litros a Galones");
			System.out.println("2. Galones a Litros");
			System.out.println("0. Salir");
			String opcion = sc.nextLine();
			opcio = Integer.parseInt(opcion);
			// Aquí hacemos el panel añadiendo las opciones y las conversiones con la
			// función que habíamos configurado previamente y así con todos los demás.
			switch (opcio) {
			// Menú de Litros a Galones
			case 1:
				n1 = Funciones.dimeDouble("Dime los litros", sc);
				System.out.println(funciones2.litrosAGalones(n1));

				break;
			// Menú de Galones a Litros
			case 2:
				n1 = Funciones.dimeDouble("Dime los galones", sc);
				System.out.println(funciones2.galonesALitros(opcio));

				break;
			//Salir al poner 0
			case 0:
				System.out.println("Salir");

				break;
			//Responde al error de no escribir numero
			default:
				System.out.println("Opción incorrecta");
				break;
			}
		} while (opcio != 0);
	}

}
