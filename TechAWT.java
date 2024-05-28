import java.awt.*;
import java.awt.event.*;

class Tocheck implements ActionListener {
    Frame f;
    TextField tf1;
    TextField tf2;
    Button b1;

    Tocheck() {
        f = new Frame("Finding Tech Numbers");
        tf1 = new TextField();
        tf2 = new TextField();
        b1 = new Button("Check!");

        Label l1 = new Label("Enter a number: ");

        l1.setBounds(20, 30, 100, 30);
        b1.setBackground(Color.GREEN);
        tf1.setBounds(150, 30, 100, 30);
        tf2.setBounds(80, 100, 150, 30);
        b1.setBounds(100, 150, 60, 30);

        b1.addActionListener(this);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }

            public void windowClosed(WindowEvent e) {
                System.out.println("Window closed..!");
            }
        });

        f.add(l1);
        f.add(tf1);
        f.add(tf2);
        f.add(b1);

        tf2.setEditable(false);
        f.setSize(800, 500);
        f.setLayout(null);
        f.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        String str = tf1.getText();
        int num = Integer.parseInt(str);
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

public class TechAWT {
    public static void main(String[] args) {
        Tocheck obj = new Tocheck();
    }
}