package batch63_GioR;

import java.util.Scanner;

public class DS2_8 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Type an even integer: ");
		int even = s.nextInt();
		System.out.println("Type an odd integer: ");
		int odd = s.nextInt();
		int sum = even + odd;
		System.out.println("The sum: " + sum);

	}

}
