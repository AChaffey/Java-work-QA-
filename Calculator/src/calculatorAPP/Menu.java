package calculatorAPP;

import java.util.Scanner;

public class Menu {

	Scanner scan = new Scanner(System.in);
	
	public void screen() {
		
		boolean screen1 = true;
		String screen2 = " ";
		double number1;
		double number2;
		
		System.out.println("Welcome to the Calculator...");

		while (screen1) {
			System.out.println("Please select the Calculation you wish to do");
			System.out.println(" 1). Addition");
			System.out.println(" 2). Subtraction");
			System.out.println(" 3). Division");
			System.out.println(" 4). Multiplication");
			System.out.println(" 9). Exit Calculator");
			System.out.println("=".repeat(40));
			
			screen2 = this.scan.nextLine();
			
			switch (screen2) { 
			case "1":
				System.out.println("Please enter your First number");
				number1 = scan.nextDouble();
				scan.nextLine();
				System.out.println("Please Enter your Second number");
				number2 = scan.nextDouble();
				scan.nextLine();
				System.out.println(" The correct answer is");
				System.out.println(Calcdeets.add(number1, number2));
				System.out.println("=".repeat(40));
				break;
				
			case "2":
				System.out.println("Please enter your First number");
				number1 = scan.nextDouble();
				scan.nextLine();
				System.out.println("Please Enter your Second number");
				number2 = scan.nextDouble();
				scan.nextLine();
				System.out.println(" The correct answer is");
				System.out.println(Calcdeets.sub(number1, number2));
				System.out.println("=".repeat(40));
				break;
				
			case "3":
				
				System.out.println("Please enter your First number");
				number1 = scan.nextDouble();
				scan.nextLine();
				System.out.println("Please Enter your Second number");
				number2 = scan.nextDouble();
				scan.nextLine();
				System.out.println(" The correct answer is");
				System.out.println(Calcdeets.Div(number1, number2));
				System.out.println("=".repeat(40));
				break;
				
			case "4":
				
				System.out.println("Please enter your First number");
				number1 = scan.nextDouble();
				scan.nextLine();
				System.out.println("Please Enter your Second number");
				number2 = scan.nextDouble();
				scan.nextLine();
				System.out.println(" The correct answer is");
				System.out.println(Calcdeets.mult(number1, number2));
				System.out.println("=".repeat(40));
				break;
				
			case "9":
				screen1 = false;
				System.out.println("Ciao Ciao");
				System.out.println("=".repeat(40));
				break;
				
			default:
				System.out.println("ohh deary me... try again");
				System.out.println("=".repeat(40));
			}
		}
	
	}
}
