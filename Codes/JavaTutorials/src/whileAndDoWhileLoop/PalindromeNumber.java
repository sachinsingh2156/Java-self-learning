package whileAndDoWhileLoop;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : "); int n = sc.nextInt();
		sc.close();
		
		int temp = n;
		int reversedNumber = 0;
		while (temp>0) {
			int lastdigit = temp%10;
			reversedNumber = reversedNumber * 10 + lastdigit;
			temp/=10;
		}
		if (reversedNumber == n) {
			System.out.println(n+" is a palindrome");
		} else {
			System.out.println(n+" is not a palindrome");
		}

	}

}
