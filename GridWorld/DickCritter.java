
import info.gridworld.grid.Location;
import info.gridworld.grid.Grid;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;

import java.awt.*;
import java.util.*;
public class DickCritter extends Critter
{
    public DickCritter()
    {
        setColor(Color.pink);
    }

    public void makeMove(Location loc)
    {
        if (loc == null)
            removeSelfFromGrid();
        else
            moveTo(loc);
    }

    public ArrayList<Actor> getActors()
    {
        ArrayList<Actor> toReturn= new ArrayList<Actor>();
        Location l=getLocation().getAdjacentLocation(getDirection());
        if(getGrid().isValid(l)&&getGrid().get(l)!=null)
        {
            toReturn.add(getGrid().get(l));
        }
        return toReturn;
    }

    public void processActors(ArrayList<Actor> actors)
    {
        if(actors.size()==0)
        {
            setColor(Color.pink);
            return;
        }
        else
        {
            ArrayList<Location> adjacentLocs=getGrid().getEmptyAdjacentLocations(actors.get(0).getLocation());
            for(Location l:adjacentLocs)
            {
                Rock r = new Rock();
            }

        }
          
    }

}
