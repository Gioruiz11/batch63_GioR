package batch63_GioR;

import java.util.Scanner;

public class DS2_14 {

	public static void main(String[] args) {
		System.out.println("type as many numbers as you want, type a non-integer to"
				+ " exit program");
		Scanner s = new Scanner(System.in);
		int smallest = Integer.MAX_VALUE;
		int largest = Integer.MIN_VALUE;
		while(s.hasNextInt()) {
			int num = s.nextInt();
			if(num < smallest) {
				smallest = num;
			}
			if(num > largest) {
				largest = num;
			}
		}
		System.out.println("Largest value typed: " + largest);
		System.out.println("Smallest value typed: " + smallest);

	}

}
