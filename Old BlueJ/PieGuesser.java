
import java.util.*;
public class PieGuesser
{
    
    public static double guessPie(double guesses)
    {
        Random r=new Random();
        double n=0;
        double counter=0;
        while(n<=guesses)
        {   
            double x = r.nextDouble();
            double y = r.nextDouble();
            if((x*x+y*y)<=1)
            {
                counter++;
            }
            n++;
        }
        return ((4.0*counter)/guesses);
    }
}

