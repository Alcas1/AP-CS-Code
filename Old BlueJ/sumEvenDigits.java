
import java.util.*;
public class sumEvenDigits
{
    public static int sumevendigits(int n)
    {
        System.out.println(n);
        int total=0;
        int counter=5;
        n=n-n%10;
        System.out.println(n);
        while(counter>0)
        {
            total+=n%10;
            counter--;
            n=(n/100)%1;
        }
        return total;
    }
}
