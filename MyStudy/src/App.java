import java.util.Scanner;

import javax.swing.JOptionPane;

//import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception
    {
   /*  Scanner sc = new Scanner(System.in);
    System.out.print("enter your name :");
    String name = sc.next();
    System.out.println("Please enter your age : ");
    int age = sc.nextInt();
    System.out.println("please enter your heigth :: ");
    float heigth = sc.nextFloat();
    System.out.println("please enter your number :: ");
    long number = sc.nextLong();

    System.out.println(heigth);
    System.out.println(number);
    System.out.println(age);
    System.out.println(name);*/


    String name = JOptionPane.showInputDialog("Enter your name :: ");
    int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age :: "));

    JOptionPane.showMessageDialog(null,"Hello " + name + " your are "+age +" years old ");
  }
}
