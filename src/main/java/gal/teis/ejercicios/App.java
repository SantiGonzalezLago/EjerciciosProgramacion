package gal.teis.ejercicios;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		// exceptions();
		// NumeroEntreUnoYDiez.prueba();
		// igualdades();
		// stringMethods();
		// invertirStringBuilder("hola");
		invertirString("hola");
	}
	
	public static void invertirStringBuilder(String palabra) {
		StringBuilder sb = new StringBuilder(palabra);
		sb.reverse();
		System.out.println(sb.toString());
	}
	
	public static void invertirString(String palabra) {
		String palabraInvertida = "";
		for (int i = palabra.length() - 1; i >= 0; i--) {
			palabraInvertida += palabra.charAt(i);
		}
		System.out.println(palabraInvertida);
	}

	public static void stringMethods() {
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
		System.out.println(cadena.replace('a', 'i').replace('e', 'i').replace('o', 'i').replace('u', 'i')); // Ni pir michi midrigir iminici más timprini
	}

	public static void igualdades() {
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

	public static void exceptions() {
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
		} finally {
			sc.close();
		}
	}

}
