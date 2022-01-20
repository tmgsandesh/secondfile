import javax.swing.*;
import javax.swing.JList;
import java.awt.FlowLayout;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

public class ListApp extends JFrame {
    ListApp() {
        setLayout(new FlowLayout());
        String[] list = { "Apple", "Mango", "Carrot", "Pineapple" };
        JList l = new JList(list);
        l.setVisibleRowCount(3);
        l.setSelectionModel(ListSelectionModel.SINGLE_SELECTION);
        l.addListSelectionListener(
                new ListSelectionListener() {
                    public void valueChanged(javax.swing.event.ListSelectionEvent e) {
                        if (e.getvalueIsAdjusting())
                            return;
                        System.out.println(l.getSelectedValue());

                    };
                });
        add(new JScrollPane(l));
        setTitle("ListApp");
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        ListApp la = new ListApp();
    }
}
