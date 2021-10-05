package switchStatement;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter first number : "); int a = sc.nextInt();
		System.out.print("Enter second number : "); int b = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter the operation : "); char operation = sc.nextLine().charAt(0);
		sc.close();
		
		switch (operation) {
		case '+':
			System.out.println("The result is : " +(a + b));
			break;
		case '-':
			System.out.println("The result is : " +(a - b));
			break;
		case '*':
			System.out.println("The result is : " +(a * b));
			break;
		case '/':
			System.out.println("The result is : " +(a / b));
			break;
		default:
			System.out.println("Invalid Operation");
			
			
		}
		

		
	}

}
