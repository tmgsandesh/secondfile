import java.awt.*;
import javax.swing.*;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CheckBoox extends JFrame {
    CheckBoox() {
        JCheckBox ck1 = new JCheckBox();
        add(ck1);
        JCheckBox ck2 = new JCheckBox("Tick Me");
        add(ck2);
        JCheckBox ck3 = new JCheckBox("Tick Me", true);
        add(ck3);
        ImageIcon img = new ImageIcon("new.png");
        Image image = img.getImage().getScaledInstance(300, 200, Image.SCALE_DEFAULT);
        ImageIcon img2 = new ImageIcon(image);
        JCheckBox ck4 = new JCheckBox(img2, true);
        add(ck4);
        JButton btn = new JButton("Click");
        btn.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent ae) {
                        System.out.println(ck3.isSelected());
                    }
                });
        add(btn);
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        CheckBoox c = new CheckBoox();

    }

}
