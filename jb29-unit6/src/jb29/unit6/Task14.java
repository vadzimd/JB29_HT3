package jb29.unit6;

import java.util.Scanner;

// 14. Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.

public class Task14 {

	public static void main(String[] args) {

		int n;
		int m;
		int counterN;
		int counterM;

		n = enterIntFromConsole("N");
		m = enterIntFromConsole("M");

		counterN = calcCountDigits(n);
		counterM = calcCountDigits(m);

		if (counterN == counterM) {
			printResult("The numbers have equal number of digits", counterN);
		} else if (counterN > counterM) {
			printResult("The following number has more digits", n);
		}

		else {
			printResult("The following number has more digits", m);
		}

	}

	public static int calcCountDigits(int n) {
		int counter = 1;

		while (n / 10 != 0) {

			counter++;
			n /= 10;

		}

		return counter;
	}


	public static void printResult(String message, int value) {

		System.out.println(message + " is " + value);
	}

	public static int enterIntFromConsole(String message) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int number;

		System.out.println("Enter " + message + ": ");

		while (!scanner.hasNextInt()) {
			scanner.next();

			System.out.println("Enter " + message + ": ");
		}
		number = scanner.nextInt();

		return number;

	}

}
