package jb29.unit6;

import java.util.Scanner;

// 19. Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры. Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.

public class Task19 {

	public static void main(String[] args) {

		int n;
		int sum = 0;
		int countEvenDigits;
		boolean isOddDigitNum;

		n = enterIntFromConsole("n");

		for (int i = (int) Math.pow(10, n - 1); i < Math.pow(10, n); i++) {

			isOddDigitNum = true;

			isOddDigitNum = checkOddDigits(i);

			if (isOddDigitNum == true) {

				sum += i;
				;
			}

		}

		countEvenDigits = calcEvenDigits(sum);

		printResult("Sum of numbers having only odd digits", sum);
		printResult("The number of even digits in sum", countEvenDigits);

	}

	public static boolean checkOddDigits(int num) {

		while (num > 0) {
			if (num % 2 == 0) {
				return false;

			}
			num = num / 10;
		}

		return true;
	}

	public static int calcEvenDigits(int num) {
		int counter = 0;

		while (num > 0) {
			if (num % 2 == 0) {
				counter++;

			}
			num = num / 10;
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

		if (number <= 0) {
			printResult("Please enter > ", 0);
			System.exit(0);
			;
		}

		return number;

	}

}
