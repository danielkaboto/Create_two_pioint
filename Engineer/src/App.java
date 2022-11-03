import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception 
    {
        Engineer E1 = new Engineer("Jack", 38);
        E1.setJob("Computer engineer");
        E1.setSalary(2250);
        E1.AddBonus(1000);

        JOptionPane.showMessageDialog(null, E1.getName() + "is "+ E1.getAge()+"years old");
        E1.showSalary();

    }
}
