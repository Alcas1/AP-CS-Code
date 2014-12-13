
import info.gridworld.actor.*;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

import java.awt.Color;
import java.util.ArrayList;

public class MedusaCritter extends Critter
{
    public MedusaCritter(){
        super();
    }
    public void processActors(ArrayList<Actor> actors){
        Grid <Actor> gr = getGrid();
        for(Actor a : actors){
            if(!(a instanceof Rock) && !(a instanceof Critter)){
                Location target = a.getLocation();
                if(a instanceof Bug){
                    Rock rock = new Rock(a.getColor());
                    a.removeSelfFromGrid();
                    rock.putSelfInGrid(gr,target);
                }else{
                    a.removeSelfFromGrid();
                }
            }
        }
    }
   
    public ArrayList<Actor> getActors(){
        ArrayList<Actor> actors = new ArrayList<Actor>();
        int [] dirs = {Location.AHEAD,Location.HALF_RIGHT,Location.HALF_LEFT};
        for(Location loc : getLocationsInDirections(dirs)){
            Actor a = getGrid().get(loc);
            if(a != null){
                actors.add(a);
            }
        }
        return actors;
    }
    
}