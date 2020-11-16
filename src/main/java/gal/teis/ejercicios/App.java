package gal.teis.ejercicios;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
//		exceptions();
//		NumeroEntreUnoYDiez.prueba();
//		equalities();
//		stringMethods();
//		invertStringBuilder("hola");
//		invertString("hola");
//		convertHours(1000);
//		dateTime();
		addTwoNumbers();
	}
	
	public static void addTwoNumbers() {
		Scanner sc = new Scanner(System.in);
		int n1, n2;
		System.out.print("Introduce un número entero: ");
		n1 = sc.nextInt();
		System.out.print("Introduce otro número entero: ");
		n2 = sc.nextInt();
		sc.close();
		System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
	}
	
	public static void dateTime() {
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyy");
		SimpleDateFormat timeFormat = new SimpleDateFormat("kk:mm:ss");
		System.out.println("La fecha actual es: " + dateFormat.format(date));
		System.out.println("La hora actual es: " + timeFormat.format(date));
	}

	public static void convertHours (int horas) {
		int semanas, dias, restoHoras;
		dias = horas/24;
		restoHoras = horas%24;
		semanas = dias/7;
		dias %= 7;
		System.out.println(horas +" horas corresponden a " + semanas + " semanas, " + dias + " días y " + restoHoras + " horas.");
	}

	public static void invertStringBuilder(String palabra) {
		StringBuilder sb = new StringBuilder(palabra);
		sb.reverse();
		System.out.println(sb.toString());
	}

	public static void invertString(String palabra) {
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
		System.out.println(cadena.replace('a', 'i').replace('e', 'i').replace('o', 'i').replace('u', 'i'));
		// Ni pir michi midrigir iminici más timprini
	}

	public static void equalities() {
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
