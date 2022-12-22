import javax.swing.JOptionPane;

public class Engineer 
{
    private String name;
    private int age;
    private double salary;
    private String jobtitle;

    Engineer(String n, int a)
    {
        name =n;
        age = a;
    }

    public void setSalary(double s){salary = s;}
    public void setJob (String t){jobtitle = t;}
    public String getName(){return name;}
    public String getJob(){return jobtitle;}
    public double getSalary(){return salary;}
    public int getAge(){return age;}
    
    public void AddBonus(double bonus){salary+=bonus;};
    public void showSalary(){JOptionPane.showMessageDialog(null,"the salary = "+ salary);}
}
