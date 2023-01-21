import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    public static void main(String[] args) throws Exception 
    {

        JFrame f1 = new JFrame("MyForm");
        f1.setLayout(new FlowLayout());
        f1.setLocationRelativeTo(null);
        f1.setSize(460,200);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        

        JLabel l1 = new JLabel("Enter the first number :: ");
        l1.setBounds(20,20,175,10);
        f1.add(l1);

        JTextField t1 = new JTextField(10);
        t1.setBounds(250, 17,150, 20);
        f1.add(t1);

        JLabel l2 = new JLabel("Enter the second number :: ");
        l2.setBounds(20,50,200,10);
        f1.add(l2);

        JTextField t2 = new JTextField(10);
        t2.setBounds(250, 47,150, 20);
        f1.add(t2);

        JButton b1 = new JButton("+");
        b1.setBounds(20,80,50,30);
        b1.setBackground(Color.yellow);
        b1.setForeground(Color. red);
        f1.add(b1);

        JButton b2 = new JButton("pow");
        b2.setBounds(80,80,70,30);
        b2.setBackground(Color.blue);
        b2.setForeground(Color.yellow);
        f1.add(b2);

        JButton b3 = new JButton("*");
        b3.setBounds();



        JLabel l3 = new JLabel("The result will appear Here!! ");
        l3.setBounds(20,125,200,20);
        f1.add(l3);
        
        b1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e) 
            {
                try{
               JOptionPane.showMessageDialog(null, "You Pressed + button");
                double a = Double.parseDouble( t1.getText());
                double b = Double.parseDouble(t2.getText());
               
               double r = a+b;

               l3.setText(a+" + " + b +" = " +r);
            }
               catch(Exception ex)
               {
                JOptionPane.showMessageDialog(null,"Enter a valid number ","error",JOptionPane.ERROR_MESSAGE);
               }
            }
        });

        b2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                JOptionPane.showMessageDialog(null,"You Pressed the Pow button ");
                double a = Double.parseDouble( t1.getText());
                double b = Double.parseDouble(t2.getText());
                double pow = Math.pow(a,b);
                l3.setText(a+" ^ " + b +" = "+ pow);
            }
        });

        f1.setLayout(null);
        f1.setVisible(true);

    }
}
