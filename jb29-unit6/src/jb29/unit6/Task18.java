package jb29.unit6;

import java.util.ArrayList;
import java.util.Scanner;

// 18. Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую последовательность (например, 1234, 5789). Для решения задачи использовать декомпозицию.

public class Task18 {

	public static void main(String[] args) {

		int n;
		boolean isUpperSequence;

		ArrayList<Integer> A = new ArrayList<>();

		n = enterIntFromConsole("n");

		if (n <= 1) {
			printResult("Please enter > ", 1);
			System.exit(0);
			;
		}

		for (int i = (int) Math.pow(10, n - 1); i < Math.pow(10, n); i++) {

			isUpperSequence = true;

			isUpperSequence = checkSequence(i);

			if (isUpperSequence == true) {

				A.add(i);
			}

		}

		for (int i = 0; i < A.size(); i++) {
			printResult("Digits which make sequence", A.get(i));
		}

	}

	public static boolean checkSequence(int num) {

		int currNum = num % 10;
		num /= 10;

		while (num > 0) {
			if (num % 10 >= currNum) {
				return false;

			}
			currNum = num % 10;
			num = num / 10;
		}

		return true;
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
