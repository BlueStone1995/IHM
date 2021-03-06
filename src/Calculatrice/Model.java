package Calculatrice;

public class Model {

	public long calculate(long number1, long number2, String operator) {
		switch (operator) {
		case "+":
			return number1 + number2;
		case "-":
			return number1 - number2;
		case "*":
			return number1 * number2;
		case "/":
			if (number2 == 0)
				return 0;

			return number1 / number2;
		}

		System.out.println("Unknown operator - " + operator);
		return 0;
	}

	public long calculateUnary(long number1, String operator) {
		return (long) Math.pow(number1, 2);
	}

}
