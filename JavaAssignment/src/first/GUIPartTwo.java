package first;

import java.awt.Color;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUIPartTwo extends JFrame implements ActionListener {
	
	JCheckBox check = new JCheckBox("give colors",false);
	 
	
	
	private JButton theButton1 = new JButton("       ");
	private JButton theButton2 = new JButton("       ");
	private JButton theButton3 = new JButton("       ");
 
	
	public GUIPartTwo() {
		
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
        
        
        check.addActionListener(this);
	 
		
		
		add(check);
	 
		 
		pack();
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GUIPartTwo();
	}
		

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource().equals(check)) {
			if(check.isSelected()) {
				 theButton1.setBackground(Color.green);
				 theButton2.setBackground(Color.blue);
				 theButton3.setBackground(Color.red);
			}else {
				theButton1.setBackground(Color.lightGray);
				 theButton2.setBackground(Color.lightGray);
				 theButton3.setBackground(Color.lightGray);
				
			}
		}
		
	}

}
