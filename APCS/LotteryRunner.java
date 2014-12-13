
import java.util.*;
public class LotteryRunner
{
    public static void main(String args[])
    {
        LotteryTicket[] ticketSet=new LotteryTicket[100000];
        for(int i=0;i<ticketSet.length;i++)
        {
            ticketSet[i]=new LotteryTicket();
            for(int j=0;j<5;j++)
            {
                System.out.print(ticketSet[i].getTicketPlace(j)+" ");
            }
            System.out.println("");
        }
    }
}

