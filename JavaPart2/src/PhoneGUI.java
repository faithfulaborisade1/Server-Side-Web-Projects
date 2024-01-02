import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class PhoneGUI {
    private JFrame frame;
    private JTextArea textArea;

    public PhoneGUI() {
        frame = new JFrame("Phone List");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        textArea = new JTextArea(10, 30);
        textArea.setEditable(false); // Make the text area read-only

        JScrollPane scrollPane = new JScrollPane(textArea);
        frame.add(scrollPane, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        JButton showButton = new JButton("Show Phones");
        JButton clearButton = new JButton("Clear");
        buttonPanel.add(showButton);
        buttonPanel.add(clearButton);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        // Create an array of Phone objects
        Phone sonyXperiaX = new Phone("Sony", "Experia X", 32, 12.5, 4.6, "Yes", 150);
        Phone sonyExperiaZ = new Phone("Sony", "Experia Z", 64, 14.2, 5.6, "Yes", 175);
        Phone samsungGal = new Phone("Samsung", "Galaxy M", 64, 14.5, 5.4, "Yes", 180);
        Phone nokia3330 = new Phone("Nokia", "3330", 16, 13.2, 2.3, "No", 90);
        Phone motorolaM1 = new Phone("Motorola", "M1", 8, 11.3, 4.9, "Yes", 100);
        Phone iPhone6 = new Phone("IPhone", "6", 32, 13.5, 6.4, "Yes", 250);
        Phone alcatelA3 = new Phone("Alcatel", "A3", 8, 9.3, 2.4, "No", 50);
        
        Phone[] phones = {sonyXperiaX, sonyExperiaZ, samsungGal, nokia3330, motorolaM1, iPhone6, alcatelA3};

        showButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Display the phones in the text area
                textArea.setText(""); // Clear the text area first
                for (Phone phone : phones) {
                    textArea.append(phone.toString() + "\n");
                }
            }
        });

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Clear the text area
                textArea.setText("");
            }
        });

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // Create the GUI on the event dispatch thread
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new PhoneGUI();
            }
        });
    }
}
