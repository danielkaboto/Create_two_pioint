import javax.swing.* ;
import java.text.DecimalFormat;

public class CarHour 
{
    private String partStr;
    private String hourStr;
    private double hours;
    private double parts;
    private double bill;
    public double gethour(){return hours;}
    public double getparts(){return parts;} 
    public CarHour(double h, double p)
    {
        hours = h;
        parts = p;
        bill = parts*hours;
    }
    public CarHour()
    {

    }
    public  void Displays()
    {
        DecimalFormat pound = new DecimalFormat("$ ###,##0.00");
        JOptionPane.showMessageDialog(null,"the total money to pay is = "+ pound.format(bill));

    }
    
}
