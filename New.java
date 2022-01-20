import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

import javafx.scene.image.Image;

import java.awt.FlowLayout;

public class New extends JFrame {
    New() {
        setTitle("New  Java Page");
        JLabel l1 = new JLabel("This is about page");
        add(l1);
        JCheckBox c1 = new JCheckBox();
        add(c1);
        JRadioButton r1 = new JRadioButton("Computer");
        add(r1);
        JRadioButton r2 = new JRadioButton("Science");
        add(r2);
        JRadioButton r3 = new JRadioButton("Math");
        add(r3);
        ImageIcon img=new ImageIcon("new.png");
        Image image=img.getImage().getScaledInstance(Image.SCALE_DEFAULT);
        ImageIcon img2= new ImageIcon(image);

        setLayout(new FlowLayout());
        l1.setAlignmentX(TOP_ALIGNMENT);
        setVisible(true);
        setSize(400, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        New c1 = new New();

    }
}
