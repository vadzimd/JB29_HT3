package jb29.unit6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 15. Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого являются числа, сумма цифр которых равна К и которые не большее N.

public class Task15 {

	public static void main(String[] args) {

		int k;
		int n;

		k = enterIntFromConsole("K");
		n = enterIntFromConsole("N");

		populateArrayValues(k, n);

	}

	public static void populateArrayValues(int k, int n) {

		int sumNum = 0;
		List<Integer> A = new ArrayList<>();

		for (int i = 0; i < n; i++) {

			sumNum = calcSumDigits(i);

			if (sumNum == k) {
				A.add(i);
			}

		}

		for (int i = 0; i < A.size(); i++) {
			printResult("Element: ", A.get(i));
		}

	}

	public static int calcSumDigits(int num) {
		int sum = 0;

		while (num > 0) {
			sum += num % 10;
			num = num / 10;
		}

		return sum;
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
