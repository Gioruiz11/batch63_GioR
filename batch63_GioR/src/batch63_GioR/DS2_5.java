package batch63_GioR;

import java.util.Scanner;

public class DS2_5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Type a number: ");
		int input = s.nextInt();
		int product = 1;
		for(int i = 1; i <= input; i++) {
			product *= i;
		}
		System.out.println("Factorial is: " + product);
		
	}

}
