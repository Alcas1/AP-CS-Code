
import info.gridworld.grid.Location;
import info.gridworld.grid.Grid;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;

import java.awt.*;
import java.util.*;
public class AttractiveCritter extends Critter
{
    public AttractiveCritter()
    {
        setColor(Color.pink);
    }

    public ArrayList<Actor> getActors()
    {
        ArrayList<Actor> toReturn = new ArrayList<Actor>();
        for(Location l:getGrid().getOccupiedLocations())
        {
            if(!l.equals(this.getLocation()))
            {
                toReturn.add(getGrid().get(l));
            }
        }
        return toReturn;
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
        for(Actor a:actors)
        {
            int direction=a.getLocation().getDirectionToward(getLocation());
            Location loc=a.getLocation().getAdjacentLocation(direction);
            if(getGrid().get(loc)==null)
            {
                a.moveTo(loc);

            }
        }

    }
}
