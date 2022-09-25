package ArraysAssignment;

public class DS3_1 {
	

	public static void main(String[] args) {
		int[] arr = new int[10];
		int searchFor = 4;
		// populate array
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
		// search array
		for(int i: arr) {
			if(searchFor == i) {
				System.out.println(searchFor + " is in index " + i);
			}
		}
	}

}
