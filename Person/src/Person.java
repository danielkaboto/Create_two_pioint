import javax.swing.JOptionPane;

public class Person 
{
    private int age;
    private String name;

    Person(int a , String n){age=a ; name=n;}
    public void setAge(int a){age =a;}
    public void setName(String n){name=n;}
    public int getAge(){return age;}
    public String getName(){return name;}
    public void Display()
    {
        JOptionPane.showMessageDialog(null,"your is name "+ name +" and your age "+age);
    }
    
    Person(String n, int a){setAge(a); ; setName(n);}

    Person()
    {
        name= JOptionPane.showInputDialog("PLease enter the name : ");
        age = Integer.parseInt(JOptionPane.showInputDialog("Please enter the age : "));
    }
    
    public void Birthday()
    {
        age = age +1;
    }
    
}
