package reto2;

import java.util.Scanner;

import reto2.funciones1;
import reto2.funciones2;
import reto2.Funciones;

public class reto2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		double n1 = 0;
	do {
		System.out.println("1. Longitud");
		System.out.println("2. Peso");
		System.out.println("3. Temperatura");
		System.out.println("4. Volumen");
		System.out.println("0. Salir");
		System.out.println("Elige la operación:");
		String numero = sc.nextLine();
		opcion = Integer.parseInt(numero);
		
		
		switch (opcion) {
		
		case 1:
			//Aquí invocamos a la función de MenuLongitud que habíamos configurado en funciones 1
			funciones1.MenuLongitud(sc);
			break;
			
		case 2:
			//Aquí invocamos a la función de MenuLongitud que habíamos configurado en funciones 1
			funciones1.MenuPeso(sc);
			break;
		case 3:
			//Aquí invocamos a la función de MenuLongitud que habíamos configurado en funciones 2
			funciones2.MenuTemperatura(sc);
			break;
		case 4:
			//Aquí invocamos a la función de MenuLongitud que habíamos configurado en funciones 2
			funciones2.MenuVolumen(sc);
			break;
		case 0:
			System.out.println("Salir");
			break;
			
		default:
		System.out.println("Te has equivocado");
			break;
		}
	} while (opcion !=0);
	}

	}


