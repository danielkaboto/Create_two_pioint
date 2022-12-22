import javax.swing.JOptionPane;

public class Line 
{
    private Point a;
    private Point b;
    private double length;
    
    public Line(double x1, double x2, double y1, double y2)
    {
        a = new Point(x1,y1);
        b = new Point(x2,y2);
        length = a.Dis2point(b);


    }
    public Line()
    {
        a= new Point(0);
        b = new Point(7);
        length = a.Dis2point(b);

    }

    public void Display()
    {
        a.display();
        b.display();       
        JOptionPane.showMessageDialog(null,"the length is = "+length);

    }
    
    
}
