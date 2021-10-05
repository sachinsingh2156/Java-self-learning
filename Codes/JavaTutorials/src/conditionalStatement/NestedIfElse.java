package conditionalStatement;

public class NestedIfElse {

	public static void main(String[] args) {
		int a = 12, b = 8, c = 10;
		int result = 0;
//		if (a>b) {
//			if (a>c) {
//				result	= a;		
//			} else {
//				result = c;
//			}
//		} else { 
//			if (b > c) {
//				result = b;
//			} else {
//				result = c;
//			}
//		}
//		System.out.println("Largest of the three umber is " + result);
	
	/* In ternary operator*/
		
		result = a>b ? a>c ? a : c : b>c ? b : c;
		System.out.println("Largest of the three umber is " + result);
	}

}
