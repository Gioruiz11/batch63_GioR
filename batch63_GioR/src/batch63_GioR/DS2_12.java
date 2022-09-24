package batch63_GioR;

import java.util.Scanner;

public class DS2_12 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int one, two, sum;
		String cond;
		do {
			System.out.println("Enter two numbers: ");
			one = s.nextInt();
			two = s.nextInt();
			sum = one + two;
			System.out.println("The sum: " + sum);
			System.out.println("Type 'yes' if you want to repeat, type anything else to"
					+ " terminate the loop");
			s.nextLine();
			cond = s.nextLine();
		} while(cond.equals("yes"));
		s.close();
	}

}
