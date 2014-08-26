import javax.swing.JOptionPane;

public class Hello2
{
    public static void main(String[]args)
    {
        String name = JOptionPane.showInputDialog("What is your name");
        String x = JOptionPane.showInputDialog("My name is Hal what would you like me do");
        System.out.println("Sorry "+name+" i'm afraid i can't do that");
    }
}