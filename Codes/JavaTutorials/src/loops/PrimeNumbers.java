package loops;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the value of n : "); int n = sc.nextInt();
		sc.close();
		
		boolean isPrime = true; 
		if (n<2) {
			System.out.println(n+" is not a prime number.");
		} else {
			
//			for (int i=2; i<n; i++) {
			for (int i=2; (i*i)<n; i++) {

				if(n%i == 0) {
					isPrime = true;
					break;
				} else {
					isPrime = false;
				}
			}
			if (isPrime == true) {
				System.out.println(n+" is a not prime number.");
			} else {
				System.out.println(n+" is a prime number.");
			}
		}
		
	}
}

