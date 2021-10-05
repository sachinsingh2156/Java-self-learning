package userInput;

public class PreDefinedSimpleInterest {

	public static void main(String[] args) {
		int p = 5000; //p = principal
		//float r = 12.5f; //r = rate
		float r = (float) 12.5;
		int t = 12; // t= time
		
		double si = (p*t*r)/100; //si = simple interest
		System.out.println("The Simple Interest is " + si);
		

	}

}
