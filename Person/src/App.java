import javax.swing.JOptionPane;

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        Person p1 = new Person(21,"John");
        Person p2 = new Person("suzane", 25);
        Person p3 = new Person();
        p1.Birthday();
        JOptionPane.showMessageDialog(null,p1.getName()+ " is " + p1.getAge() + " years old");
        JOptionPane.showMessageDialog(null,p3.getName()+ " is " + p3.getAge() + " years old");
    }
}
