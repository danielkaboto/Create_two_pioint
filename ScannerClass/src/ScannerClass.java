/**
 * ScannerClass allow the user to get the value from the console(terminal)
 */
import java.util.Scanner;

public class ScannerClass 
{
    public static void main(String[] args) 
    {
        // declare the oblect and initialize with 
        // predifined standard input object
        Scanner sc = new Scanner(System.in);

        // check if the scanner has a token
        System.out.print("Enter your name  : ");
        String name= sc.next();
        
        System.out.print("Enter your age : ");
        int age = sc.nextInt();

        System.out.print("Enter M if you are male, f if you are female : ");
        char gender = sc.next().charAt(0);

        System.out.println("Enter your phone Number and after with the Cgpa : ");
        long mobile = sc.nextLong();

        System.out.println("Name "+name);
        System.out.println("Gender "+ gender);
        System.out.println("Age "+ age);
        System.out.println("Mobile "+ mobile);
       
    }

    
}
