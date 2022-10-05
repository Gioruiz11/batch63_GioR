package batch63_day12;

import java.util.Scanner;

public class Stringinput {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Type something, input will be checked if its an int or not");
		String input = s.next();
		try {
			int x = Integer.parseInt(input);
			System.out.println("input is an int");
			} catch (NumberFormatException e) {
			System.out.println("input is NOT an int");
	}

}
}
