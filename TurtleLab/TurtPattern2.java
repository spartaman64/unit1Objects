import java.awt.Color;
public class TurtPattern2
{
    public static void main(String[]args) throws InterruptedException
        {
         World TurtleWorld = new World();
         Turtle turt1 = new Turtle(TurtleWorld);
         Turtle turt2= new Turtle(TurtleWorld);
         int num = 0;
         while (num!=10)
         {
             turt1.forward(50);
             turt1.turnRight();
             turt1.forward(50);
             turt1.turnLeft();
             turt2.turnRight();
             turt2.forward(50);
             turt2.turnLeft();
             turt2.forward(50);
             Thread.sleep(500);
             
             num+=1;
            }
        }
    }