
public class PartTimeEmployee extends Employee {
	private double hourlyRate;
	
	public PartTimeEmployee(double hourlyRate) {
		
		this.hourlyRate = hourlyRate;
	}
	
	public double getHourlyRate() {
		
		System.out.println("this is a part time employee...");
		
		return hourlyRate;
	}
}
