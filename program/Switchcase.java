package program;

import java.util.Scanner;

public class Switchcase {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Select an operation:");
		
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		
		System.out.println("Enter your choise (1/2/3/4): ");
		int choise = sc.nextInt();
		
		System.out.println("Enter first number: ");
		double num1 = sc.nextDouble();
		
		System.out.println("Enter second number: ");
		double num2 = sc.nextDouble();
		
		double result;
		
		switch(choise) {
		case 1:
			result = num1  + num2;
			System.out.println("Result: "+result);
			break;
			
		case 2:
			result = num1  - num2;
			System.out.println("Result: "+result);
			break;
			
		case 3:
			result = num1  * num2;
			System.out.println("Result: "+result);
			break;
			
		case 4:
			if(num2 !=0) {
			result = num1  / num2;
			System.out.println("Result: "+result);
			}else {
				System.out.println("Eroror: Division by zero not allowed");
			}
			break;
		default:
			System.out.println("Invalid choise select the correct choise");
			
			
					
		}
	}

}
