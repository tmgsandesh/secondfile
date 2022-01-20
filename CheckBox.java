import javax.swing.JCheckBox;
import javax.swing.JFrame;
import java.awt.FlowLayout;
public class CheckBox extends JFrame {
    void MyFrame() {
        setSize(800, 600);
        setTitle("Demo");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        setLayout(new FlowLayout());
        JCheckBox checkbox = new JCheckBox("Notify The User");
        add(checkbox);
        // checkbox.setText("Notify The User");
        pack();// resize frame
    }

    public static void main(String[] args) {
        CheckBox ch1 = new CheckBox();
    }
}
