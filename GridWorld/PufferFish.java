
import info.gridworld.grid.Location;
import info.gridworld.grid.Grid;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;

import java.awt.*;
import java.util.*;
public class PufferFish extends Critter
{

    public PufferFish()
    {
        setColor(Color.yellow);
    }

    public void makeMove(Location loc)
    {
        if (loc == null)
            removeSelfFromGrid();
        else
            moveTo(loc);
    }

    public void processActors(ArrayList<Actor> actors)
    {
        if(actors.size()==0)
        {
            setColor(Color.yellow);
            return;
        }
        else if(actors.size()>0)
        {
            setColor(Color.red);
            Grid<Actor> grid=getGrid();
            Location currentLocation=getLocation();
            for(int i=0;i<=360;i+=45)
            {
                Location next = currentLocation.getAdjacentLocation(i);
                Location nextNext = next.getAdjacentLocation(i);
                if(grid.isValid(next))
                {
                    if(grid.get(next)!=null)
                    {
                        grid.get(next).removeSelfFromGrid();
                    }
                }
                if(grid.isValid(nextNext))
                {
                    if(grid.get(nextNext)!=null)
                    {
                        grid.get(nextNext).removeSelfFromGrid();
                    }
                }

            }
        }   
    }

}
