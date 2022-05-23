package com.qa.calculatorAPP;

public class Calcdeets {
	
	public static double result;

	public static double add(double num1, double num2) {
		
		result =num1 + num2;
		
		return result;
		
	}
	public static double sub(double num1, double num2) {
		
		result =num1 - num2;
		
		return result;
	}
	
	public static double Div(double num1, double num2) {
			result =num1 / num2;
		
		return result;
	}
	
	public static double mult(double num1, double num2) {
		result =num1 * num2;
		
		return result;
}
	public static double Div2(double a, double b) throws ArithmeticException {
		
		if (b == 0) {
			throw new ArithmeticException("Cannot Divide by 0");
		} else if (a < b) {
			throw new ArithmeticException ("Avoid dividing a number larger than " + a);
		} else {
			return a / b;
		}
	}
}

