
import info.gridworld.grid.Location;
import info.gridworld.grid.Grid;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;

import java.awt.*;
import java.util.*;
public class JonCritter extends Critter
{
    int d=0;
    Location move;
    int crittersEaten=0;
    public JonCritter()
    {
        setColor(Color.blue);
        setDirection(0);
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

    public void processActors(ArrayList<Actor> actors)
    {
        
        /*if(getGrid().isValid(getLocation().getAdjacentLocation(getDirection()-45)))
        {
            if(getGrid().get(getLocation().getAdjacentLocation(getDirection()-45))!=null)
            {
                if(getGrid().get(getLocation().getAdjacentLocation(getDirection()-45)) instanceof Critter)
                {
                    if(!(getGrid().get(getLocation().getAdjacentLocation(getDirection()-45)) instanceof JonCritter))
                    {
                        getGrid().get(getLocation().getAdjacentLocation(getDirection()-45)).removeSelfFromGrid();
                        crittersEaten++;
                    }

                }
            }
        }
        if(getGrid().isValid(getLocation().getAdjacentLocation(getDirection())))
        {
            if(getGrid().get(getLocation().getAdjacentLocation(getDirection()))!=null)
            {
                if(getGrid().get(getLocation().getAdjacentLocation(getDirection())) instanceof Critter)
                {
                    if(crittersEaten==0)
                    {
                        if(!(getGrid().get(getLocation().getAdjacentLocation(getDirection()-45)) instanceof JonCritter))
                        {
                            getGrid().get(getLocation().getAdjacentLocation(getDirection())).removeSelfFromGrid();
                            crittersEaten++;
                        }
                    }

                }
            }
        }
        if(getGrid().isValid(getLocation().getAdjacentLocation(getDirection()+45)))
        {
            if(getGrid().get(getLocation().getAdjacentLocation(getDirection()+45))!=null)
            {
                if(getGrid().get(getLocation().getAdjacentLocation(getDirection()+45)) instanceof Critter)
                {
                    if(crittersEaten==0)
                    {
                        if(!(getGrid().get(getLocation().getAdjacentLocation(getDirection()-45)) instanceof JonCritter))
                        {
                            getGrid().get(getLocation().getAdjacentLocation(getDirection()+45)).removeSelfFromGrid();
                            crittersEaten++;
                        }
                    }
                }
            }
        }*/
        crittersEaten=0;
        for(Actor a:actors)
        {
                int direction=a.getLocation().getDirectionToward(getLocation());
                Location loc1=a.getLocation().getAdjacentLocation(direction);
                if(getGrid().get(loc1)==null)
                {
                    ArrayList<Actor> neighbors=getGrid().getNeighbors(getLocation());
                    a.moveTo(loc1);
                    if(neighbors.size()>0)
                    {
                        System.out.println("hi");
                        setDirection(neighbors.get(0).getDirection()+90);
                    }
                }
        }

        /*for(Actor a:actors)
        {
            int direction=a.getLocation().getDirectionToward(getLocation());
            Location loc=a.getLocation().getAdjacentLocation(direction);
            if(getGrid().get(loc)==null)
            {

                a.moveTo(loc);

            }
        }*/
    }

    /*public Location selectMoveLocation(ArrayList<Location> locs)
    {
        ArrayList<Actor> neighbors=getGrid().getNeighbors(getLocation());
        for(Actor a:neighbors)
        {
            if(a!=null) {
                int direction=a.getLocation().getDirectionToward(getLocation());
                Location loc1=a.getLocation().getAdjacentLocation(direction);
                if(getGrid().get(loc1)==null)
                {
                    neighbors=getGrid().getNeighbors(getLocation());
                    if(neighbors.size()>0)
                    {
                        setDirection(neighbors.get(0).getDirection()+180);
                    }
                }
            }
        }
        int n = locs.size();
        if (n == 0)
            return getLocation();
        int r = (int) (Math.random() * n);
        return move;
    }*/
}
