import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Registration extends JFrame {
    JLabel label1, label2, label3, label4, label5;
    JTextField t1, t2;
    JRadioButton male, female;
    JComboBox day, month, year;
    JTextArea ta1;
    JCheckBox terms;
    JButton submit;
    JLabel msg;

    Registration() {
        label1 = new JLabel("Name");
        label1.setBounds(20, 50, 80, 20);
        add(label1);
        t1 = new JTextField();
        add(t1);
        t1.setBounds(110, 50, 100, 20);

        setTitle("Registration Form");
        setSize(600, 600);
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Registration r1 = new Registration();
    }
}