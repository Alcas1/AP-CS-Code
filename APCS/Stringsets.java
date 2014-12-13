import java.util.*;
public class Stringsets
{
    public static void main(String args[])
    {
        ArrayList combos=new ArrayList();
        combos.add("");
        System.out.println(sort("xyz",combos));
        
        
    }
    public static ArrayList<String> sort(String combo,ArrayList<String> sets)
    {
        if(combo.length()==0)
        {
            return sets;
        }
        else
        {
            ArrayList returning=new ArrayList<String>();
            for(int i=sets.size();i>0;i--)
            {
                returning.add(sets.get(i-1)+combo.substring(0,1));        
            }
            sets.addAll(returning);
            return sort(combo.substring(1,combo.length()),sets);
        }
        
    }

}
