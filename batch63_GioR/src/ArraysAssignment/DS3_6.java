package ArraysAssignment;

public class DS3_6 {

	public static void main(String[] args) {
		int[] arr = {10,21,7,304,7,591,0,9};
		for(int i = 0; i < arr.length; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] == arr[j]) {
					arr[i] = null;
				}
			}
		}

	}

}
