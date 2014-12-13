
import java.util.*;
public class StudentRecord
{
    int[] scores=new int[5];    
    int first=0;
    int last=0;
    private double average(int first,int last)
    {
        double total=0;
        for(int i=first;i<last;i++)
        {
            total+=scores[i];
        }
        return total/(last-first);
    }   

    private boolean hasImproved()
    {
        int last=0;
        for(int i=0;i<scores.length;i++)
        {
            if(scores[i]<last)
            {
                return false;
            }
            last=scores[i];
        }
        return true;
    }
    
    public double finalAverage()
    {
        if(hasImproved())
        {
            return average(scores.length/2,scores.length);
        }
        return average(0,scores.length);
    }	
}
