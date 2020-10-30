package gal.teis.ejercicios;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		exceptions();
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
