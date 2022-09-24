package batch63_GioR;
import java.util.Scanner;
public class DS2_18 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Type up to what number 1/n + 1/n+1 - 1/n+2...");
		double input = s.nextDouble();
		double sum = 0;
		for(double i = 1; i <= input; i++) {
			if(i % 2 == 0) {
				sum -= 1/i;
			}
			else {
				sum += 1/i;
			}
			
		}
		System.out.println("result: " + sum);

	}

}
