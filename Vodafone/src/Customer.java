public class Customer {
	
	private String name;
	public String address;
	public int phoneNumber;
	public int pay;
	
	
	public Customer() {
		
		this.name = null;
		this.address = null;
		this.phoneNumber = 0;
		this.pay = 0;
	}
	
	public Customer(String name, String address,String phoneNumber) {
		
		this.name = null;
		this.address = null;
		this.phoneNumber = 0;
	}

	public Customer(String address,String phoneNumber) {
	
		this.name = null;
		this.address = null;
		this.phoneNumber = 0;
		this.pay = 0;
	}

	public Customer(String phoneNumber) {
		
		this.name = null;
		this.address = null;
		this.phoneNumber = 0;
		this.pay = 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
