
import java.util.Scanner;
import java.util.*;
public class StringSets
{
    public static void main(String args[])
    {  
        String combos="abc";
        String editing="";
        ArrayList<String> toPrint = StringRecurse(combos,0,editing);
        for(int i=0; i<toPrint.size(); i++) {
            System.out.println(toPrint.get(i));
        }

    }

    public static ArrayList<String> StringRecurse(String start,int index,String editing)
    {      
        ArrayList<String> returning = new ArrayList<String>();
        if(start.length()==index)
        {
            returning.add("");
            return returning;
        }
        else
        {
            for(int i=0;i<returning.size();i++)
            {
                String test=returning.get(i); 
                test+=start.substring(0,1);
                returning.add(test);
            }
            return StringRecurse(start.substring(1,start.length()));
        }
    }
    
    public static ArrayList<String> Davids(String start)
    {
        ArrayList<String> a = new ArrayList<String>();
        
        
        
        return a;
    }
    
    
}
