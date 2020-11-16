package gal.teis.ejercicios;

import java.util.Scanner;

@SuppressWarnings({"resource", "unused"})
public class Unit1 {

	public static void start() {
//		exceptions();
//		numberBetweenOneAndTen();
//		equalities();
//		stringMethods();
//		invertStringBuilder("hola");
//		invertString("hola");
	}

	private static void invertStringBuilder(String palabra) {
		StringBuilder sb = new StringBuilder(palabra);
		sb.reverse();
		System.out.println(sb.toString());
	}

	private static void invertString(String palabra) {
		String palabraInvertida = "";
		for (int i = palabra.length() - 1; i >= 0; i--) {
			palabraInvertida += palabra.charAt(i);
		}
		System.out.println(palabraInvertida);
	}

	private static void stringMethods() {
		String cadena = "No por mucho madrugar amanece más temprano";
		System.out.println(cadena.charAt(0)); // N
		System.out.println(cadena.charAt(9)); // c
		System.out.println(cadena.endsWith("o")); // true
		System.out.println(cadena.startsWith("n")); // false
		System.out.println(cadena.equals("No por mucho madrugar amanece más temprano")); // true
		System.out.println(cadena.indexOf("mucho")); // 7
		System.out.println(cadena.length()); // 42
		System.out.println(cadena.replace('o', 'i')); // Ni pir muchi madrugar amanece más temprani
		System.out.println(cadena.toLowerCase()); // no por mucho madrugar amanece más temprano
		System.out.println(cadena.toUpperCase()); // NO POR MUCHO MADRUGAR AMANECE MÁS TEMPRANO
		System.out.println(cadena.replace('a', 'i').replace('e', 'i').replace('o', 'i').replace('u', 'i'));
		// Ni pir michi midrigir iminici más timprini
	}

	private static void equalities() {
		int a1 = 2;
		int a2 = 2;
		Integer b1 = 2;
		Integer b2 = 2;
		Integer c1 = 256;
		Integer c2 = 256;
		int d1 = 256;
		int d2 = 256;
		System.out.println(a1 == a2);
		System.out.println(b1 == b2);
		System.out.println(c1 == c2);
		System.out.println(d1 == d2);
	}

	private static void numberBetweenOneAndTen() {
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

	private static void exceptions() {
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("introduzca un numero");
		try {
			number = sc.nextInt();
			if (number % 2 == 0) {
				System.out.println("El número " + number + " es par.");
			} else {
				System.out.println("El número " + number + " es impar.");
			}
		} catch (Exception e) {
			System.out.println("Ha habido un error en la introducción de datos");
		}
	}

}
