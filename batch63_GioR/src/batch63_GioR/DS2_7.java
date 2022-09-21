package batch63_GioR;

import java.util.Scanner;

public class DS2_7 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Type a number to reverse: ");
		int a = s.nextInt();
		int result = 0;
		while(a > 0) {
			int end = a % 10;
			a = a / 10;
			result = (result * 10) + end;
		}
		System.out.println("Reversed: " + result);
	}

}
