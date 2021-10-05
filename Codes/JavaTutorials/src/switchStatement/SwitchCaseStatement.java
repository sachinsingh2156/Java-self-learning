package switchStatement;

public class SwitchCaseStatement {

	public static void main(String[] args) {
		int dayOfWeek = 1;
/*		if (dayOfWeek == 1) {
			
		}
		if (dayOfWeek == 2) {
			
		}
		if (dayOfWeek == 3) {
			
		}
		if (dayOfWeek == 4) {
			
		}
		if (dayOfWeek == 5) {
			
		}
		if (dayOfWeek == 6) {
			
		}
		if (dayOfWeek == 7) {
			
		} */
		switch (dayOfWeek) {
		case 1:
			System.out.println("Today is sunday");
			break;
		case 2:
			System.out.println("Today is Monday");
			break;
		case 3:
			System.out.println("Today is Tuesday");
			break;
		case 4:
			System.out.println("Today is Wednesday");
			break;
		case 5:
			System.out.println("Today is Thursday");
			break;
		case 6:
			System.out.println("Today is Friday");
			break;
		case 7:
			System.out.println("Today is saturday");
			break;
		default:
			System.out.println("I don't know what day it is");
		}

	}

}
