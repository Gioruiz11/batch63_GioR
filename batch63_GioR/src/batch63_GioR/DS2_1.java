package batch63_GioR;

public class DS2_1 {

	public static void main(String[] args) {// Check if number is prime or not
		int a = 7;
		for(int i = 2; i < a; i++) {
			if(a % i == 0) {
				System.out.println(a + " is NOT a prime number");
				return;
			}
		}
		System.out.println(a + " is a prime number");
		

	}

}
