package se.lexicon.laurice.cal;

import java.security.InvalidParameterException;
import java.util.Scanner;

public class calculator {

	static String op;
	static Scanner scan = new Scanner(System.in);

	static int num1;
	static int num2;
	static double ans;

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = false;
		
		do {
			System.out.println("Choose + for addition. - for substaction. * for multiplication. / for division");
			System.out.println("Put your opretor");
			op = scan.nextLine();

			System.out.println("Put first number");
			num1 = (int) getValidDouble();
			System.out.println("Put secound number");
			num2 = (int) getValidDouble();
			switch (op) {
			case "+":
				ans = add(num1, num2);
				break;
			case "-":
				ans = sub(num1, num2);
				break;
			case "*":
				ans = mult(num1, num2);
				break;
			case "/":
				ans = div(num1, num2);
				break;
			default:
				System.out.println("Not valid opretor");
				break;
			}
			System.out.println("Result = " + ans);
			System.out.println("Type Yes+ to continue");
			System.out.println("Type no + to good bye");
			String answer = input.nextLine().toLowerCase();
			switch (answer) {
			case "yes":
				run = true;
				break;

			case "no":
				run = false;
				break;
			default:
				run = false;

			}

		} while (run);

		input.close();
		System.out.println("Good bye");

	}

	public static double getValidDouble() {

		boolean valid = false;
		double number = 0;

		while (!valid) {
			try {
				String input = scan.nextLine();
				number = Double.parseDouble(input);
				valid = true;
			} catch (NumberFormatException e) {
				System.err.println("Input is not a valid double");
			}
		}
		return number;
	}

	public static double add(double num1, double num2) {

		return num1 + num2;

	}

	public static double sub(double num1, double num2) {

		return num1 - num2;
	}

	public static double mult(double num1, double num2) {

		return num1 * num2;

	}

	public static double div(double num1, double num2) {
		
		if(num1 >0 && num2 >0) {
			return num1 / num2;
		}
		
		throw new InvalidParameterException("You cant divide by 0");

	}
}
