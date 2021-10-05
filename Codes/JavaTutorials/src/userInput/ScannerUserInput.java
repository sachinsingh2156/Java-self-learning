package userInput;
import java.util.Scanner;

public class ScannerUserInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.close();
//		int x = sc.nextInt();
//		
//		double y = sc.nextDouble();
		
//		System.out.println(x);

		String hello = sc.nextLine();
		
		System.out.println(hello);
	}

}
