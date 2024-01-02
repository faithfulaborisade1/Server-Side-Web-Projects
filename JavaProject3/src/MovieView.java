import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;

public class MovieView extends JFrame implements ActionListener {
    
    JTextArea movieDetails;
    JTextField name;
    JTextField genre;
    JTextField director;
    JTextField releaseDate;
    JButton showDetails;
    JButton addMovie;
    JButton updateMovie;
    JButton deleteMovie;
    JLabel nameLabel;
    JLabel genreLabel;
    JLabel directorLabel;
    JLabel releaseLabel;

    MovieController controller;
    
    public MovieView(MovieController controller) throws Exception {
        this.controller = controller;
        
        name = new JTextField(20);
        genre = new JTextField(20);
        director = new JTextField(20);
        releaseDate = new JTextField(20);
        showDetails = new JButton("Show Details");
        addMovie = new JButton("Add");
        updateMovie = new JButton("Update");
        deleteMovie = new JButton("Delete");

        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        add(createInputPanel("Name:", name));
        add(createInputPanel("Genre:", genre));
        add(createInputPanel("Director:", director));
        add(createInputPanel("Release Date:", releaseDate));
        add(createButtonPanel());

        movieDetails = new JTextArea(10, 25);
        movieDetails.setEditable(false);
        add(new JScrollPane(movieDetails));

        setTitle("Movie Information");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private JPanel createInputPanel(String labelText, JTextField textField) {
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.LEFT));
        panel.add(new JLabel(labelText));
        panel.add(textField);
        return panel;
    }

    private JPanel createButtonPanel() {
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.add(showDetails);
        buttonPanel.add(addMovie);
        buttonPanel.add(updateMovie);
        buttonPanel.add(deleteMovie);

        showDetails.addActionListener(this);
        addMovie.addActionListener(this);
        updateMovie.addActionListener(this);
        deleteMovie.addActionListener(this);

        return buttonPanel;
    }

    @Override
    public void actionPerformed(ActionEvent e){
		if(e.getSource().equals(addMovie)) {
			String newName = name.getText();
			String newGenre = genre.getText();
			String newDirector = director.getText();
			String newRelease = releaseDate.getText();
			 
			System.out.println("about to add Movie");
		
			controller.addMovie(newName, newGenre, newDirector,newRelease);
			
		}
		else if(e.getSource().equals(updateMovie)) {
			String inputN = name.getText();
			String inputG = genre.getText();
			String inputD = director.getText();
			String inputR = releaseDate.getText();
	 
			controller.updateMovie(inputN, inputG, inputD,inputR);
		}
		else if(e.getSource().equals(deleteMovie)) {
			String deleteN = name.getText();
			controller.deleteMovie(deleteN);
		}
		else {
			try {
				ArrayList<MovieInterface> movieList = controller.showMovieDetails();
				String st = "";
				for (MovieInterface movie: movieList) {
					st+=("Name: " + movie.getName() + " || " + "Genre: " + movie.getGenre() + " || " + "Director: " + movie.getDirector() + " || " + "ReleaseDate: " + movie.getReleaseDate() + "\n");
				}
				movieDetails.setText(st);
				
		
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
	}

    public static void main(String args[]) {
        // RMI client setup and starting the GUI
        // Example code - needs to be filled with actual logic
        try {
            Registry registry = LocateRegistry.getRegistry(2070);
            MovieListInterface movieListService = (MovieListInterface) registry.lookup("movieList");
            MovieController controller = new MovieController(movieListService);
            new MovieView(controller);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
