
import info.gridworld.grid.Location;
import info.gridworld.grid.Grid;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;

import java.awt.*;
import java.util.*;
public class ChangeOthersCritter extends Critter
{



    public ChangeOthersCritter(Color c)
    {
        setColor(c);
    }


    public void processActors(ArrayList<Actor> actors)
    {
        if(actors.size()==0)
        {
            return;   
        }
        Random r=new Random();
        int n=r.nextInt(actors.size());
        for(int i=0;i<actors.size();i++)
        {
            actors.get(i).setColor(this.getColor());
        }
    }

}
