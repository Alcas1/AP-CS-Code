/**
 * WorkerAnt.java 
 *
 * @author - Jane Doe
 */

import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import java.util.*;
import java.awt.Color;
import java.util.ArrayList;

/**
 * A <code>WorkerAnt</code> is a critter who's mission is
 * to take food from <code>Cake and Cookie</code> objects and to
 * deliver it to a <code>QueenAnt</code> object.
 * Initially it looks for food.  After it finds food, it looks for
 * a queen.
 * Worker ants share the location of food and the queen
 * with other ants they encounter.
 * Worker ants with food are red.  If they don't have food,
 * they are black.
 */
public class WorkerAnt extends Critter implements Processable
{
    Random r=new Random();
    /** Current amount of food being carried */
    private int foodAmount;
    private int antWeight;
    /** Location of a <code>Food</code> object */
    private Location foodLoc;
    /** Location of a <code>QueenAnt</code> object */
    private Location queenLoc;
    /**
     * Constructs a <code>WorkerAnt</code> critter.
     * It is originally black (no food) and
     * its direction is chosen randomly from the
     * eight normal cardinal directions.
     */
    public WorkerAnt()
    {
        setColor(Color.black);
        int d=r.nextInt(8);
        setDirection(d*45);
        foodLoc=null;
        queenLoc=null;
        foodAmount=0;
    }

    /**
     * Gives current food and queen locations to <code>ant</code>.
     * @param ant the calling <code>WorkerAnt</code>
     */
    public void process(WorkerAnt ant)
    {
        if(queenLoc!=null)
        {
            shareQueenLocation(queenLoc);
        }
        if(foodLoc!=null)
        {
            shareFoodLocation(foodLoc);
        }
    }

    /**
     * Takes <code>fQty</code> amount of food from the
     * calling <code>Food</code>.
     * @param fQty the amount of food to take.
     */
    public void takeFood(int fQty)
    {
        foodAmount=fQty;
    }

    /**
     * Gives food to the calling <code>QueenAnt</code>.
     * @return the amound of food to give.
     */
    public int giveFood()
    {
        int toReturn=foodAmount;
        foodAmount=0;
        return toReturn;   // Replace with appropriate implementation !
    }

    /**
     * Receives the <code>fLoc</code> food location from a
     * <code>Food</code> object.  Saves this location if
     * it doesn't already have one.
     * @param fLoc the location of the food.
     */
    public void shareFoodLocation(Location fLoc)
    {
        if(foodLoc==null)
        {
            foodLoc=fLoc;
        }
    }

    /**
     * Receives the <code>qLoc</code> queen location from a
     * <code>QueenAnt</code> object.  Saves this location if
     * it doesn't already have one.
     * @param qLoc the location of the queen.
     */
    public void shareQueenLocation(Location qLoc)
    {
        if(qLoc==null)
        {
            queenLoc=qLoc;
        }
    }

    /**
     * Processes each of the neighboring Ant Farm actors.
     * Implemented to get food from <code>Cake and Cookie</code> actors,
     * give food to <code>QueenAnt</code> actors, and to share locations
     * with other <code>WorkerAnt</code> actors.<br />
     * Precondition: All objects in <code>actors</code>
     * are contained in the same grid as this critter.
     * @param actors the actors to be processed
     */
    @Override
    public void processActors(ArrayList<Actor> actors)
    {
        for(Actor a:actors)
        {
            Processable p=(Processable) a;
            p.process(this);
        }
    }

    /**
     * Gets the possible locations for the next move.
     * Implemented to return the empty neighboring locations
     * that are roughly in the direction of the current goal
     * (food or queen).  Calles getDesiredDirection to get the
     * direction to the goal.  Then it considers locations which
     * are in that direction or +- Location.HALF_RIGHT degrees.<br />
     * Postcondition: The locations must be valid in the grid
     * of this critter.
     * @return a list of possible locations for the next move
     */
    @Override
    public ArrayList<Location> getMoveLocations()
    {
        ArrayList<Location> toReturn = new ArrayList<Location>();
        Location l1=getLocation().getAdjacentLocation(getDesiredDirection());
        Location l2=getLocation().getAdjacentLocation(getDesiredDirection()+45);
        Location l3=getLocation().getAdjacentLocation(getDesiredDirection()-45);
        ArrayList<Actor> actors = new ArrayList<Actor>();

        if(getGrid().isValid(l1))
        {
            if(getGrid().get(l1)==null)
            {
                toReturn.add(l1);
            }
        }
        if(getGrid().isValid(l2))
        {
            if(getGrid().get(l2)==null)
            {
                toReturn.add(l2);
            }
        }
        if(getGrid().isValid(l3))
        {
            if(getGrid().get(l3)==null)
            {
                toReturn.add(l3);
            }
        }
        return toReturn;    // Replace with appropriate implementation !
    }

    /**
     * Moves this critter to the given location, sets its direction,
     * and sets its color (red = has food, black = does not have food).
     * Implemented to call moveTo.<br />
     * Precondition: <code>loc</code> is valid in the grid of this critter
     * @param loc the location to move to (must be valid)
     */
    @Override
    public void makeMove(Location loc)
    {
        if(loc.equals(getLocation()))
        {
            int test=r.nextInt(2);
            if(test==0)
            {
                setDirection(getDirection()+45);
            }
            else
            {
                setDirection(getDirection()-45);
            }
        }
        else
        {
            setDirection(getLocation().getDirectionToward(loc));
        }
        moveTo(loc);
    }

    /**
     * Returns the direction that the ant wants to go.
     * @return the direction to the queen (if there is food
     * and a queen's location is known); the direction to the
     * food (if there is no food and a food's location is known);
     * the current ant's direction otherwise.
     */
    private int getDesiredDirection()
    {
        if(foodLoc!=null&&foodAmount==0)
        {
            return getLocation().getDirectionToward(foodLoc);
        }
        else if(queenLoc!=null&&foodAmount!=0)
        {
            return getLocation().getDirectionToward(queenLoc);
        }
        return getDirection();   // Replace with appropriate implementation !
    }

    /**
     * Creates a string that describes this actor.
     * @return a string with the <code>Actor</code> information
     * plus the current amount of food and any known
     * <code>Food</code> and <code>QueenAnt</code> locations.
     */
    @Override
    public String toString()
    {
        return null;    // Replace with appropriate implementation !
    }
}
