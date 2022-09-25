package ArraysAssignment;

import java.util.Random;

public class DS3_2 {

	public static void main(String[] args) {
		Random r = new Random();
		int largest = 0;
		int[] arr = new int[10];
		// populate array
		// could also do int[] arr = {x,x,x,x,];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(50);
		}
		// search through array
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > largest) {
				largest = arr[i];
			}
		}
		System.out.println("biggest element in array: " + largest);
	}

}
