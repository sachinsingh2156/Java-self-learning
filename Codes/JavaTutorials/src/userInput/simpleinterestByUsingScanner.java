package userInput;
import java.util.Scanner;
public class simpleinterestByUsingScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the principal amount : " ); int p = sc.nextInt(); //p = principal
		//float r = 12.5f; //r = rate
		System.out.print("Enter the rate : " ); float r = sc.nextFloat();
		
		System.out.print("Enter the time period : " ); int t = sc.nextInt(); // t= time
		sc.close();
		
		double si = (p*t*r)/100; //si = simple interest
		System.out.print("The Simple Interest is " + si);

	}

}
