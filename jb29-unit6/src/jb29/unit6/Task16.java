package jb29.unit6;

import java.util.ArrayList;
import java.util.Scanner;

// 15. Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого являются числа, сумма цифр которых равна К и которые не большее N.

public class Task16 {

	public static void main(String[] args) {

		int n;

		n = enterIntFromConsole("n");

		if (n < 2) {

			n = 2;
		}

		findTwins(n);

	}

	public static void findTwins(int n) {

		ArrayList<Integer> A = new ArrayList<>();

		for (int i = n; i <= 2 * n; i += 2) {

			A.add(i);
		}

		for (int i = n + 1; i <= 2 * n; i += 2) {

			A.add(i);
		}

		for (int i = 0; i < A.size(); i++) {
			printResult("Element", A.get(i));
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
