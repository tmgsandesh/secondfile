import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.*;
import java.awt.event.*;

public class RegistrationForm extends JFrame implements ActionListener {
    JTextField t1, t2;
    JCheckBox ck4;
    JLabel lb6;
    JButton btn2;
    JComboBox jc1, jc2, jc3;
    JTextArea ta1, ta2;

    RegistrationForm() {
        JLabel lbl1 = new JLabel("Name");
        add(lbl1);
        lbl1.setBounds(20, 20, 100, 20);
        JTextField t1 = new JTextField();
        add(t1);
        t1.setBounds(130, 20, 100, 20);
        JLabel lbl2 = new JLabel("Mobile");
        add(lbl2);
        lbl2.setBounds(20, 60, 100, 20);
        JTextField t2 = new JTextField();
        add(t2);
        t2.setBounds(130, 60, 100, 20);
        JLabel lbl3 = new JLabel("Gender");
        add(lbl3);
        lbl3.setBounds(20, 100, 100, 20);
        setLayout(null);
        JRadioButton btn1 = new JRadioButton("male");
        add(btn1);
        btn1.setBounds(80, 100, 80, 20);
        JRadioButton btn2 = new JRadioButton("Female");
        add(btn2);
        btn2.setBounds(170, 100, 80, 20);
        ButtonGroup bg = new ButtonGroup();
        btn1.setSelected(true);
        bg.add(btn1);
        bg.add(btn2);
        JLabel lbl4 = new JLabel("DOB");
        add(lbl4);
        lbl4.setBounds(20, 140, 80, 20);
        String days[] = { "1", "2", "3", "4", "5" };
        String months[] = { "Baishakh", "Jestha", "Ashar" };
        String year[] = { "2076", "2077" };
        JComboBox jc1 = new JComboBox(days);
        jc1.setBounds(120, 140, 80, 20);
        add(jc1);
        JComboBox jc2 = new JComboBox(months);
        jc2.setBounds(220, 140, 80, 20);
        add(jc2);
        JComboBox jc3 = new JComboBox(year);
        jc3.setBounds(320, 140, 80, 20);
        add(jc3);

        JLabel lb5 = new JLabel("Address");
        add(lb5);
        lb5.setBounds(20, 180, 100, 20);
        JTextArea ta1 = new JTextArea();
        add(ta1);
        ta1.setBounds(120, 170, 200, 50);

        JCheckBox ck4 = new JCheckBox("Please accept terms and conditions");
        add(ck4);
        ck4.setSelected(true);
        ck4.setBounds(50, 230, 260, 20);
        JButton btn = new JButton("Submit");
        add(btn);
        btn.setBounds(70, 260, 100, 20);
        btn.addActionListener(this);
        JTextArea ta2 = new JTextArea();
        add(ta2);
        ta2.setBounds(450, 50, 300, 300);
        JLabel lb6 = new JLabel();
        add(lb6);
        lb6.setBounds(20, 400, 250, 20);
        setTitle("RegistrationForm");
        setSize(800, 700);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ck4.isSelected()) {
            lb6.setText("Registration Successful");
            String name = t1.getText();
            String mobile = t2.getText();
            String gender = "male";
            if (btn2.isSelected()) {
                gender = "female";
            }
            String dob = jc1.getSelectedItem() + "-" + jc2.getSelectedItem() + "-" + jc3.getSelectedItem();
            String address = ta1.getText();
            ta2.setText("Name:" + name + "\n" + "Mobile:" + mobile + "\n" + "Gender:" + gender + "\n" + "DOB:" + dob
                    + "\n" + "Address:" + address);
        } else {
            ta1.setText("Accept terms and conditions to submit");
            ta2.setText("");
        }
    }

    public static void main(String[] args) {
        RegistrationForm r1 = new RegistrationForm();
    }

}
