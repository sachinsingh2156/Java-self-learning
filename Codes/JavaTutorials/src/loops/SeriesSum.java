package loops;

import java.util.Scanner;

public class SeriesSum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of n : "); int n = sc.nextInt();
		sc.close();
		float result = 0;
		for (float i = 1; i <=n; i++) {
			result += 1/i;
		}
		System.out.println(result);
	}

}
