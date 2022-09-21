package batch63_GioR;

public class ReverseNum {

	public static void main(String[] args) {
		int a = 435;
		String s = "";
		while(a > 10) {
			s += a % 10;
			a = a / 10;
		}
		s += a;
		int awnser = Integer.parseInt(s);
		System.out.println(awnser);
		

	}

}
