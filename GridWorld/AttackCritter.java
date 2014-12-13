import java.util.*;
import info.gridworld.grid.Location;
import info.gridworld.grid.Grid;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import java.awt.*;



public class AttackCritter extends Critter
{
    int strength;
    Random r=new Random();
    public AttackCritter(Color c)
    {
        strength=5;
        setColor(c);
        }
    

    
    
    
    public void processActors(ArrayList<Actor> actors)
    {
        for(Actor a:actors)
        {
            if(getColor()==a.getColor())
            {
                strength++;
            }
            else
            {
                strength--;
            }
        }
    }
    
    
}
