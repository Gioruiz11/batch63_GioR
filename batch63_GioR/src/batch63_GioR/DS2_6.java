package batch63_GioR;

import java.util.Scanner;

public class DS2_6 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Type the first number:");
		int a = s.nextInt();
		System.out.println("Type the second number:");
		int b = s.nextInt();
		int result = 1;
		for(int i = 1; i <= b; i++) {
			result *= a;
		}
		System.out.println(a + "^" + b + " = " + result);

	}

}
