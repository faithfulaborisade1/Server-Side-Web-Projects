package week2;

public class Person {
	
	public String name;
	public int phoneNumber;
	public String address;
	
	public Person() {
		this.name = null;
		this.phoneNumber = 0;
		this.address = null;
	}
	
	public Person(String name) {
		this.name = name;
	}
	
	public Person(String name, String address) {
		this.name = name;
		this.address = address;
		
	}
	
	public Person(String name, long phone) {
		this.name = name;
		this.phoneNumber = (int) phone;
		
	}
	
	public Person(String name, long phone, String address) {
		this.name = name;
		this.phoneNumber = (int) phone;
		this.address = address;
		
	}
	
//	public void main(String [] args) {
//		Person p1 = new Person();
//		Person p2 = new Person("john");
//		Person p3 = new Person("mary","cork");
//		Person p4 = new Person("claire", 871234567);
//		Person p5 = new Person("Micheal",871234567,"Dublin");
//		
//		System.out.println(p5.address);
//	}
	
	public void printDetails() {
		
		System.out.print("Name " + name);
		System.out.print("Address " + address);
		System.out.print("Phone " + phoneNumber);
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
