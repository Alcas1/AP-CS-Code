
import java.util.Scanner;
import java.util.*;
public class SlotMachine
{
    public static void main(String args[])
    {
        int youtubeMoneh=0;
        Scanner s=new Scanner(System.in);
        Slot slot1=new Slot();
        Slot slot2=new Slot();
        Slot slot3=new Slot();
        while(true)
        {
            System.out.println("Type Anything to Spin");
            String input=s.next();
            System.out.print('\f');
            slot1.spin();
            slot2.spin();
            slot3.spin();
            System.out.println(slot1.getSlotNumber());
            System.out.println(slot2.getSlotNumber());
            System.out.println(slot3.getSlotNumber());
            int money=score(slot1.getSlotNumber(),slot2.getSlotNumber(),slot3.getSlotNumber());
            System.out.println("score "+money);
            youtubeMoneh+=money;
            System.out.println("Total Score "+youtubeMoneh);
        }
    }

    public static int score(int slot1,int slot2,int slot3)
    {
        int score=0;
        if(slot1==slot2&&slot2==slot3)
        {
            if(slot1==1)
            {
                score=1000;

            }
            else
            {
                score=slot1*100;
            }
        }
        else if(slot1==slot2||slot2==slot3||slot1==slot3)
        {
            if(slot1==slot2)
            {
                score=slot1*5;
            }
            else if(slot2==slot3)
            {
                score=slot2*5;
            }
            else if(slot1==slot3)
            {
                score=slot3*5;
            }

        }
        else
        {
            score=-5;   
        }
        return score;
    }
}
