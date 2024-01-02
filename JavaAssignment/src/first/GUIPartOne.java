package first;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

 

public class GUIPartOne extends JFrame{
	
	private JButton theButton1 = new JButton("   b1    ");
	private JButton theButton2 = new JButton("    b2   ");
	private JButton theButton3 = new JButton("   b3    ");
	
	
	
 
	
	public GUIPartOne() {
		super();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	 	
        GridBagLayout gridbag = new GridBagLayout();
        GridBagConstraints c = new GridBagConstraints();
        getContentPane().setLayout(gridbag);
        c.fill = GridBagConstraints.HORIZONTAL;

        c.gridx = 0;
        c.gridy = 0;
        c.gridheight = 1; 
        gridbag.setConstraints(theButton1, c);
        getContentPane().add(theButton1);

        c.gridx = 1;
        c.gridy = 1;
        c.gridheight = 2;  
        gridbag.setConstraints(theButton2, c);
        getContentPane().add(theButton2);

        c.gridx = 3;
        c.gridy = 0;
        c.gridheight = 1; 
        gridbag.setConstraints(theButton3, c);
        getContentPane().add(theButton3);



        setVisible(true);
        pack();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GUIPartOne();
		
	
 
	}

}
