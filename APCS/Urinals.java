
import java.util.*;
public class Urinals
{

    public static void main(String args[])
    {
        Random r=new Random();
        boolean[] urinals=new boolean[10];
        int test=r.nextInt(2)+4;
        urinals[test]=true;
        print(urinals);
        for(int i=0;i<9;i++)
        {
            addUrinal(urinals);
            print(urinals);
        }
    }

    public static boolean[] addUrinal(boolean[] urinals)
    {
        int index=0;
        int lastUrinal=-1;
        int largest=0;
        for(int i=0;i<10;i++)
        {           
            if(urinals[i])
            {
                if(i-lastUrinal>=largest)
                {
                    largest=i-lastUrinal;
                    index=i;
                }       
                lastUrinal=i;
            }
            if(i==9)
            {
                if(i-lastUrinal>=largest)
                {
  
                    largest=i-lastUrinal;
                    index=i;
                
                }       
                lastUrinal=i;
            }
        }
        int addUrinal=index-largest/2;
        if(largest==3)
        {
            if(!urinals[9])
            {
                addUrinal=9;
            }
            else if(!urinals[0])
            {
                addUrinal=0;
            }
        }
        urinals[addUrinal]=true;
        return urinals;
    }

    public static void print(boolean[] urinals)
    {
        System.out.println("");
        for(int i=0;i<10;i++)
        {
            if(urinals[i])
            {
                System.out.print("X");
            }
            else
            {
                System.out.print("_");
            }
            System.out.print(" ");
        }
    }

}
