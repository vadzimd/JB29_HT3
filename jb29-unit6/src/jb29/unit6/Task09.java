package jb29.unit6;

import java.util.Random;

// 9. Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.

public class Task09 {

	public static void main(String[] args) {

		int[] array = new int[3];
		int gcd;

		populateRandomArrayValues(array);

		gcd = calculategcd(array);

		if (gcd == 1) {

			System.out.println("The numbers are coprime integers");

		} else {
			System.out.println("The numbers are not coprime integers");
		}
	}

	public static void populateRandomArrayValues(int[] array) {

		Random rand = new Random();

		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(100);

			printResult("array [" + i + "]", array[i]);

		}
	}

	public static int calculategcd(int[] array) {

		int gcd;

		gcd = findMinimum(array);

		while (gcd > 1) {
			int modTot = 0;

			for (int i = 0; i < array.length; i++) {

				modTot += array[i] % gcd;

			}

			if (modTot == 0) {
				return gcd;
			}

			gcd--;

		}

		return gcd;
	}

	public static int findMinimum(int[] array) {
		int minNum = array[0];

		for (int i = 1; i < array.length; i++) {
			if (array[i] < minNum) {

				minNum = array[i];
			}
		}

		return minNum;
	}

	public static void printResult(String message, double value) {

		System.out.println(message + " is " + value);
	}

}
