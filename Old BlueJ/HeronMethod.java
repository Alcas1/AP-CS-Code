
import java.util.*;
public class HeronMethod
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        
        while(true)
        {
            System.out.println("Number to Find Root");
            double number=s.nextDouble();
            System.out.println("First Guess");
            double guess=s.nextDouble();
            System.out.println("Times to Try");
            int times=s.nextInt();
            findRoot(number,guess,times);
        }
    }

    public static void findRoot(double number,double guess,int iterations)
    {
        System.out.print('\f');
        int times=0;
        for(int i=iterations;i>0;i--)
        {          
            System.out.println(guess);
            times++;
            guess=(guess+number/guess)/2;
            if(guess==Math.sqrt(number))
            {
                System.out.println("Found!");
                break;
            }
        }
        System.out.println("Tries to Find: "+times);
        System.out.println("");
    }
}
