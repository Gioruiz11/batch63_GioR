package batch63_GioR;

public class DS1_5 {

	public static void main(String[] args) { // swap two numbers without temp variable
		int a = 123;
		int b = 474;
		
		System.out.println("unswapped: " + a + " " + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("Swapped: " + a + " " + b);

	}

}
