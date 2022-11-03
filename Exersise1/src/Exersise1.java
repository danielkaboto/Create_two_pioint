import javax.swing.* ;

/*
 * the program calculate the cost of carrying out a car repair
 */

public class Exersise1 

{
    public static void main(String[] args) 
    {
        //constant value the amount pay by hour and the VAT taxes
        final int  hourly = 20;
        final double vat = 0.175;

        // Take the value of the variable from the users through  the input Dialog box
        Double part =Double.parseDouble(JOptionPane.showInputDialog("cost of the part "));
        Double hours =Double.parseDouble(JOptionPane.showInputDialog("Please enter  the hours of work ")); 
        Double Labour = hours * hourly;

        // total bill before VAT
        double Total = Labour+part;

        // final bill
        double Final = Total + vat * Labour;

        JOptionPane.showMessageDialog(null,"The bill to pay is "+Final);

    }
}
