package batch63_GioR;

import java.util.Scanner;

public class DS2_11 {

	public static void main(String[] args) {
		// perfect
		Scanner s = new Scanner(System.in);
		System.out.println("Type two numbers: ");
		int one = s.nextInt();
		int two = s.nextInt();
		int hcf = 1;
		for(int i = 1; i < one; i++) {
			if(one % i == 0 ) {
				if(two % i == 0) {
					hcf = i;
				}
			}
		}
		
		System.out.println("HCF is " + hcf);
		
	}

}
