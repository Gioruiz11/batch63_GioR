package batch63_GioR;

import java.util.Scanner;

public class DS2_13 {

	public static void main(String[] args) {
		System.out.println("Type as many numbers as you want, type a non-integer to end"
				+ " the program");
		Scanner s = new Scanner(System.in);
		int posCounter = 0;
		int zeroCounter = 0;
		int negCounter = 0;
		while(s.hasNextInt()) {
			int nextint = s.nextInt();
			if(nextint > 0) {
				posCounter++;
			}
			else if(nextint == 0) {
				zeroCounter++;
			}
			else {
				negCounter++;
			}
		}
		System.out.println("Amount of positive numbers: " + posCounter);
		System.out.println("Amount of zero numbers: " + zeroCounter);
		System.out.println("Amount of negative numbers: " + negCounter);
	}

}
