
public class Examples
{
    public static int sumOddMinusEven(int n)
    {
        int clone=n;
        int total=0;
        for(int i=5;i>0;i--)
        {
            total+=clone%10;       
            clone/=100;
        }
        clone=n;
        clone/=10;
        for(int i=5;i>0;i--)
        {
            total-=clone%10;       
            clone/=100;
        }
        return total;
    }

    public static void multiTable(int x,int y)
    {
        for(int i=x;i>0;i--)
        {
            for(int j=y;j>0;j--)
            {            
                System.out.println(i+"X"+j+"  "+i*j);
            }
        }

    }

    public static void countSevens()
    {
        for(int i=300;i>100;i-=7)
        {
            System.out.println(i);
        }
    }

    public static void divideByEigth()
    {
        for(int i=48;i<=96;i+=8)
        {  
            System.out.println(i);
        }
    }

    public static int factorial(int n)
    {
        int answer=1;
        for(int i=n;i>0;i--)
        {
            answer*=i;
        }
        return answer;       
    }
    
    public static int mutiply(int n)
    {
        int answer=0;
        for(int i=n;i>0;i--)
        {
            answer+=n;
        }
        return answer;
    }
    
    public static int multiplyEvenDigit(int n)
    {
        int total=1;
        int clone=n;
        clone/=10;
        for(int i=5;i>0;i--)
        {
            total*=clone%10;       
            clone/=100;
        }
        return total;
    }
    
    public static boolean divideBy357(int n)
    {
        if(n%3==0||n%5==0||n%7==0)
        {
            return true;    
        }
        return false;
    }
}
