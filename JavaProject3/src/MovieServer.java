import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.rmi.*;
import java.rmi.registry.*;

public class MovieServer {

    public static void main(String args[]) {
        System.out.println("Server has started");

        MovieList movieList = null;
        try {
            // Deserialize if the file exists
            File file = new File("movie.ser");
            if (file.exists()) {
                System.out.println("Deserializing movie list...");
                FileInputStream fileIn = new FileInputStream(file);
                ObjectInputStream objectIn = new ObjectInputStream(fileIn);
                movieList = (MovieList) objectIn.readObject();
                objectIn.close();
                fileIn.close();
            } else {
                System.out.println("Creating new movie list...");
                movieList =  createAndSerializeNewList();
            }

            // Create RMI registry and bind the movie list
            Registry registry = LocateRegistry.createRegistry(2070);
            registry.bind("movieList", movieList);
            System.out.println("Movie list bound to registry");

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IO Exception: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + e.getMessage());
        } catch (AlreadyBoundException e) {
            System.out.println("Already bound: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("General exception: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static MovieList createAndSerializeNewList() throws RemoteException {
        try {
            MovieList ml = new MovieList();
            ml.addMovie(new Movies("Naruto", "Anime", "Sarutobu","2007"));
            ml.addMovie(new Movies("John Wick", "Action", "Don vil","2012"));
            System.out.println("New Movies list created and populated");

            FileOutputStream fileOut = new FileOutputStream("movie.ser");
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(ml);
            objectOut.close();
            fileOut.close();

            System.out.println("New Movie list serialized");
            return ml;

        } catch (IOException e) {
            System.out.println("Error creating new list: " + e.getMessage());
            return null;
        }
    }
}
