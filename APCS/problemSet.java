
import java.util.*;
public class problemSet
{
    public static void loop()
    {
        for(int i=20;i<100;i++)
        {
            if(i%21==0)
            {
                if(!(i%4==0))
                {
                    System.out.println(i);
                }                
            }                        
        }
    }

    public static int factorial(int n)
    {
        if(n<1)
        {
            return 0;
        }
        int total=1;
        for(int i=1;i<=n;i++)
        {
            total*=i;
        }
        return total;
    }

    public static void loop2()
    {
        for(int i=0;i<47;i++)
        {
            if(i%4==0)
            {
                if(!(i%9==0))
                {
                    System.out.println(i);
                }                
            }                        
        }
    }

    public static int sumEvens(int n)
    {
        int total=0;
        for(int i=0;i<10;i++)
        {
            System.out.println(total);
            if((n%10)%2==0)
            {
                total+=n%10;
            }
            n/=10;           
        }
        return total;
    }

    /*public static void main(String args[])
    {
        Random r=new Random();
        int[] testArray=new int[10];
        for(int i=0;i<testArray.length;i++)
        {
            testArray[i]=r.nextInt(101);
        }
        for(int i=0;i<testArray.length;i++)
        {
            testArray[i]+=2;
        }
    }*/

    public static void main(String args[])
    {
        Random r=new Random();
        int highest=0;
        int lowest=200;
        int[] testArray=new int[10];
        for(int i=0;i<testArray.length;i++)
        {
            testArray[i]=r.nextInt(101);
        }
        for(int i=0;i<testArray.length;i++)
        {
            if(highest<testArray[i])
            {
                highest=testArray[i];
            }
        }
        for(int i=0;i<testArray.length;i++)
        {
            if(lowest>testArray[i])
            {
                lowest=testArray[i];
            }
        }
        System.out.println(highest-lowest);
    }

}
