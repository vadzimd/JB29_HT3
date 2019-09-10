package jb29.unit6;

import java.util.Random;

// 5. Написать метод(методы) для нахождения суммы большего и меньшего из трех чисел.

public class Task05 {

	public static void main(String[] args) {

		int[] array = new int[3];
		int minNum;
		int maxNum;
		int sum = 0;

		populateRandomArrayValues(array);
		
		minNum = findMinimum(array);
		maxNum = findMaximum(array);
		
		sum = minNum + maxNum;

		printResult("sum", sum);
	}

	public static void populateRandomArrayValues(int[] array) {

		Random rand = new Random();

		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(100);

			printResult("array [" + i + "]", array[i]);

		}
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
	
	public static int findMaximum(int[] array) {
		int maxNum = array[0];

		for (int i = 1; i < array.length; i++) {
			if (array[i] > maxNum) {

				maxNum = array[i];
			}
		}

		return maxNum;
	}

	public static void printResult(String message, double value) {

		System.out.println(message + " is " + value);
	}

}
