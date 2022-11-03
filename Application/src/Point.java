import javax.swing.JOptionPane;

public class Point 
{
    private double x;
    private double y;
    public Point(double a, double b){x=a; y=b;}
    public Point(){x=y=0;}
    public Point(int useless)
    {
        x= Double.parseDouble(JOptionPane.showInputDialog("Enter the value of x : "));
        y= Double.parseDouble(JOptionPane.showInputDialog("Enter the value of y : "));
    }

    public double getx(){return x;}
    public double gety(){return y;}
    public void setx(double a){x=a;}
    public void sety(double b){y=b;}
    public void display(){JOptionPane.showMessageDialog(null, "x= "+x +" " + "y = "+y);}
    public double DisFrom (){ return Math.sqrt(Math.pow(x,2)+Math.pow(y,2));}
    public double Dis2point(Point q){ return Math.sqrt(Math.pow(x-q.x,2)+Math.pow(y-q.y,2));}
    
    /*public location()
    {
        return;
    }*/

}
