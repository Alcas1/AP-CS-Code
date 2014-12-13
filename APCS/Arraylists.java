
import java.util.*;
public class Arraylists
{
    public static void main(String args[])
    {
        ArrayList<Integer> list =new ArrayList<Integer>();
        int counter=1;
        list.add(1);
        list.add(1);
        while(list.get(list.size()-1)<4000000)
        {
            list.add((list.get(list.size()-1)+list.get(list.size()-2)));
        }

        int total=0;
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i)%2==0)
            {
                total+=list.get(i);
            }
        }
        System.out.println(total);
    }
}
