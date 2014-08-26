import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Imageurl
{
    public static void main(String[]args)
    {
        URL imageLocation = new URL(
        "http://horstmann.com/java4everyone/duke.gif");
        JOption.showMessageDialog(null, "Hello", "Title", 
        JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
    }
}
        
    