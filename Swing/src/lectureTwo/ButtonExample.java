package lectureTwo;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ButtonExample implements ActionListener {

	JFrame window = new JFrame("Hello World");
	 
	 JPanel  panel = new JPanel();
	 JButton left = new JButton("Left Button");
	 JButton middle = new JButton("Middle Button");
	 JButton right = new JButton("Right Button");
	 JLabel label = new JLabel("Nothing pressed");
	 
	 public ButtonExample() {
		 
		 left.setPreferredSize(new Dimension(300,30));
		 middle.setPreferredSize(new Dimension(300,30));
		 right.setPreferredSize(new Dimension(300,30));
		 
		 left.addActionListener(this);
		 middle.addActionListener(this);
		 right.addActionListener(this);
		 
		 
		 panel.add(left);
		 panel.add(middle);
		 panel.add(right);
		 panel.add(label);
		 
		 
		 
		 window.getContentPane().add(panel);
		 
		 window.pack();
		 
		 window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
		 window.setVisible(true);
		 
	 }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource().equals(left)) {
			label.setText("Left Button Pressed");
		}
		if(e.getSource().equals(middle)) {
			label.setText("Middle Button Pressed");
		}
		if(e.getSource().equals(right)) {
			label.setText("Right Button Pressed");
		}
		
	}
	

}
