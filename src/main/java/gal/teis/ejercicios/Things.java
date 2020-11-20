package gal.teis.ejercicios;

import java.util.Scanner;

@SuppressWarnings({"resource", "unused"})
public class Things {

	public static void start() {
//		equalities();
		factorial();
	}

	private static void factorial() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca el valor a calcular: ");
		long num = sc.nextLong();
		try {
			long result = calculateFactorial(num);
			System.out.println(num + "! = " + result);
		} catch (ArithmeticException ex) {
			System.out.println("No ");
		}
	}

	private static long calculateFactorial(long num) throws ArithmeticException {
		if (num < 0) {
			throw new ArithmeticException();
		}
		if (num == 0) {
			return 1;
		}
		return num * calculateFactorial(num - 1);
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
}
