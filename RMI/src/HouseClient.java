import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class HouseClient {
	
	public static void main(String[] args) {
		
		 
		
		try {
			Registry r = LocateRegistry.getRegistry("localhost",1234);
			HouseInterface h1 = (HouseInterface)r.lookup("bungaloHouse");
			System.out.println("Bungalo Owner: "+h1.getName());
			
			HouseInterface h2 = (HouseInterface)r.lookup("dormerHouse");
			System.out.println("Dormer Owner: "+h2.getName());
			
		}catch(Exception e) {
			System.out.println(" Issue with Client..........");
			
		}
	}
}
