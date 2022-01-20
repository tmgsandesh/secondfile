import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import java.awt.FlowLayout;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;

public class ListComponent extends JFrame {
    String[] list = { "Apple", "Banana", "Orange" };

    ListComponent() {
        JList<String> l = new JList<String>(list);
        l.setVisibleRowCount(2);
        JList<String> l1 = new JList<String>(list);
        l.setVisibleRowCount(2);
        l.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        l.addListSelectionListener(
                new ListSelectionListener() {
                    public void ValueChanged(ListSelectionEvent e) {
                        if (e.getValueIsAdjusting())
                            return;
                        // System.out.println(l.getSelectedValuesList());
                        l1.setListData(l.getSelectedValuesList().toArray());
                    };
                });
        add(new JScrollPane(l));
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        ListComponent l1 = new ListComponent();

    }
}
