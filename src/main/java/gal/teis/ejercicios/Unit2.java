package gal.teis.ejercicios;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

@SuppressWarnings({ "resource", "unused" })
public class Unit2 {

	public static void start() {
//		convertHours(1000);
//		dateTime();
//		addTwoNumbers();
//		payIrpf();
//		qualificationPassFail();
//		averageQualification();
//		tooYoung();
//		temperatures();
//		qualification();
//		vehicles();
		weekDay();
	}

	private static void weekDay() {
		int day;
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el día de la semana (1-7): ");
		day = sc.nextInt();
		switch (day) {
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
			System.out.println("Dia laboral");
			break;
		case 1:
		case 7:
			System.out.println("Fin de semana");
			break;
		default:
			System.out.println("La semana solo tiene 7 días");
			break;
		}
	}

	private static void vehicles() {
		String vehicleType;

		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca el tipo de vehículo: ");
		vehicleType = sc.nextLine();

		switch (vehicleType.toLowerCase()) {
		case "coche":
			System.out.println("Puedes pasar de 00:00 a 08:00");
			break;
		case "camión":
			System.out.println("Puedes pasar de 08:00 a 16:00");
			break;
		case "moto":
			System.out.println("Puedes pasar de 16:00 a 24:00");
			break;
		default:
			System.out.println("No puedes pasar con " + vehicleType);
		}

	}

	private static void qualification() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nota (0-10): ");
		double nota = sc.nextDouble();
		if (nota == 10) {
			System.out.println("Matrícula de Honor");
		} else if (nota >= 9) {
			System.out.println("Sobresaliente");
		} else if (nota >= 7) {
			System.out.println("Notable");
		} else if (nota >= 5) {
			System.out.println("Un triste aprobado");
		} else {
			System.out.println("Suspenso");
		}
	}

	private static void temperatures() {
		int temp;
		String message;
		Random rnd = new Random();
		temp = rnd.nextInt(50);

		if (temp < 10) {
			message = "cuando el grajo vuela bajo, hace un frío de carajo";
		} else if (temp < 15) {
			message = "se está fresquito";
		} else if (temp < 25) {
			message = "la temperatura es agradable";
		} else if (temp < 35) {
			message = "hace algo de calor";
		} else {
			message = "hace un calor que caen los pájaros";
		}

		System.out.printf("La temperatura actual es de %dº, %s.%n", temp, message);
	}

	private static void tooYoung() {
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

	private static void averageQualification() {
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

	private static void qualificationPassFail() {
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

	private static void payIrpf() {
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

	private static void addTwoNumbers() {
		Scanner sc = new Scanner(System.in);
		int n1, n2;
		System.out.print("Introduce un número entero: ");
		n1 = sc.nextInt();
		System.out.print("Introduce otro número entero: ");
		n2 = sc.nextInt();
		System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
	}

	private static void dateTime() {
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyy");
		SimpleDateFormat timeFormat = new SimpleDateFormat("kk:mm:ss");
		System.out.println("La fecha actual es: " + dateFormat.format(date));
		System.out.println("La hora actual es: " + timeFormat.format(date));
	}

	private static void convertHours(int horas) {
		int semanas, dias, restoHoras;
		dias = horas / 24;
		restoHoras = horas % 24;
		semanas = dias / 7;
		dias %= 7;
		System.out.println(
				horas + " horas corresponden a " + semanas + " semanas, " + dias + " días y " + restoHoras + " horas.");
	}

}
