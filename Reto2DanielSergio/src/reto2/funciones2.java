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
		System.out.println("Selecciona la temperatura conversión");
		System.out.println("Celsius a Fahrenheit");
		System.out.println("Fahrenheit a Celsius");
		double n1 = 0;
		int opcio = 0;
		do {
			System.out.println("Selecciona el volumen conversión");
			System.out.println("Celsius a Fahrenheit");
			System.out.println("Fahrenheit a Celsius");
			String opcion = sc.nextLine();
			opcio = Integer.parseInt(opcion);
			switch (opcio) {

			case 1:
				n1 = Funciones.dimeDouble("Dime los celsius", sc);
				System.out.println(funciones2.celsiusAFahrenheit(n1));

				break;

			case 2:
				n1 = Funciones.dimeDouble("Dime los Farehrenheit", sc);
				System.out.println(funciones2.fahrenheitACelsius(n1));

				break;
			case 0:
				System.out.println("Salir");

				break;

			default:
				System.out.println("Opción incorrecta");
				break;
			}
		} while (opcio != 0);

	}

	public static void MenuVolumen(Scanner sc) {
		System.out.println("Selecciona el volumen conversión");
		System.out.println("Litros a Galones");
		System.out.println("Galones a Litros");

		double n1 = 0;
		int opcio = 0;
		do {
			System.out.println("Selecciona el volumen conversión");
			System.out.println("Litros a Galones");
			System.out.println("Galones a Litros");
			String opcion = sc.nextLine();
			opcio = Integer.parseInt(opcion);
			switch (opcio) {
			case 1:
				n1 = Funciones.dimeDouble("Dime los litros", sc);
				System.out.println(funciones2.litrosAGalones(n1));

				break;

			case 2:
				n1 = Funciones.dimeDouble("Dime los galones", sc);
				System.out.println(funciones2.galonesALitros(opcio));

				break;
			case 0:
				System.out.println("Salir");

				break;

			default:
				System.out.println("Opción incorrecta");
				break;
			}
		} while (opcio != 0);
	}

}
