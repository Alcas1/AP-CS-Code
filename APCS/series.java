
import java.util.*;
public class series
{
    public static void main(String args[])
    {
        long total=0;
        for(long i=1;i<1000;i++)
        {
            total+=Math.pow(i,i);
        }
        System.out.println(total);
    }

}
