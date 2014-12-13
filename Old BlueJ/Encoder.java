import java.util.Scanner;
import java.util.*;
public class Encoder
{
    public String encode(String s)
    {
        String toReturn=s;
        toReturn=toReturn.replace('J','E');
        toReturn=toReturn.replace('P','C');
        toReturn=toReturn.replace('F','D');
        return toReturn;
    }
    
    public String decode(String s)
    {
        return "";
    }
    
    public String pivot(String s,int n)
    {        
        String part1=s.substring(0,n);
        String part2=s.substring(n,s.length());
        return part2+part1;       
    }

    public static void main(String args[]){

    }   
}
