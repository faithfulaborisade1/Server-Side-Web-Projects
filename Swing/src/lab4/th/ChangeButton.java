package lab4.th;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ChangeButton  implements ActionListener{
	
	JFrame window = new JFrame("Hello World");
	 
	 JPanel  panel = new JPanel();
	 JButton red = new JButton("Red");
	 JButton green = new JButton("Green");
	 JButton blue = new JButton("Blue");
	  
	 
	 public ChangeButton() {
		 
		 red.setPreferredSize(new Dimension(300,30));
		 green.setPreferredSize(new Dimension(300,30));
		 blue.setPreferredSize(new Dimension(300,30));
		 
		 red.addActionListener(this);
		 green.addActionListener(this);
		 blue.addActionListener(this);
		 
		 
		 panel.add(red);
		 panel.add(green);
		 panel.add(blue);
		 
		 
		  
		 
		 
		 
		 window.getContentPane().add(panel);
		 
		 window.pack();
		 
		 window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
		 window.setVisible(true);

}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource().equals(red)) {
			red.setBackground(Color.RED);
		}
		 
		if(e.getSource().equals(green)) {
			green.setBackground(Color.GREEN);
		}
			 
		
		if(e.getSource().equals(blue)) {
			blue.setBackground(Color.BLUE);
			 
		}
		
	}
}
