
import java.util.*;
public class creditCardStealer
{
    public static void main(String args[])
    {

    }

    public static int evenSums(int n)
    {
        int total=0;
        int clone=n;
        for(int counter=0;counter<4;counter++)
        {
            total+=clone%10; 
            System.out.println(clone%10);
            clone/=100;
        }
        return total;

    }

    public static int sumDigits(int n)
    {
        if(n<10)
        {
            return n;
        }
        else
        {
            return n%10+1;
        }
    }

    public static int otherSums(int n)
    {
        int x=n/10;
        int total=0;
        int counter=0;
        while(counter<4)
        {
            int current=x%10;
            current*=2;
            total=total+sumDigits(current);
            counter++;
            x/=100;
        }
        return total;
    }
    
    public static boolean checkCreditNum(int n)
    {
        return ((evenSums(n)+otherSums(n))%10)==0;
        
        
        
        
    }
}
