import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;


public interface MovieListInterface  extends Remote{
	
	
	public ArrayList<MovieInterface> getList() throws RemoteException;
	public void addToList(MovieInterface a) throws RemoteException;
	public void addMovie(MovieInterface a) throws RemoteException;
	public void deleteMovie(String d) throws RemoteException;
	public void updateMovie(String u, MovieInterface updatedMovie) throws RemoteException;
//	public void updateMovieList(ArrayList<MovieInterface> s) throws RemoteException;

}
