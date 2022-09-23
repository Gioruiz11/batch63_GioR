package batch63_GioR;

import java.util.Scanner;

public class DS2_9 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Type a positive integer: ");
		int pos = s.nextInt();
		
		if(pos == 0 || pos == 1) {
			System.out.println(pos + " is not a prime number");
			return;
		}
		
		for(int i = 2; i < pos; i++) {
			if(pos % 2 == 0) {
				System.out.println(pos + " is not a prime number");
				return;
			}
			
		}
		System.out.println(pos + " is a prime number");
	}

}
