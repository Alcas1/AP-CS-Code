
import java.util.Scanner;
import java.util.*;
public class PrimeFactors
{

    public static ArrayList<Integer> getFactors(int n)
    {
        ArrayList<Integer> factors=new ArrayList<Integer>(); 
        int divisor=2;
        while(n>1){
            factors.add(divisor); 
            while(n%divisor == 0)
            {
                if(n>1 && divisor >= n)
                {
                    factors.add(n);
                }
                divisor+=1;
            }
            n/=divisor;
        }
        System.out.println(factors);
        return factors;
    }

    public static boolean isPrime(int n)
    {
        for(int i=1;i<(n);i++)
        {
            if(n%i==0&&i>1)
            {
                return false;
            }
        }       
        return true;
    }

    public static int primeNum(int primeNumber)
    {
        int prime=2;
        int returningPrime=0;
        while(primeNumber>0)
        {
            if(isPrime(prime))
            {
                primeNumber--;
                returningPrime=prime;
            }
            prime++;
        }
        return returningPrime;
    }

    public static void printPrimes(int primeNumber)
    {
        if(isPrime(primeNumber))
        {
            for(int i=primeNumber-1;i>1;i--)
            {
                if(isPrime(i))
                {
                    System.out.println(i);
                }              
            } 
        }
        else
        {
            System.out.println("Not a Prime");
        }
    }

    public static int nextPrime(int primeNumber)
    {
        int nextPrime=0;
        int n=primeNumber+1;
        if(isPrime(primeNumber))
        {
            while(true)
            {
                if(isPrime(n))
                {
                    return n;
                }
                n++;
            }

        }
        else
        {
            System.out.println("Not a Prime");
        }
        return 0;
    }

    public static int closestPrime(int n)
    {
        int higherPrime=0;
        boolean primeTest=false;
        int lowerPrime=0;
        int clone=n;
        while(!primeTest)
        {
            if(isPrime(clone))
            {
                higherPrime=clone;
                primeTest=true;
            }
            clone++;
        }
        primeTest=false;
        clone=n;
        while(!primeTest)
        {
            if(isPrime(clone))
            {
                lowerPrime=clone;
                primeTest=true;
            }
            clone--;
        }
        if(Math.abs(higherPrime-n)>=Math.abs(n-lowerPrime))
        {
            return lowerPrime;
        }
        else
        {
            return higherPrime;
        }

    }
    
    public static void primeFactors(int n)
    {
        int test=0;
        if(isPrime(n))
        {
            System.out.println(n);
        }
        else
        {
            for(int i=2;i<n/2;i++)
            {
                if((n%i)==0)
                {
                    System.out.println(i);
                    test=i;
                    break;
                }
            }
            primeFactors(n/test);
        }
    }
    
    
    
    

}
