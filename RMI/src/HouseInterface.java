import java.rmi.*;

public interface HouseInterface extends Remote {

	public String getName() throws RemoteException;
	public String getAddress() throws RemoteException;
}
