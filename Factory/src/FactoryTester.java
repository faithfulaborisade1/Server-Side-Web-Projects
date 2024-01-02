
public class FactoryTester {

	public static void main(String[] args) {
		
		Employee employee = EmployeeFactory.getEmployee(30, 25.0);
		System.out.println(employee.getHourlyRate());
		
		employee = EmployeeFactory.getEmployee(40, 15.45);
		System.out.println(employee.getHourlyRate());
		// TODO Auto-generated method stub

	}

}
