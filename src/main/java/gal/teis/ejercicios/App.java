package gal.teis.ejercicios;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		//exceptions();
		//NumeroEntreUnoYDiez.prueba();
		//igualdades();
		ifElse();
	}
	
	public static void ifElse() {
		int numero1 = 1;
		int numero2 = 2;
		int numero3 = 3;
		if (numero1 == 1) {
			System.out.println("Número 1");
		} else if (numero2 == 2) {
			System.out.println("Número 2");
		} else if (numero3 == 3) {
			System.out.println("Número 3");
		}
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
