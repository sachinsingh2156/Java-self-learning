package string;

public class StriingIntro {

	public static void main(String[] args) {
//		String name = "sachin";
//		
//		String anotherName = new String ("minal");
//		System.out.println(name);
//		System.out.println(anotherName);
		
		String name = "sachin";
		String name2 = "sachin";
		String anotherName = new String ("sachin");
		System.out.println(name == anotherName);
		System.out.println(name == name2);
		System.out.println(name.charAt(5));
		System.out.println(name.length());
		System.out.println();
		
		String name3 = "Sachin Singh";
		String name4 = new String ("Sachin Singh");
		System.out.println(name3.length());
		System.out.println(name3.substring(2));
		System.out.println(name3.substring(2,9));
		
		System.out.println(name3.contains("Sachin"));
		System.out.println(name3.equals(name4));
		
		String name5 = "";
		System.out.println(name5.isEmpty());
		
		String name6 = "Sachin";
//		String name7 = "Singh";
		
		name6 += "Singh";
		System.out.println(name6);
		System.out.println(name6.concat("Kumar"));
		
		String name7 = "Saurav";
		System.out.println(name7.replace('S', 'M'));
		
		String cars = "Hundai,Maurati,Swift,Wagonr,Ferari,Lamborghini";
		String allCars[] = cars.split(",");
		
		for(String car : allCars) {
			
			System.out.println(car);
		}
		
		String cars2 = "Hundai,Maurati,Swift,Wagonr,Ferari,Lamborghini";
		System.out.println(cars2.indexOf('i'));
		
		System.out.println(cars2.toLowerCase());
		System.out.println(cars2.toUpperCase());

		String name8 = "      Sachin   ";
		System.out.println(name8.trim());
		
	}
}
