import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.rmi.RemoteException;
import java.util.ArrayList;


 

public class MovieController {
	
	private MovieListInterface movieS;

	public MovieController(MovieListInterface movieS) {
		this.movieS = movieS;

	}


	public void addMovie(String name, String genre, String director, String releaseDate) {
		MovieInterface newMovie;
	 
		try {
			newMovie = new Movies(name, genre, director,releaseDate);
			movieS.addMovie(newMovie);
		 
			MovieList newListObject = new MovieList();
			newListObject.attemptAtChange(movieS.getList());
			serializeData(newListObject);


		} catch (RemoteException e) {
			System.out.println("Remote exception in addMovie method");
			e.printStackTrace();
		}

	}
	
	public void updateMovie(String name, String genre, String director, String releaseDate) {
		Movies updatedMovie;

		try {
			updatedMovie = new Movies(name, genre, director,releaseDate);
			movieS.updateMovie(name, (MovieInterface)updatedMovie);
			//serializeData();
		}catch(RemoteException e1) {
			e1.printStackTrace();
		}
	}
	
	public void deleteMovie(String name) {
		try {
			movieS.deleteMovie(name);
			//serializeData();
		}catch(RemoteException e2) {
			e2.printStackTrace();
		}
	}


	public ArrayList<MovieInterface> showMovieDetails() throws RemoteException{

		ArrayList<MovieInterface> m = movieS.getList();

		return m;
	}




	private void serializeData(MovieListInterface movieList) {
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

}
