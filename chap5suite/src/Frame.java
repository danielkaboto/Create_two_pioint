

import java.awt.event.ActionListener;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Frame extends JFrame implements ActionListener
{
    JLabel l1 = new JLabel("Enter name :: ");
    JLabel l2 = new JLabel("Enter surname :: ");
    JLabel l3= new JLabel ("Enter age :: ");

    JTextField t1 = new JTextField(25);
    JTextField t2 = new JTextField(25);
    JTextField t3 = new JTextField(25);

    JButton b1 = new JButton("Submit");
    JButton b2 = new JButton("Clear");


    Frame(String title)
    {
        setTitle(title);
        setSize(450,160);
        setLayout(new FlowLayout ());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(b1);
        add(b2);

       // b1.addActionListener(this);
        b2.addActionListener(this);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource()== b1)
        {
            String name, surname;
            int age;
            name =t1.getText();
            surname = t2.getText();
            try
            {
            age = Integer.parseInt(t3.getText());
            int currentYear = Calendar.getInstance().get(Calendar.YEAR);
            int birthday = currentYear -age;
            JOptionPane.showMessageDialog(null,"Hey"+name+" "+ surname +"Its seems your are born in"+birthday);
            }
            catch(Exception ex)
            {
                t3.setText(" ");
                JOptionPane.showMessageDialog(null, "PLease enter a number in the age box ","error",JOptionPane.ERROR_MESSAGE);
            }
        } 
        else if(e.getSource () == b2)
        {
            t1.setText(" ");
            t2.setText(" ");
            t3.setText(" ");
            t1.requestFocus();
            
        }

    }

    
}
