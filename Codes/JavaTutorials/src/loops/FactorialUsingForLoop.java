package loops;

import java.util.Scanner;

public class FactorialUsingForLoop {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the number : "); int n = sc.nextInt(); 
		sc.close();
		int factorial = 1;
		for (int i=1; i<=n; i++) {
			factorial = factorial * i;
		}
		System.out.println("The factorial of "+n+" is "+ factorial);
	}

}
