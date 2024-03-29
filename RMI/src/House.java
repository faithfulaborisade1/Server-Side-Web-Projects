import java.rmi.*;
import java.rmi.server.*;


public class House extends UnicastRemoteObject implements HouseInterface {
	
	private String name;
	private String address;
	
	public House(String name,String address)  throws RemoteException{
		
		this.name = name;
		this.address  = address;
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
}
