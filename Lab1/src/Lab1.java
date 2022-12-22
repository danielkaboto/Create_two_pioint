import java.util.Scanner;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args)

    {
        Scanner Read = new Scanner(System.in);
        double a,b, result;
        try{


        System.out.print(" 1. Add \n 2. multi \n 3. Power \n 4. Square root \n 5.Circle Area \n 6.Exit \n Shoose (1-6): ");
        int choice;
        choice = Read.nextInt();
        do{
            switch (choice)
        {
            case 1: 
                    System.out.println("Enter two numbers :: ");
                    a=Read.nextDouble();
                    b= Read.nextDouble();
                    result= a+b;
                    System.out.println(a+"+"+b+"="+result);                
                    break;
            case 2:
                    System.out.println("Enter two numbers :: ");
                    a=Read.nextDouble();
                    b= Read.nextDouble();
                    result= a+b;
                    System.out.println(a+"+"+b+"="+result);
                    break;
            case 3:
                    System.out.println("Enter two numbers :: ");
                    a=Read.nextDouble();
                    b= Read.nextDouble();
                    result= Math.pow(a,b);
                    System.out.println(a+"+"+b+"="+result);
                    break;
            case 4:
                    System.out.println("Enter a numbers :: ");
                    a=Read.nextDouble();
                    result= Math.sqrt(a);
                    System.out.println(a+"square root ="+result);
                    break;
            case 5:
                    System.out.println("Enter a radium :: ");
                    //a=Read.nextDouble();
                    a= Double.parseDouble(JOptionPane.showInputDialog("Enter the radius : "));
                    result= Math.sqrt(a);
                    b = 3.145 *result;
                    //System.out.println(a+"the area is  ="+b);
                    JOptionPane.showMessageDialog(null,"Area ="+b);
                    break;

            case 6:
                break;
        
            default:
                break;
        }
    }while(choice != 6);
}finally{
    Read.close();
}

    }

}