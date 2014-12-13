import java.util.*;
import java.util.Collections;

public class SpellingBee
{

    public static void main(String args[])
    {
        String[] words =   {"hi","hi","omg","erin"};
        List<String> List1 = new ArrayList<String>(words.length);  
        ArrayList<String> newList=new ArrayList<String>();  
        for (String s : words) {  
            List1.add(s);  
        } 
        Scanner s=new Scanner(System.in);
        int wrongWords=99999;
        System.out.println('\f');
        while(wrongWords!=0)
        {
            if(wrongWords!=99999)
            {
                List1=newList;
            }
            ArrayList<String> correct=new ArrayList<String>();  
            ArrayList<String> wrong=new ArrayList<String>();  
            int total=List1.size();
            wrongWords=0;
            for(int i=0;i<total;i++)
            {
                
                System.out.println(List1);
                System.out.println("Word "+(i+1));
                System.out.println("");
                System.out.println(List1.get(i));
                System.out.println("");
                String answer=s.next();
                System.out.println('\f');
                if(!answer.equals(List1.get(i)))
                {
                    System.out.println("WRONG");
                    wrongWords++;
                    wrong.add(List1.get(i));
                }
                else
                {
                    System.out.println("CORRECT!");
                    correct.add(List1.get(i));
                }

            }
            System.out.println('\f');
            System.out.println("");
            System.out.println("Number Right:"+(total-wrongWords));
            System.out.println(correct);
            System.out.println("");
            System.out.println("Number Wrong:"+(wrongWords));
            System.out.println(wrong);
            if(wrongWords!=0)
            {
                newList=wrong;
                System.out.println("");
                System.out.println("Try Again");
            }
            else
            {
                System.out.println("");
                System.out.println("YOU FINISHED!");
            }
        }
    }
}
