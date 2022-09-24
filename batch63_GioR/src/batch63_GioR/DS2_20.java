package batch63_GioR;

import java.util.Random;
import java.util.Scanner;

public class DS2_20 {

	public static void main(String[] args) {
		System.out.println("Guess a number between 1 and 20");
		Random r = new Random();
		Scanner s = new Scanner(System.in);
		
		int num = r.nextInt(21);
		int guess = s.nextInt();
		while(guess != num) {
			if(guess < num) {
				System.out.println("Too low, try again");
				guess=s.nextInt();
			}
			if(guess > num) {
				System.out.println("Too high, try again");
				guess=s.nextInt();
				}
			
		}
		System.out.println("Correct! the number is " + num);
		
	}

}
