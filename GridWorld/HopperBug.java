import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;
import info.gridworld.grid.Grid;
import java.util.*;

public class HopperBug extends Bug
{
    private boolean movingRight;
    public HopperBug(int d)
    {
        super();
        setDirection(d);
        movingRight=true;
    }

    public boolean canMove()
    {
        Location currentLocation=getLocation();
        Grid<Actor> currentGrid=getGrid();
        int d=getDirection();
        if(movingRight&&d==90)
        {
            if(currentGrid.isValid(currentLocation.getAdjacentLocation(135)))
            {
                return true;
            }
        }
        else if(!movingRight&&d==90)
        {
            if(currentGrid.isValid(currentLocation.getAdjacentLocation(45)))
            {
                return true;
            }
        }
        else if(movingRight&&d==315)
        {
            if(currentGrid.isValid(currentLocation.getAdjacentLocation(135)))
            {
                return true;
            }
        }
        else
        {
            if(currentGrid.isValid(currentLocation.getAdjacentLocation(225)))
            {
                return true;
            }
        }
        return false;
    }

    public void move()
    {
        Location currentLocation=getLocation();
        int d=getDirection();
        if(movingRight&&d==90)
        {
            moveTo(currentLocation.getAdjacentLocation(135));
        }
        else if(!movingRight&&d==90)
        {
            moveTo(currentLocation.getAdjacentLocation(45));
        }
        else if(movingRight&&d==315)
        {
            moveTo(currentLocation.getAdjacentLocation(135));
        }
        else
        {
            moveTo(currentLocation.getAdjacentLocation(225));
        }
    }

    public void act()
    {
        if(canMove())
        {
            move();
            movingRight=!movingRight;
        }
        else
        {
            turn();
            turn();
            turn();
            turn();
            movingRight=!movingRight;;
        }

    }
}

