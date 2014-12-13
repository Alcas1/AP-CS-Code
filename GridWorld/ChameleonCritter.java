
import info.gridworld.grid.Location;
import info.gridworld.grid.Grid;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;

import java.awt.*;
import java.util.*;
public class ChameleonCritter extends Critter
{
    public void processActors(ArrayList<Actor> actors)
    {
        if(actors.size()==0)
        {
            return;   
        }
        Random r=new Random();
        int n=r.nextInt(actors.size());
        setColor(actors.get(n).getColor());
    }

}
