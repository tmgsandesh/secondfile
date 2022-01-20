import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class Combo extends JFrame {
    private JComboBox<String> cb;
    private String[] list = { "apple", "banana", "grapes" };

    Combo() {
        setTitle("ComboBox");
        setLayout(new FlowLayout());
        cb = new JComboBox<String>(list);
        cb.addItemListener(
                new ItemListener() {
                    public void itemStateChanged(ItemEvent ev) {
                        if (ev.getStateChange() == ItemEvent.SELECTED) {
                            System.out.println(cb.getSelectedItem());
                        }
                    }
                });
        add(cb);
        setVisible(true);
        setSize(600, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        Combo c = new Combo();

    }
}