
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;
import info.gridworld.grid.Grid;
import java.util.*;

public class PenisBug extends Bug
{
    private int phase=0;
    private int step=1;

    public PenisBug()
    {
        setDirection(45);
    }

    public void act()
    {

        if(canMove())
        {
            move();
            step--;
            if(step==0)
            {
                phase++;
                if(phase==1)
                {
                    step=1;
                    turn();
                    turn();
                }
                else if(phase==2)
                {
                    step=1;
                    turn();
                    turn();
                }
                else if(phase==3)
                {
                    step=1;
                    turn();
                    turn();
                }
                else if(phase==4)
                {
                    step=1;
                    turn();
                    turn();
                }
                else if(phase==5)
                {
                    step=5;
                    setDirection(0);
                }
                else if(phase==6)
                {
                    step=1;
                    turn();
                }
                else if(phase==7)
                {
                    step=1;
                    turn();
                    turn();
                }
                else if(phase==8)
                {
                    step=6;
                    setDirection(180);
                }
                else if(phase==9)
                {
                    step=1;
                    setDirection(135);
                }
                else if(phase==10)
                {
                    step=1;
                    setDirection(225);
                }
                else if(phase==11)
                {
                    step=1;
                    setDirection(315);
                }
                else if(phase==12)
                {
                    step=1;
                    setDirection(45);
                }
                else
                {
                    step=1;
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

