package gal.teis.ejercicios;

import java.util.Scanner;

public class NumeroEntreUnoYDiez {
	@SuppressWarnings("resource")
	public static void prueba() {
		int numero = 0;
		Scanner teclado = new Scanner(System.in);
		boolean numeroEstaEntre0Y10;
		do {
			numeroEstaEntre0Y10 = true;
			System.out.println("Escribe un número entre 0 y 10:");
			try {
				numero = teclado.nextInt();
			} catch (Exception e) {
				teclado.nextLine();
				System.out.println(e);
				numeroEstaEntre0Y10 = false;
			}
			if (numero < 0) {
				numeroEstaEntre0Y10 = false;
			}
			if (numero > 10) {
				numeroEstaEntre0Y10 = false;
			}
			if (!numeroEstaEntre0Y10) {
				System.out.println("Este número no es válido!.");

			}
		} while (!numeroEstaEntre0Y10);
		System.out.println("Finalizada la prueba.");
	}
}