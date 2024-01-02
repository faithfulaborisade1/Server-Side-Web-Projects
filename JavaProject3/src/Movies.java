import java.io.Serializable;
import java.rmi.*;
import java.rmi.server.*;

public class Movies extends UnicastRemoteObject implements MovieInterface, Serializable{
	
	private String name;
	private String genre;
	private String director;
	private String releaseDate;
	
	
	public Movies(String name,String genre,String director,String releaseDate) throws RemoteException {
		
		this.name = name;
		this.genre = genre;
		this.director = director;
		this.releaseDate = releaseDate;
	}
	
	
	public String getName()throws RemoteException {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getGenre() throws RemoteException{
		return this.genre;
	}
	
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public String getDirector()throws RemoteException {
		return this.director;
	}
	
	public void setDirector(String director) {
		this.director = director;
	}
	
	public String getReleaseDate() throws RemoteException{
		return this.releaseDate;
	}
	
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	

}
