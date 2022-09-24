package batch63_GioR;

public class DS2_15 {

	public static void main(String[] args) {
		int remainder, count = 2, sum = 0, temp, cube;
		
		while(count < 500) {
			temp = count;
			while(temp != 0) {
			remainder = temp % 10;
			temp = temp / 10;
			cube = remainder * remainder * remainder;
			sum += cube;
			}
			if(sum == count) {
				System.out.println(count);
			}
			sum = 0;
			count++;
		}
		
	}

}
