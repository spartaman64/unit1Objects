import java.awt.Color;
public class TurtLab
{
    public static void main(String[]args) throws InterruptedException
    {
        World turtleWorld = new World();
        Turtle turtle1 = new Turtle(turtleWorld);
        Turtle turtle2 = new Turtle(turtleWorld);
        turtle1.setPenColor(Color.RED);
        turtle2.setPenColor(Color.BLUE);
        turtle1.setPenDown(true);
        turtle2.setPenDown(true);
        turtle1.forward(50);
        turtle2.backward(50);
        turtle1.turnRight();
        turtle2.turnLeft();
        turtle1.forward(50);
        turtle2.forward(50);
        turtle1.backward(50);
        turtle2.backward(50);
        turtle1.turnLeft();
        turtle2.turnRight();
        turtle1.backward(50);
        turtle2.forward(50);
        turtle1.turnRight();
        turtle2.turnLeft();
        turtle1.forward(50);
        turtle2.forward(50);
        turtle1.turnLeft();
        turtle2.turnLeft();
        turtle1.forward(50);
        turtle2.forward(50);
        turtle1.forward(50);
        turtle2.forward(50);
        turtle1.turnRight();
        turtle2.turnRight();
        turtle1.forward(50);
        turtle2.forward(50);
        turtle1.turnRight();
        turtle2.turnRight();
        turtle1.forward(50);
        turtle2.forward(50);
        turtle1.turnRight();
        turtle2.turnRight();
        turtle1.forward(50);
        turtle2.forward(50);turtle1.turnRight();
        turtle2.turnRight();
        turtle1.forward(50);
        turtle2.forward(50);
        turtle1.turnLeft();
        turtle1.forward(200);
        turtle2.turnRight();
        turtle2.forward(50);
        turtle2.turnRight();
        turtle2.forward(250);
        int num = 0;
        while( num!=20)
        {
     turtle1.turnRight();
     turtle1.forward(50);
     turtle2.turnRight();
     turtle2.forward(50);
     Thread.sleep(1000); 
     num+=1;
    }
    
}
}
        