package Lab9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClickCounter implements ActionListener
{
    // Initialize the counter
    private int i = 0;

    // label to display the counter value
    private JLabel label;

    // Increment button
    private JButton plus;

    // Decrement button
    private JButton moins;

    public JPanel getPanel() {
        // Create the panel
        JPanel panel = new JPanel();

        // Add increment button to JPanel
        plus = new JButton("+");
        plus.addActionListener(this);
        panel.add(plus);

        // Add decrement button to JPanel
        moins = new JButton("-");
        moins.addActionListener(this);
        panel.add(moins);

        // Add the counter to JPanel
        label = new JLabel("" + i);
        panel.add(label);

        return panel;
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == plus) {
            i++;
            label.setText("" + i);
        }
        else {
            i--;
            label.setText("" + i);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Click Counter");
        frame.setSize(new Dimension(250, 80));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create the panel
        ClickCounter counter = new ClickCounter();
        JPanel counterPanel = counter.getPanel();

        // Add the panel to the center of the window
        Container content = frame.getContentPane();
        content.add(counterPanel, BorderLayout.CENTER);

        // Show the window
        frame.setVisible(true);
    }
}
