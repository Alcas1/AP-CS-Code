
import java.util.Random;
public class Slot
{
    private int slotNumber;
    public Slot()
    {
        spin();
    }
    public void spin()
    {
        Random r=new Random();
        slotNumber=r.nextInt(10);        
    }    
    public int getSlotNumber()
    {
        return slotNumber;
    }
}
