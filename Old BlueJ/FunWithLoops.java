
import java.util.Scanner;
import java.util.*;
public class FunWithLoops
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int input=s.nextInt();
        int output=makeSum(input);
        System.out.println(output);
        System.out.println("hi".indexOf(5));
    }

    public static int makeSum(int highest)
    {
        int sum=0;
        for(int i=1;i<=highest;i++)
        {
            sum+=i;
        }
        return sum;
    }

    public static int countEvens(int number)
    {
        int evens=0;
        for(int i=number;i>0;i/=10)
        {
            System.out.println(i);
            System.out.println(i%10);
            System.out.println(i%2);
            if((i%10)%2==0)
            {
                evens++;
            }
        }
        return evens;
    }

    public static void multiplicationTable()
    {
        for(int i=12;i>0;i--)
        {
            for(int j=12;j>0;j--)
            {
                System.out.println(i+"X"+j+"  "+i*j);
            }
        }
    }

    public static boolean isPalindrome(String test)
    {
        while(test.length()>1)
        {   
            if(test.substring(0,1).equals(test.substring(test.length()-1,test.length())))
            {
                test=test.substring(1,test.length()-1);
            }
            else 
            {
                return false;
            }
        }
        return true;    
    }

    public static int getUniqueCharacters(String s)
    {
        int uniqueCharacters=0;
        for(int i=0;i<s.length();i++)
        {
            if(i==s.lastIndexOf(s.substring(i,i+1)))
            {
                uniqueCharacters++;
            }            
        }
        return uniqueCharacters;
    }
    
    
}
