package jb29.unit6;

import java.util.Random;

// 1. Треугольник задан координатами своих вершин. Написать метод для вычисления его площади.

public class Task01 {

	public static void main(String[] args) {

		int[] arrayX = new int[3];
		int[] arrayY = new int[3];
		double squareTriangle = 0;

		populateRandomArrayValues(arrayX);

		populateRandomArrayValues(arrayY);

		squareTriangle = calculateTriangleSquare(arrayX, arrayY);

		printResult("the square of triangle", squareTriangle);
	}

	public static void populateRandomArrayValues(int[] array) {

		Random rand = new Random();

		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(100);

		}
	}

	public static double calculateTriangleSquare(int[] arrayX, int[] arrayY) {
		double squareTriangle;

		squareTriangle = (double) Math.abs(
				(arrayX[1] - arrayX[0]) * (arrayY[2] - arrayY[0]) - (arrayX[2] - arrayX[0]) * (arrayY[1] - arrayY[0]))
				/ 2;

		return squareTriangle;
	}

	public static void printResult(String message, double value) {

		System.out.println("The result: " + message + " is " + value);
	}

}
