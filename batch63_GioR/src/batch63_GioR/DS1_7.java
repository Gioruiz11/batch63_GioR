package batch63_GioR;

public class DS1_7 {

	public static void main(String[] args) { // find biggest number among 3 numbers
		int a = 0;
		int b = 0;
		int c = 80;
		
		if(a > b && a > c) {
			System.out.println("A is biggest number");
		}
		else if(b > a && b > c) {
			System.out.println("B is biggest number");
		}
		else if(c > a && c > b) {
			System.out.println("C is biggest number");
		}
		else {
			System.out.println("All numbers are even");
		}

	}

}
