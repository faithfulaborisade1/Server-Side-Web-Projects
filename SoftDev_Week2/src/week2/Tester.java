package week2;

public class Tester {
	
	public static void main(String [] args) {
		
		Person p1 = new Person();
		Person p2 = new Person("john");
		Person p3 = new Person("mary","cork");
		Person p4 = new Person("claire", 871234567);
		Person p5 = new Person("Micheal",871234567,"Dublin");
		
		p1.printDetails();
		p2.printDetails();
		p3.printDetails();
		p4.printDetails();
		p5.printDetails();
		
		
		String p2Address = p2.getAddress();
		System.out.println(p2Address);
		
		p2.setAddress("Kerry");
		System.out.println(p2Address);
	}
	
	

}
