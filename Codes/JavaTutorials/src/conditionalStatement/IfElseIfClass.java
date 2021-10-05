package conditionalStatement;

public class IfElseIfClass {

	public static void main(String[] args) {
		int number = 2;
		
		if (number <= 10) {
			System.out.println("Number is less 10");
		} else if (number >10 & number <=20) {
			System.out.println("Number is greater than 10 and less 20");
		} else if (number >20 & number <=30) {
			System.out.println("Number is greater than 20 and less 30");
		} else {
			System.out.println("Number is greater than 30");
		}
	}
		
}
