package gal.teis.ejercicios;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JOptionPane;

@SuppressWarnings("resource")
public class Unit2 {

	public static void start() {
//		convertHours(1000);
//		dateTime();
//		addTwoNumbers();
//		payIrpf();
//		qualificationPassFail();
//		averageQualification();
		tooYoung();
	}

	public static void tooYoung() {
		int age;
		String name;
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca su nombre, por favor: ");
		name = sc.nextLine();
		System.out.print("Introduzca su edad: ");
		age = sc.nextInt();
		if (name.equalsIgnoreCase("Ana")) {
			System.out.println("¡Hola, Ana!");
			if (age >= 18) {
				System.out.println("Eres mayor de edad.");
			} else {
				System.out.println("Aún no eres mayor de edad.");
			}
		} else {
			System.out.println("Largo de aquí, " + name + ", no eres bien recibido.");
		}
	}

	public static void averageQualification() {
		int mathQ, historyQ, computingQ;
		double average;
		mathQ = Integer.parseInt(JOptionPane.showInputDialog("Nota de Matematicas"));
		historyQ = Integer.parseInt(JOptionPane.showInputDialog("Nota de Historia"));
		computingQ = Integer.parseInt(JOptionPane.showInputDialog("Nota de Informática"));
		average = (mathQ + historyQ + computingQ) / 3;
		if (average >= 5) {
			JOptionPane.showMessageDialog(null, "¡Enhorabuena! Tu media es " + average);
		} else {
			JOptionPane.showMessageDialog(null, "¡A Septiembre! Tu media es " + average);
		}
	}

	public static void qualificationPassFail() {
		Scanner sc = new Scanner(System.in);
		int qualification;
		System.out.print("Introduce la nota del examen: ");
		qualification = sc.nextInt();
		if (qualification >= 5) {
			System.out.println("Has aprobado");
		} else {
			System.out.println("Has suspendido");
		}

	}

	public static void payIrpf() {
		Scanner sc = new Scanner(System.in);
		double income;
		System.out.print("Introduzca sus ingresos anuales: ");
		income = sc.nextDouble();
		if (income < 12450) {
			System.out.println("Estás extento de pagar IRPF");
		} else {
			System.out.println("¡¡¡PAGA!!!");
		}
	}

	public static void addTwoNumbers() {
		Scanner sc = new Scanner(System.in);
		int n1, n2;
		System.out.print("Introduce un número entero: ");
		n1 = sc.nextInt();
		System.out.print("Introduce otro número entero: ");
		n2 = sc.nextInt();
		System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
	}

	public static void dateTime() {
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyy");
		SimpleDateFormat timeFormat = new SimpleDateFormat("kk:mm:ss");
		System.out.println("La fecha actual es: " + dateFormat.format(date));
		System.out.println("La hora actual es: " + timeFormat.format(date));
	}

	public static void convertHours(int horas) {
		int semanas, dias, restoHoras;
		dias = horas / 24;
		restoHoras = horas % 24;
		semanas = dias / 7;
		dias %= 7;
		System.out.println(
				horas + " horas corresponden a " + semanas + " semanas, " + dias + " días y " + restoHoras + " horas.");
	}

}
