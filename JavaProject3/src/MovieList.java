import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

 

public class MovieList extends UnicastRemoteObject implements MovieListInterface {

	private ArrayList<MovieInterface> movieList;
	
	public MovieList() throws RemoteException{
		this.movieList = new ArrayList<>();
	}
	public void attemptAtChange(ArrayList<MovieInterface> m) {
		movieList = m;
	}
	public ArrayList<MovieInterface> getList() throws RemoteException {
		
		return new ArrayList<>(movieList);
	}

	public void addMovie(MovieInterface m) throws RemoteException {
		System.out.println("in list object ABOUT TO ADD Movie");
		movieList.add(m);
		
		for (MovieInterface movie: movieList) {
			System.out.println("Name: " + movie.getName() + " || " + "Genre: " + movie.getGenre() + " || " + "Director: " + movie.getDirector() + " || " + "ReleaseDate: " + movie.getReleaseDate() + "\n");
		}
		serializeData();
	}
	
	
	public void deleteMovie(String name) throws RemoteException{
		MovieInterface movieRemove = null;
		for (MovieInterface movie : movieList) {
			if(movie.getName().equals(name)) {
				movieRemove = movie;
				break;
			}
		}
		if(movieRemove != null) {
			movieList.remove(movieRemove);
		}
		serializeData();
	}
	
	public void updateMovie(String name, MovieInterface updatedMovie) throws RemoteException{
		for(int i = 0; i < movieList.size(); i++) {
			if(movieList.get(i).getName().equals(name)) {
				movieList.set(i, updatedMovie);
				break;
			}
		}
		serializeData();
	}
	
	private void serializeData() {
		try {
			System.out.println("are we in the serialize method");
			FileOutputStream fileOut = new FileOutputStream("movie.ser");  
			ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);  
			objectOut.writeObject(movieList);  
			System.out.println("serialise in method try done");
			objectOut.close(); 

			fileOut.close(); 
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	@Override
	public void addToList(MovieInterface a) throws RemoteException {
		// TODO Auto-generated method stub
		
	}
 
}
