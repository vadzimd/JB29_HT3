package jb29.unit6;

// 10. Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.

public class Task10 {

	public static void main(String[] args) {

		int sum = 0;

		for (int i = 1; i < 10; i++) {
			sum += calcFactorial(i);
		}
		
		printResult("The sum of factorials", sum);

	}

	public static int calcFactorial(int number) {
		int factorial = 1;

		for (int i = 1; i <= number; i++) {
			factorial *= i;
		}

		return factorial;
	}

	public static void printResult(String message, double value) {

		System.out.println(message + " is " + value);
	}

}
