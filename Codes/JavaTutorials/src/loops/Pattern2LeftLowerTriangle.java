package loops;

import java.util.Scanner;

public class Pattern2LeftLowerTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		sc.close();
		for (int i=1; i<=n; i++) {
			for(int j = 1; j<=i; j++) {
				System.out.print("* ");
//				System.out.print(j);

			}
			System.out.println();
		}

	}

}
