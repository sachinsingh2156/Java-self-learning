package conditionalStatement;

public class IfElseByTernaryOperator {

	public static void main(String[] args) {
		int a = 15;
		int b = 81;
		
//			if(a>b) {
//				maxOfBothNumbers = a;
//			} else {
//				maxOfBothNumbers = b;
//			}

		int maxOfBothNumbers = a > b ? a : b;
			
			System.out.println("Max of both numbers = " +maxOfBothNumbers);

	}

}
