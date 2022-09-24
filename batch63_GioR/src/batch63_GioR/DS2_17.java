package batch63_GioR;

import java.util.Scanner;

public class DS2_17 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double sum = 0;
		System.out.println("Type an input to add 1/n: ");
		double input = s.nextDouble();
		for(double i = 1; i <= input; i++) {
			sum += 1/i;
		}
		System.out.println("result: " + sum);

	}

}
