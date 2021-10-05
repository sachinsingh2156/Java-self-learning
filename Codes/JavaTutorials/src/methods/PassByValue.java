package methods;

public class PassByValue {
	public static void main(String[] args) {
		
		int c = 34;
		int d = 12;
		
		swap(c, d);
		System.out.println(c +" "+ d);
//		System.out.println();
		
	/*	Dog x = new Dog(); x.legs = 4;
	*	Dog y = new Dog(); y.legs = 3;
	*	
	*	swap(x, y);
	*/
		Dog a = new Dog();
		a.legs = 4;
		changeDog(a);
//		System.out.println(x.legs+" "+y.legs);
		System.out.println(a.legs);
		
	}
	
	static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}
	static void swap (Dog m, Dog n) {
		Dog temp = m;
		m = n;
		n =temp;
	}
	static void changeDog(Dog dog) {
		dog.legs = 6;
	}
}

class Dog{
	int legs;
	
}