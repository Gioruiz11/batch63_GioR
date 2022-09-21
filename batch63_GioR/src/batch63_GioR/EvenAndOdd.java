package batch63_GioR;

public class EvenAndOdd {

	public static void main(String[] args) {
				int osum = 0;
				int esum = 0;
				
				for(int i = 1; i <= 10; i++) {
					if(i % 2 == 0) {
						esum += i;
						System.out.println(i + " Even number, total: " + esum);
					}
					else {
						osum += i;
						System.out.println(i + " Odd number, total: " + osum);
					}
				}
				System.out.println("Even sum: " + esum);
				System.out.println("Odd sum: " + osum);

			}

}
