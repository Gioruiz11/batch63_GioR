package batch63_GioR;

import java.util.Scanner;

public class DS2_16 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("How many fibonacci numbers to print: ");
		int input = s.nextInt();
		int firstNum = 0;
		int secondNum = 1;
		int sum = 0;
		int counter = 0;
		
		while(counter < input) {
			System.out.println(firstNum + " ");
			sum = firstNum + secondNum;
			firstNum = secondNum;
			secondNum = sum;
			counter++;
		}
		
		

	}

}
