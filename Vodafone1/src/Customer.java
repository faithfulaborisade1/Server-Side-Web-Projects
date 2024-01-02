public class Customer {
	
	private String name;
	public String address;
	public int phoneNumber;
	public int pay;
	
	
	public Customer(String name, String address, int phoneNumber,int pay) {
		
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.pay = pay;
	}
	
	public Customer(String name, String address, int phoneNumber) {
		
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}

	public Customer(String address,int phoneNumber, int pay) {
	
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.pay = pay;
	}

	public Customer(String name,int phoneNumber) {
		
		this.name = name;
		this.phoneNumber = phoneNumber;
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

	public int getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getPay() {
		return this.pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}
	
	public void printDetails() {
		
		System.out.println("Name" +name);
		System.out.println("Address" +address);
		System.out.println("Number" +phoneNumber);
		System.out.println("Pay" +pay);
	}

}
