import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderTest extends JFrame {
    BorderTest() {
        setLayout(new BorderLayout());
        JButton b1 = new JButton("b1");
        add(b1, BorderLayout.CENTER);
        JButton b2 = new JButton("b2");
        add(b2, BorderLayout.NORTH);
        JButton b3 = new JButton("b3");
        add(b3, BorderLayout.SOUTH);
        JButton b4 = new JButton("b4");
        add(b4, BorderLayout.EAST);
        JButton b5 = new JButton("b5");
        add(b5, BorderLayout.WEST);

        setVisible(true);
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        BorderTest b1 = new BorderTest();

    }

}
