package jb29.unit6;

import java.util.ArrayList;
import java.util.Scanner;

// 17. Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр, возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи использовать декомпозицию.

public class Task17 {

	public static void main(String[] args) {

		int k;
		int counterN = 0;
		int sumN = 0;

		ArrayList<Integer> A = new ArrayList<>();

		k = enterIntFromConsole("k");

		for (int i = 1; i <= k; i++) {

			counterN = calcCountDigits(i);
			sumN = calcSumDigits(i);

			if (Math.pow(sumN, counterN) == i) {
				A.add(i);
			}

		}

		for (int i = 0; i < A.size(); i++) {
			printResult("Armstrong's digit", A.get(i));
		}

	}

	public static int calcCountDigits(int num) {
		int counter = 0;

		while (num != 0) {
			num /= 10;
			++counter;
		}

		return counter;
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
