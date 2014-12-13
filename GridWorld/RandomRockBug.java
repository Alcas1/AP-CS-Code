import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Rock;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.grid.Grid;
import java.util.*;

public class RandomRockBug extends Bug
{
    private int moving;
    private int move;
    Random r=new Random();
    public RandomRockBug()
    {
        setDirection(90);
        moving=0;
    }

    public void move()
    {
        Grid<Actor> gr = getGrid();
        if (gr == null)
            return;
        Location loc = getLocation();
        Location next = loc.getAdjacentLocation(getDirection());
        if (gr.isValid(next))
            moveTo(next);
        else
            removeSelfFromGrid();
        Flower flower = new Flower(getColor());

        Rock rock=new Rock();
        if(r.nextInt(4)==0)
        {
            rock.putSelfInGrid(gr, loc);
        }   
        else
        {
            flower.putSelfInGrid(gr, loc);

        }

    }
}
