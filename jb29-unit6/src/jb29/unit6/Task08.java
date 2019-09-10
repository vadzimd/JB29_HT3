package jb29.unit6;

import java.util.Random;
import java.util.Scanner;

// 8. Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число, которое меньше максимального элемента массива, но больше всех других элементов).

public class Task08 {

	public static void main(String[] args) {

		int n;
		int maxNumPointer;

		n = enterIntFromConsole("n");

		int[] array = new int[n];

		populateRandomArrayValues(array);

		maxNumPointer = findMaximumPointer(array);

		array[maxNumPointer] = 0;

		maxNumPointer = findMaximumPointer(array);

		printResult("The 2nd maximum number", array[maxNumPointer]);

	}

	public static void populateRandomArrayValues(int[] array) {

		Random rand = new Random();

		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(100);

			printResult("array [" + i + "]", array[i]);

		}
	}

	public static int findMaximumPointer(int[] array) {
		int maxNum = array[0];
		int maxNumPointer = 0;

		for (int i = 1; i < array.length; i++) {
			if (array[i] > maxNum) {

				maxNum = array[i];
				maxNumPointer = i;
			}
		}

		return maxNumPointer;
	}

	public static double calcDistance(int x1, int x2, int y1, int y2) {

		double distance;

		distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

		return distance;

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
