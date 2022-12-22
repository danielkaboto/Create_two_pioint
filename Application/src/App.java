import javax.swing.JOptionPane;

public class App 
{
    public static void main(String[] args) throws Exception 
    {
     /* Point p1 = new Point();
       Point p2 = new Point(20,30.5);
       Point p3 = new Point(0);
       p3.display();
       p2.display();
       JOptionPane.showMessageDialog(null, "the distance from the origin is  = "+ p3.DisFrom());
       JOptionPane.showMessageDialog(null,"the distance between p3 and p2 = "+p3.Dis2point(p2));
       p3.location();*/

       Line l1 = new Line(5,-2,10,6);
       Line l2 = new Line();
       l1.Display();
       l2.Display();
    }
}
