
public class FibonnaciRound2
{
    public static int Fibonacci(int n)
    {
        if(n==0)
        {
            return 1;
        }
        else if(n==1)
        {
            return 1;
        }
        return n+Fibonacci(n-1);
        
    }


}
