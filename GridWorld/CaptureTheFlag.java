import java.awt.Color;
import info.gridworld.actor.*;
import info.gridworld.grid.*;
public class CaptureTheFlag {

	public static void main(String[] args) {

		ActorWorld battleField = new ActorWorld();
		battleField.setGrid(new BoundedGrid(10, 19));
		battleField.add(new Location(4,18), new Flag(Color.RED));
		battleField.add(new Location(4,0), new Flag(Color.BLUE));
		battleField.add(new Location(5,0), new Rock());
		battleField.add(new Location(5,18), new Rock());
		battleField.add(new Location(4,1), new Rock());
		battleField.add(new Location(4,17), new Rock());
		battleField.add(new Location(5,1), new Rock());
		battleField.add(new Location(5,17), new Rock());

		for (int i=0;i<5;i++){
			battleField.add(new Location(2+i, 8),new AttackCritter(Color.BLUE, Color.RED));
			battleField.add(new Location(2+i, 10),new AttackCritter(Color.RED, Color.BLUE));
		}
		battleField.show();
	}

}