package operators;

public class ArthmeticOperators {

	public static void main(String[] args) {
		int a = 23;
		int b = 45;
		
		int c = a+b;
		int d = a-b;
		int e = a*b;
//		int f = b/a;
		double f = (double) b / (double) a;
		
		int g = a*a + b*b +2*a*b;
		
		int h = (a+b) * (a+b);
		
		int i = b % a;
		
		int j = b++;
		
		int k = ++b;
		
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
	}

}
