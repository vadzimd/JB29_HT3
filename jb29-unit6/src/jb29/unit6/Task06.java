package jb29.unit6;

import java.util.Random;

// 6. Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади треугольника.

public class Task06 {

	public static void main(String[] args) {

		int a;
		double squareTriangle;

		Random rand = new Random();
		a = rand.nextInt(100);

		squareTriangle = calcTriangleSquare(a);
		
		printResult("The side of the triangle", a);
		printResult("Square of the triangle", squareTriangle);
	}

	public static double calcTriangleSquare(int a) {
		double squareTriangle;

		squareTriangle = (double) ((a * a * Math.sqrt(3)) / 4);

		return squareTriangle;
	}

	public static void printResult(String message, double value) {

		System.out.println(message + " is " + value);
	}

}
