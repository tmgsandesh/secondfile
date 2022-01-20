import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.*;

import java.awt.Image;

public class MyApp extends JFrame {
    MyApp() {
        setTitle("Advance Java");
        ImageIcon img = new ImageIcon("new.png");
        Image image = img.getImage().getScaledInstance(300, 200, Image.SCALE_DEFAULT);
        ImageIcon img2 = new ImageIcon(image);
        JLabel label = new JLabel("Logo", img2, JLabel.LEFT);
        JTextField tf1 = new JTextField();
        setLayout(new FlowLayout());
        getContentPane().add(tf1);
        add(label);
        setVisible(true);
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        MyApp app = new MyApp();
    }

}

// 9825352464
/*
 * jlabel()
 * jlabel(string)
 * jlabel(string,alignmuent)
 * jlabel(image icon)
 * jlabel(imageicon,alignment)
 * jlabel(string,imageicon,alignment)
 */