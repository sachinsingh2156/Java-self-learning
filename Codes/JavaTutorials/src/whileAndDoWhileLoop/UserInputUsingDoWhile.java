package whileAndDoWhileLoop;

import java.util.Scanner;

public class UserInputUsingDoWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.print("Enter a number : "); n = sc.nextInt();
			System.out.println("Number is " +n);
			
		} while (n != 0);

	}

}
