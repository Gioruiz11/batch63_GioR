package batch63_day12;

public class StringReversal {

	public static void main(String[] args) {
		String input = "Java is easy";
		System.out.println("input = " + input);
		String output = "";
		String[] stringArr = input.split(" ");
		for(int i = stringArr.length - 1; i >= 0; i--) {
			output += stringArr[i] + " ";
		}
		System.out.println("output = " + output);

	}

}
