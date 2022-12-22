import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;


public class Myform
{
    JButton b5;
    Myform()
    {
    setTitle(title);
    setSize(450,160);
    setLayout(GrayFilter);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new BorderLayout(10,10))
    JButton b1 = new JButton("North");
    JButton b2 = new JButton("South");
    JButton b3 = new JButton("East");
    JButton b4 = new JButton("West");
    b5 = new JButton("Center");
    b5.addAction
    }    
}

public void actionPerformed( ActionPerformed e)
{ 
    if(e.getSource()== b5)
        JOptionPane.showMessageDialog(null, "You clicked on the Center button");



}
