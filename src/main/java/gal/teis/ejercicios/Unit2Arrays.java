package gal.teis.ejercicios;

import java.util.Random;

import gal.teis.io.KeyboardScanner;

public class Unit2Arrays {

	public static void start() {
		guessMonth();
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
}
