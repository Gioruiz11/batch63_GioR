package ArraysAssignment;

import java.util.Arrays;
import java.util.Collections;

public class DS3_4 {

	public static void main(String[] args) {
		Integer[] arr = {10,50,30439,30,-2,0,7}; // Integer wrapper class
		Arrays.sort(arr, Collections.reverseOrder());
		for(Integer i : arr) {
			System.out.println(i);
		}
		
	}

}
