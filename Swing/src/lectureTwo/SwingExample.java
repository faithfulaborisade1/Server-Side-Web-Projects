package lectureTwo;

import java.awt.Dimension;

import javax.swing.*;

public class SwingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create a window
		JFrame window = new JFrame("Helloe World");
		
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		JButton button = new JButton("I am a Button");
		
		button.setPreferredSize(new Dimension(150,28));
		
		//create label
		JLabel label = new JLabel("I am a Swing Label");
		
		panel.add(label);
		panel.add(button);
		
		
		
		//add label to window
		window.getContentPane().add(panel);
		//set window size to match preferred size
		window.pack();
		//set size
		window.setSize(300,250);
		window.setVisible(true);

	}

}
