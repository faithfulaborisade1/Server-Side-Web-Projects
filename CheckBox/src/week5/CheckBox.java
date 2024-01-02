package week5;

import java.awt.Color;
import java.awt.event.*;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CheckBox implements ActionListener {
	
	JCheckBox c = new JCheckBox("one",true);
	JCheckBox c1 = new JCheckBox("two",false);
	
	JFrame w = new JFrame("hi");
	JPanel p = new JPanel();
	
	public CheckBox() {
		c.addActionListener(this);
		c1.addActionListener(this);
		
		
		p.add(c);
		p.add(c1);
		w.getContentPane().add(p);
		w.pack();
		w.setVisible(true);
	}
	
	public static void main(String [] args) {
		new CheckBox();
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource().equals(c)) {
			if(c.isSelected()) {
				c1.setSelected(false);
			}else {
				p.setBackground(Color.green);
			}
		}
		
		if(e.getSource().equals(c1)) {
			if(c1.isSelected()) {
				c.setSelected(false);
			}else {
				p.setBackground(Color.yellow);
			}
		}
		
	}
	

}
