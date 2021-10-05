package string;

public class AnagramByOptimization1 {

	public static void main(String[] args) {
		
		String a = "@$12aab";
		String b = "aba$@21";
		boolean isAnagram = true;
		
		int al[] = new int [256];
		int bl[] = new int [256];
		
//		System.out.println(al);
//		System.out.println(bl);
		
		for (char c: a.toCharArray()) {
			int index = (int) c;
			al[index]++;
		}
		for (char c: b.toCharArray()) {
			int index = (int) c;
			bl[index]++;
		}
		for(int i=0; i<256; i++) {
			if (al[i] != bl[i]) {
				isAnagram = false;
				break;
			}
		}
		if (isAnagram) {
			System.out.println("This is a Anagram.");
		} else {
			System.out.println("This is not a Anagram.");
		}

	}

}
