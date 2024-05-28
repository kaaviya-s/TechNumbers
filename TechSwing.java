import javax.swing.*;

import java.awt.Color;
import java.awt.event.*;

class Tech implements ActionListener {
    JFrame frame;
    JTextField tf1;
    JTextField tf2;
    JButton b;

    Tech() {
        frame = new JFrame("Tech Numbers..!");
        tf1 = new JTextField();
        tf2 = new JTextField();

        b = new JButton("RESULT");

        JLabel l = new JLabel("Enter Number:");
        l.setBounds(30, 30, 100, 30);
        tf1.setBounds(130, 30, 100, 30);
        tf2.setBounds(70, 70, 150, 30);
        b.setBounds(90, 150, 100, 30);

        b.addActionListener(this);
        b.setBackground(Color.GREEN);

        frame.add(tf1);
        frame.add(tf2);
        frame.add(b);
        frame.add(l);
        frame.setSize(800, 600);
        frame.setLayout(null);
        frame.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        String a = tf1.getText();
        int num = Integer.parseInt(a);
        int temp = num;
        int count = 0;

        while (temp > 0) {
            count++;
            temp = temp / 10;
        }
        if (count % 2 == 0) {
            int firsthalf = num / (int) Math.pow(10, count / 2);
            int sechalf = num % (int) Math.pow(10, count / 2);
            int res = (firsthalf + sechalf) * (firsthalf + sechalf);

            if (res == num) {
                tf2.setText("It is a Tech Number..!");
            } else {
                tf2.setText("Not a Tech Number..!");
            }
        } else {
            tf2.setText("Not a Tech Number..!");
        }
    }

}

public class TechSwing {
    public static void main(String args[]) {
        Tech obj = new Tech();
    }
}
