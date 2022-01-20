import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
class First extends JFrame{
    final private Font mainFont=new Font("Segoe print",Font.BOLD,18);
    JTextField tffirstName,tfLastName;
    JLabel lbWelcome;
    public void initialize(){
         JLabel lbFirstName=new JLabel("First Name");
         lbFirstName.setFont(mainFont);
         tffirstName=new JTextField();
         tffirstName.setFont(mainFont);
         JLabel lbLastName= new JLabel("Last Name");
         lbLastName.setFont(mainFont);

         JButton btnOK= new JButton("OK");
         btnOK.setFont(mainFont);
         btnOK.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                String firstName=tffirstName.getText();
                String lastName=tfLastName.getText();
                lbWelcome.setText("Hello"+firstName+""+lastName);
            }
             
         });
         JButton btnClear=new JButton("clear");
         btnClear.setFont(mainFont);
         btnClear.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                tffirstName.setText("");
                tfLastName.setText("");
                lbWelcome.setText("");
            }
             
         });
         JPanel buttonsPanel=new JPanel();
         buttonsPanel.setLayout(new GridLayout(1,2,5,5));
         buttonsPanel.setOpaque(false);
         buttonsPanel.add(btnOK);
         buttonsPanel.add(btnClear);

         tfLastName=new JTextField();
         tfLastName.setFont(mainFont);
         JPanel formPanel=new JPanel();
         formPanel.setLayout(new GridLayout(4,1,5,5));
         formPanel.setOpaque(false);
         formPanel.add(lbFirstName);
         formPanel.add(tffirstName);
         formPanel.add(lbLastName);
         formPanel.add(tfLastName);
         lbWelcome= new JLabel();
         lbWelcome.setFont(mainFont);

        JPanel mainPanel=new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(new Color(128,128,255));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10,10));
        mainPanel.add(formPanel,BorderLayout.NORTH);
        mainPanel.add(lbWelcome,BorderLayout.CENTER);
         mainPanel.add(buttonsPanel,BorderLayout.SOUTH);
         add(mainPanel);

        setTitle("Welcome");
        setSize(400,400);
        setMinimumSize(new Dimension(300,400));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[]args) {
        First myFrame=new First();
        myFrame.initialize();
    }
  

}