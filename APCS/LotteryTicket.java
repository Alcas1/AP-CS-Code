
import java.util.*;
public class LotteryTicket
{
    private int[] ticket;
    Random r=new Random();
    public LotteryTicket()
    {
        ticket=new int[5];
        int count=0;
        boolean seen=false;
        while(count<5)
        {
            int current=r.nextInt(20)+1;
            for(int i=0;i<5;i++)
            {
                if(current == ticket[i])
                {
                    seen =true;
                }
            }
            if(!seen)
            {
                ticket[count]=current;
                count++;
            }
            else
            {
                seen=false;
            }
        }

    }
    
    public int getTicketPlace(int index)
    {
        return ticket[index];
    }

    
    
    
}
