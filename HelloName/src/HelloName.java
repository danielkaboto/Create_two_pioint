import javax.swing.*;

public class HelloName 
{
    
    public static void main(String[] args) 
    {
        String name;
        name= JOptionPane.showInputDialog("Please enter the name :: ");
        int age = Integer.parseInt( JOptionPane.showInputDialog("Please enter your age : "));

        JOptionPane.showMessageDialog(null,"Hello "+name +" year old "+ age);
       // System.out.println("Hello "+name);


    }
    
}
