package week6;

public class Person {
	
	private String name;
	private String address;
	private int number;
	
	
	public Person(String name, String address,int number) {
		
		this.name = name;
		this.address = address;
		this.number = number;
	}


	public String getName() {
		return this.name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return this.address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public int getNumber() {
		return this.number;
	}


	public void setNumber(int number) {
		this.number = number;
	}


	public void printDetails() {
		// TODO Auto-generated method stub
		System.out.println("Name: " +name+ " Address: " +address+ " Phone Number: " +number);
		
	}
	

}
