package week5;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GridBagLayoutExample extends JFrame {
    private JButton theButton1 = new JButton("Button 1");
    private JButton theButton2 = new JButton("2");
    private JButton theButton3 = new JButton("Button 3");
    private JButton theButton4 = new JButton("Long-Named Button 4");
    private JButton theButton5 = new JButton("Button 5");

    public GridBagLayoutExample() {
        super();
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
        c.gridy = 0;
        c.gridheight = 2;  
        gridbag.setConstraints(theButton2, c);
        getContentPane().add(theButton2);

        c.gridx = 2;
        c.gridy = 1;
        c.gridheight = 1; 
        gridbag.setConstraints(theButton3, c);
        getContentPane().add(theButton3);

//        c.gridx = 1;
//        c.gridy = 1;
//        c.gridheight = 1;  
//        gridbag.setConstraints(theButton4, c);
//        getContentPane().add(theButton4);

        c.gridx = 0;
        c.gridy = 2;
        c.gridheight = 1; 
        gridbag.setConstraints(theButton5, c);
        getContentPane().add(theButton5);

        setVisible(true);
        pack();
    }

    public static void main(String[] args) {
        new GridBagLayoutExample();
    }
}
