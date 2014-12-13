import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Rock;

import java.util.*;
public class BoxBug extends Bug
{
    private int goalSteps;
    private int currentSteps;
    public BoxBug(int n)
    {
        goalSteps=n;
        currentSteps=0;

    }

    public void act()
    {
        if(canMove()&&currentSteps<goalSteps)
        {
            move();
            if(canMove()&&currentSteps<goalSteps)
            {
            move();
        }
            currentSteps++;
        }
        else
        {
            turn();
            turn();
            currentSteps=0;
        }

    }
}
