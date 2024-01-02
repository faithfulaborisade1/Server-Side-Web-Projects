import java.rmi.*;

public interface MovieInterface extends Remote {
	
	public String getName() throws RemoteException;
	public String getGenre() throws RemoteException;
	public String getDirector() throws RemoteException;
	public String getReleaseDate() throws RemoteException;
 
}
