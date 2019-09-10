package jb29.unit6;

import java.util.Random;

// 1. Треугольник задан координатами своих вершин. Написать метод для вычисления его площади.

public class Task12 {

	public static void main(String[] args) {

		int[] array = new int[4];
		double squareQuadrangle = 0;

		populateRandomArrayValues(array);

		squareQuadrangle = calculateQuadrangleSquare(array);

		if (Double.isNaN(squareQuadrangle) == true) {
			printResult("The quadrangle doesn't exist", squareQuadrangle);
		} else {

			printResult("The square of quadrangle", squareQuadrangle);
		}
	}

	public static void populateRandomArrayValues(int[] array) {

		Random rand = new Random();

		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(100);

			printResult("array [" + i + "]", array[i]);

		}
	}

	public static double calculateQuadrangleSquare(int[] array) {
		double squareQuadrangle;
		double diagonale;

		diagonale = Math.sqrt(array[0] * array[0] + array[1] * array[1]);

		squareQuadrangle = (double) (array[0] * array[1] * 0.5)
				+ (0.25 * Math.sqrt((diagonale + array[2] + array[3]) * (diagonale + array[2] - array[3])
						* (diagonale + array[3] - array[2]) * (array[2] + array[3] - diagonale)));

		return squareQuadrangle;
	}

	public static void printResult(String message, double value) {

		System.out.println(message + " is " + value);
	}

}
