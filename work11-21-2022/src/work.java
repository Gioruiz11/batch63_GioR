
public class work {

	public int biggerNumber(int a, int b) {
		if(a > b) {
			return a;
		}
		return b;
	}
	
	public int[] swapNum(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
		int[] arr = {a,b};
		return arr;
	}
	
	public int[] swapNumNoTemp(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        int[] arr = {a,b};
        return arr;
	}
	
	public String evenOrOdd(int num) {
		if(num % 2 == 0) {
			return "even";
		}
		return "odd";
	}
	
	public int biggerThreeNumbers(int a, int b, int c) {
		if(a > b && a > c) {
			return a;
		}
		if(b > a && b > c) {
			return b;
		}
		return c;
	}
	
	public String vowelOrConsonant(char c) {
		if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
			return "vowel";
		}
		return "consonant";
	}
	public static void main(String[] args) {
		work w = new work();
		System.out.println(w.biggerNumber(300, 203));
		System.out.println(w.evenOrOdd(23));
		System.out.println(w.biggerThreeNumbers(200, 250, 300));
		System.out.println(w.vowelOrConsonant('r'));
	}

}
