package jb29.unit6;

import java.util.Scanner;

// 20. Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.

public class Task20 {

	public static void main(String[] args) {

		int n;
		int sum = 0;
		int counter = 0;

		n = enterIntFromConsole("n");

		while (n > 0) {
			sum = calcSumDigits(n);
			counter++;
			n -= sum;
		}
		
		printResult("The number of operations ", counter);

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
