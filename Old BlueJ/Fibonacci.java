import java.util.*;
public class Fibonacci
{
    public static void main(String args[])
    {
        System.out.println(triangleNumbers(10));    
    }
    
    public static int Fibonacci(int n)
    {
        if(n==0)
        {
            return 1;
        }
        if(n==1)
        {
            return 1;
        }
        return Fibonacci(n-2)+Fibonacci(n-1);
        
        
        
    }
    
    public static int triangleNumbers(int n)
    {
        if(n==0)
        {
            return 0;
        }
        return n+triangleNumbers(n-1);
        
    }
    
    
}
