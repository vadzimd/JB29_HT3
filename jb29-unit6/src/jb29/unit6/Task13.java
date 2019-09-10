package jb29.unit6;

import java.util.Scanner;

// 13. Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого являются цифры числа N.

public class Task13 {

	public static void main(String[] args) {

		int n;

		n = enterIntFromConsole("N");

		createArrayFromNumber(n);

	}

	public static void createArrayFromNumber(int n) {

		int[] array = new int[String.valueOf(n).length()];

		for (int i = 0; i < array.length; i++) {

			array[i] = n % 10;

			n = n / 10;

			printResult("array [" + i + "]", array[i]);

		}
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
