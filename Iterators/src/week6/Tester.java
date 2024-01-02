package week6;

public class Tester {
	
	public static void main(String [] args) {
		HashMapExample hashMapExample = new HashMapExample();
		Person p = hashMapExample.getRefForName("Micheal");
		
		
//		ArrayListExample aList = new ArrayListExample();
//		Person p = aList.getRefForName("Mary");
		
		p.printDetails();
	}

}
