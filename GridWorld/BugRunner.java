
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Critter;
import info.gridworld.actor.Rock;
import java.awt.*;

public class BugRunner
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        world.add(new JonCritter());
        
        world.add(new JonCritter());
        //world.add(new JonCritter());
        //world.add(new JonCritter());
        //world.add(new JonCritter());
        world.show();
    }
}
