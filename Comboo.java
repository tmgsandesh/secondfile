import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class Comboo extends JFrame {
    JComboBox<String> cb;
    String[] list = { "Apple", "Banana", "Orange" };

    Comboo() {
        setLayout(new FlowLayout());
        cb = new JComboBox<String>(list);
        cb.addItemListener(
                new ItemListener() {
                    public void itemStateChanged(ItemEvent ev) {
                        if (ev.getStateChange() == ItemEvent.SELECTED) {
                            System.out.println(cb.getSelectedItem());
                        }
                    };

                });
        add(cb);
        setTitle("ComboBox");
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Comboo c = new Comboo();
    }
}
