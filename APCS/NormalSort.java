
import java.util.*;
public class NormalSort
{
    public static void main(String args[])
    {
        ArrayList<Integer> sortList=new ArrayList<Integer>();
        Random r=new Random();
        for(int i=0;i<10;i++)
        {
            sortList.add(r.nextInt(50));
        }
        int smallest=50;
        for(int i=0;i<sortList.size();i++)
        {

            if(smallest>sortList.get(i))
            {
                sortList.set(0,sortList.get(i));
                smallest=sortList.get(i);
                sortList.remove(i);
            }

        }
        System.out.println(sortList);

    }

}
