package switchStatement;

public class MultiCaseSingleResult {

	public static void main(String[] args) {
		int rating = 2;
		
		switch (rating) {
		case 1:
		case 2:
			System.out.println("Bad Review");
			break;
		case 3:
			System.out.println("Average Review");
			break;
		case 4:
		case 5:
			System.out.println("Good Review");
			break;


		}

	}

}
