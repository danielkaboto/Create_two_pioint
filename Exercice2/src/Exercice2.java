import javax.swing.JOptionPane;

/**
 * Exercice2 calculate the price of the carpet per metter for economic price or lixury
 */
public class Exercice2
 {
    public static void main(String[] args)
     {
        final double eco_price =9.99;
        final double lux_price= 24.99;
        double length, width;
        double Price_eco, Price_lux;
        
        length =Double.parseDouble(JOptionPane.showInputDialog("Please enter the length : "));
        width = Double.parseDouble(JOptionPane.showInputDialog("Please enter the width : "));

        Price_eco= length * width * eco_price;
        Price_lux= length*width*lux_price;

        JOptionPane.showMessageDialog(null, "Eco prise = "+Price_eco);
        JOptionPane.showMessageDialog(null, "luxury price ="+Price_lux);






        
    }

    
}