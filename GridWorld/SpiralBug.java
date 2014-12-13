
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;
import info.gridworld.grid.Grid;
import java.util.*;

public class SpiralBug extends Bug
{
    private int steps=4;
    private int maxSteps=4;
    public void act()
    {
        if(canMove())
        {
            move();
            steps--;
            if(steps==0)
            {
                maxSteps+=1;
                steps=maxSteps;
                turn();
                turn();
            }
        }
        else
        {
            
        }

    }
}

