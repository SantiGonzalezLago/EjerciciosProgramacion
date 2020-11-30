package gal.teis.ejercicios;

import java.util.Random;

import gal.teis.io.KeyboardScanner;

@SuppressWarnings("unused")
public class Unit2Arrays {

	public static void start() {
//		guessMonth();
		calculateDniLetter();
	}

	//Práctica 1
	private static void guessMonth() {
		final String[] MONTHS = {"enero" , "febrero" , "marzo" , "abril" , "mayo" , "junio" , "julio" , "agosto" , "septiembre", "octubre", "noviembre", "diciembre"};
		String secretMonth = MONTHS[new Random().nextInt(MONTHS.length)];
		KeyboardScanner sc = new KeyboardScanner();
		String month;
		System.out.print("Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: ");
		month = sc.nextLine();
		while (!month.equals(secretMonth)) {
			System.out.print("No ha acertado. Intente adivinarlo introduciendo otro mes: ");
			month = sc.nextLine();
		}
		System.out.println("¡Ha acertado!");
	}

	//Práctica 2
	private static void calculateDniLetter() {
		final char[] LETTERS = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
		KeyboardScanner sc = new KeyboardScanner();
		System.out.print("Introduzca su DNI (sin la letra, utilice solo dígitos): ");
		int dni = sc.nextInt();
		if (dni >= 0 && dni <= 99999999) {
			char letter = LETTERS[dni%23];
			System.out.printf("%08d-%c%n", dni, letter);
		} else {
			System.out.println("El DNI es erróneo.");
		}
	}
	

}
