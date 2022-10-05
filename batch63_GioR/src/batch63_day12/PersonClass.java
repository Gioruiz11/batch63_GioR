package batch63_day12;

class Person{
	int pid;
	String pname;
	
	Person(int pid, String pname){
		this.pid = pid;
		this.pname = pname;
	}
	
	String getName() {
		return pname;
	}

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + "]";
	}
	
	
	
	
}


public class PersonClass {

	public static void main(String[] args) {
		Person[] pArray = new Person[10];
		
		Person p1 = new Person(1, "john");
		pArray[0] = p1;
		Person p2 = new Person(2, "adam");
		pArray[1] = p2;
		Person p3 = new Person(3, "brian");
		pArray[2] = p3;
		Person p4 = new Person(4, "bryan");
		pArray[3] = p4;
		Person p5 = new Person(5, "noel");
		pArray[4] = p5;
		Person p6 = new Person(6, "abigail");
		pArray[5] = p6;
		Person p7 = new Person(7, "Ashley");
		pArray[6] = p7;
		Person p8 = new Person(8, "garcia");
		pArray[7] = p8;
		Person p9 = new Person(9, "robert");
		pArray[8] = p9;
		Person p10 = new Person(10, "Johan");
		pArray[9] = p10;
		
		for(Person p : pArray) {
			if (p.getName().toLowerCase().charAt(0) == 'a' ||
				p.getName().toLowerCase().charAt(0) == 'j'){
				System.out.println(p.toString());
			}
		}

	}

}
