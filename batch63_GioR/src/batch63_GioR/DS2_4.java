package batch63_GioR;

import java.util.Scanner;

public class DS2_4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Type a number: ");
		int input = s.nextInt();
		for(int i = 1; i <= 10; i++ ) {
			System.out.println(input + " * " + i + " = " + (input * i));
		}
	}

}
