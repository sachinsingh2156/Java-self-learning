package loops;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner (System.in);
	System.out.print("Enter the value of x : "); int x = sc.nextInt();
	System.out.print("Enter the value of y : "); int y = sc.nextInt();
	sc.close();
	
	int result = 1;
	for (int i = 0; i<y; i++) {
		result *= x;
	}
	System.out.println(result);

	}

}
