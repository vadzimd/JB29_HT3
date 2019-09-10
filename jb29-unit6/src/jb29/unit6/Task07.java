package jb29.unit6;

import java.util.Random;
import java.util.Scanner;

// 7. На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между какими из пар точек самое большое расстояние. Указание. Координаты точек занести в массив.

public class Task07 {

	public static void main(String[] args) {

		int n;
		
		n = enterIntFromConsole("n");

		int[] array = new int[n * 2];

		populateRandomArrayValues(array);

		findMaxDistance(array);

	}

	public static void populateRandomArrayValues(int[] array) {

		Random rand = new Random();

		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(100);

			printResult("array [" + i + "]", array[i]);

		}
	}

	public static void findMaxDistance(int[] array) {

		double currentDistance = 0;
		double maxDistance = 0;
		int x1P = 0;
		int x2P = 0;

		for (int i = 0; i < array.length - 1; i = i + 2) {
			for (int j = i + 2; j < array.length - 1; j = j + 2) {

				currentDistance = calcDistance(array[i], array[i + 1], array[j], array[j + 1]);

				if (maxDistance < currentDistance) {

					maxDistance = currentDistance;
					x1P = i;
					x2P = j;
				}

			}

		}

		for (int i = x1P; i < x1P + 2; i++) {

			printResult("Coordinate point 1 [" + i + "]", array[i]);
		}
		
		for (int i = x2P; i < x2P + 2; i++) {

			printResult("Coordinate point 2 [" + i + "]", array[i]);
		}
		
		printResult("Maximal distance", maxDistance);
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
