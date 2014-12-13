
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Rock;
import java.util.*;
public class DizzyBug extends Bug
{

    public DizzyBug()
    {

    }

    public void act()
    {
        Random r=new Random();	
        int number=r.nextInt(7);
        for(int i=number;i>0;i--)
        {
            turn();
        }
        if(canMove())
        {
            move();
        }

    }
}
