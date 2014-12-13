import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;
import info.gridworld.grid.Grid;
import java.util.*;

public class ZBug extends Bug
{
    private int moving;
    private int move;
    public ZBug(int patternLength)
    {
        setDirection(90);
        moving=0;
        move=patternLength;
    }

    public void act()
    {
        if(canMove())
        {
            if(moving==0)
            {
                move--;
                move();
                if(move==0)
                {
                    moving++;
                    move=4;
                    turn();
                    turn();
                    turn();
                }
            }
            else if(moving==1)
            {
                move--;
                move();
                if(move==0)
                {
                    moving++;
                    move=4;
                    turn();
                    turn();
                    turn();
                    turn();
                    turn();
                }
                
            }
            else if(moving==2)
            {
                move--;
                move();
                if(move==0)
                {
                    moving++;
                }
            }
            else
            {
                
            }
        }
        else
        {
            
        }

    }
}

