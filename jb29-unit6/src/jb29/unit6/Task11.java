package jb29.unit6;

import java.util.Random;
import java.util.Scanner;

// 11. Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6]. Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов массива с номерами от k до m.

public class Task11 {

	public static void main(String[] args) {

		int n;

		n = enterIntFromConsole("number of elements");

		int[] array = new int[n];

		populateRandomArrayValues(array);
		calcSumEvery3rd(array);

	}

	public static void populateRandomArrayValues(int[] array) {

		Random rand = new Random();

		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(100);

			printResult("array [" + i + "]", array[i]);

		}
	}

	public static void calcSumEvery3rd(int[] array) {
		int sum;

		for (int i = 0; i < array.length - 2; i = i + 2) {

			sum = 0;
			for (int j = i; j < i + 3; j++) {

				sum += array[j];

			}

			printResult("Elements start at [" + i + "], the sum is", sum);
		}

	}

	public static void printResult(String message, double value) {

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
