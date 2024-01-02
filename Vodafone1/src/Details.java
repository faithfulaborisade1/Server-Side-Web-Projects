
public class Details {

	public static void main(String[] args) {
		
		 
		
		Customer c1 = new Customer("Kenny"," Willow", 87652432,1);
		Customer c2 = new Customer("James"," athlone", 87123456);
		Customer c3 = new Customer("Dublin", 897652445, 1);
		Customer c4 = new Customer("Kate", 871234455);
		// TODO Auto-generated method stub
		
		c1.printDetails();
		c2.printDetails();
		
		System.out.println("Pay: " +c3.getPay());
		System.out.println("Phone Number: "+ c3.getPhoneNumber());
		
		System.out.println("Customer name: "+ c4.getName());
		System.out.println("Phone Number: "+ c4.getPhoneNumber());
	}

}
