import java.rmi.registry.*;

public class HouseServer {
	
	public static void main(String[] args) {
		
		System.out.println("Server ahs started");
		try {
			House dormer = new House("burkes","athlone");
			House bungalo = new House("falys","dublin");
			Registry r = LocateRegistry.getRegistry("localhost",1234);
			r.bind("dormerHouse", dormer);
			r.bind("bungaloHouse", bungalo);
			
		}catch(Exception e) {
			System.out.println("Issue with server");
		}
	}

}
