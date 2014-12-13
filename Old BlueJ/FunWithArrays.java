import java.util.*;
public class FunWithArrays
{

    public static void findSmallest()
    {
        int[] myArray = new int[20];
        Random r=new Random();
        int smallest=200;
        for(int counter=0;counter<20;counter++)
        {
            myArray[counter]=r.nextInt(100);
        }
        for(int counter=0;counter<20;counter++)
        {
            System.out.println(myArray[counter]);           
        }
        for(int counter=0;counter<20;counter++)
        {
            if(myArray[counter]<smallest)
            {
                smallest=myArray[counter];
            }
        }
        System.out.println(smallest);
    }
    
    public static void biggestChange()
    {
        int[] myArray = new int[20];
        Random r=new Random();
        int biggest=0;
        for(int counter=0;counter<20;counter++)
        {
            myArray[counter]=r.nextInt(100);
        }
        for(int counter=0;counter<20;counter++)
        {
            System.out.println(myArray[counter]);           
        }
        for(int counter=1;counter<20;counter++)
        {
            if(myArray[counter]-myArray[counter-1]>biggest)
            {
                biggest=myArray[counter]-myArray[counter-1];
            }
        }       
        System.out.println(biggest);
    }
    
    
    
    
}
