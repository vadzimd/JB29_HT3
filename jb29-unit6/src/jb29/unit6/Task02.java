package jb29.unit6;

import java.util.Random;

// 2. Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух натуральных чисел

public class Task02 {

	public static void main(String[] args) {

		int[] array = new int[2];
		int gcd;
		double lcm;

		populateRandomArrayValues(array);

		gcd = calculategcd(array[0], array[1]);
		
		lcm = calculateLSM(array[0], array[1], gcd);

		printResult("Greatest common divisor", gcd);
		printResult("Least common multiple", lcm);
	}

	public static void populateRandomArrayValues(int[] array) {

		Random rand = new Random();

		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(100);

			printResult("array [" + i + "]", array[i]);

		}
	}

	public static int calculategcd(int a, int b) {
		int gcd;

		if (a > b) {
			gcd = a;
		} else {
			gcd = b;
		}

		while (!((a % gcd == 0) && (b % gcd == 0))) {
			gcd--;
		}

		return gcd;
	}

	public static double calculateLSM(int a, int b, int gcd) {
		double lsm;

		lsm = (double) (a * b) / gcd;

		return lsm;
	}

	public static void printResult(String message, double value) {

		System.out.println(message + " is " + value);
	}

}
