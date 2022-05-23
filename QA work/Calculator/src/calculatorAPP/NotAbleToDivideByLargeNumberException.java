package calculatorAPP;

public class NotAbleToDivideByLargeNumberException{
	
	public static void divexception(double num1, double num2) {
		try {
			System.out.println(num1/num2);
			
		} catch (ArithmeticException e) {
			System.out.println("Cant be divded by 0 ");
		}
	}

}
