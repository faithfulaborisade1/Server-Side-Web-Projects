import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;

 
public class MovieClient {
	
	public static void main(String args[]) {
		System.out.println("Client has started");
		
		try {
			Registry reg2 = LocateRegistry.getRegistry("localhost", 2070);
			System.out.println("in the try, registry has been located");
			MovieListInterface movieListObjRetrived = (MovieListInterface)reg2.lookup("movieList");
			System.out.println("the object has been retrieved");
			ArrayList<MovieInterface> listRetrieved = movieListObjRetrived.getList();
			
			System.out.println("we have the list...........");
			for(MovieInterface si : listRetrieved) {
				System.out.println("Name: " + si.getName() + " || " + "Genre: " + si.getGenre() + " || " + "Director: " + si.getDirector() + " || " + "ReleaseDate: " + si.getReleaseDate() + "\n");
			}
			
		}catch(Exception e) {
			System.out.println("Problem with client");
			e.printStackTrace();
		}
	}

}
