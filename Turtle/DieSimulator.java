import java.util.Random;
public class DieSimulator
{
    public static void main(String[]args) throws InterruptedException
    {
        int num2 = 0;
        while( num2<99999)
        {
        Random generator = new Random();
        int num = generator.nextInt(6)+5;
     
        num2 += num;
        System.out.println(num2);
        Thread.sleep(100);
    }
      
        
        
    }
}