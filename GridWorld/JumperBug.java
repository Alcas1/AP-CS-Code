import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;
import info.gridworld.grid.Grid;
import java.util.*;

public class JumperBug extends Bug
{
    public JumperBug()
    {
    }

    public boolean canMove()
    {
        Location currentLocation=getLocation();
        Grid<Actor> currentGrid=getGrid();
        int d=getDirection();
        Location next=currentLocation.getAdjacentLocation(d);
        Location nextNext=next.getAdjacentLocation(d);
        if(currentGrid.isValid(nextNext))
        {
            return true;
        }
        return false;
    }

    public void move()
    {
        Location currentLocation=getLocation();
        int d=getDirection();
        Location next=currentLocation.getAdjacentLocation(d);
        Location nextNext=next.getAdjacentLocation(d);
        moveTo(nextNext);
    }

    public void act()
    {
        if(canMove())
        {
            move();
        }
        else
        {
            turn();
            turn();
        }

    }
}

