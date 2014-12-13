
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;
import info.gridworld.grid.Grid;
import java.util.*;

public class HouseBug extends Bug
{
    private int phase=0;
    private int step=4;
    public void act()
    {
        if(canMove())
        {
            move();
            step--;
            if(step==0||phase>6)
            {
                phase++;
                if(phase==1)
                {
                    step=3;
                    turn();
                }
                else if(phase==2)
                {
                    step=3;
                    turn();
                    turn();
                }
                else if(phase==3)
                {
                    step=6;
                    turn();
                    turn();
                    turn();
                }
                else if(phase==4)
                {
                    step=6;
                    turn();
                    turn();
                    turn();
                    turn();
                }
                else if(phase==5)
                {
                    step=4;
                    turn();
                    turn();
                }
                else if(phase==6)
                {
                    step=6;
                    turn();
                    turn();
                }
                else
                {
                    turn();
                    turn();
                    turn();
                    turn();
                }
            }
        }
        else
        {

        }

    }
}

