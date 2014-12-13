
import java.util.*;
public class BulgarianSolitaire
{
    public static void main(String args[])
    {
        Random r=new Random();
        ArrayList<Integer> piles= new ArrayList<Integer>();
        int cards=45;
        int counter=0;
        while(cards>0)
        {
            int amount=r.nextInt(45)+1;
            if(cards-amount<0)
            {
                amount=cards;
            }
            piles.add(amount);
            cards-=amount;  
            counter++;
        }
        System.out.println(piles);
        counter=0;
        while(!checkWin(piles))
        {         
            int total=0;
            for(int i=0;i<piles.size();i++)
            {
                if(piles.get(i)==0)
                {
                    piles.remove(i);
                }
                if(piles.get(i)>0)
                {
                    piles.set(i,piles.get(i)-1);
                    total++;
                }
            }
            piles.add(total);
            System.out.println(piles);           
            counter++;
        }
        System.out.println(counter);
    }

    public static boolean checkWin(ArrayList<Integer> piles)
    {
        if(piles.get(0)==0&&piles.get(1)==1&&piles.get(2)==2&&piles.get(3)==3&&piles.get(4)==4&&piles.get(5)==5&&piles.get(6)==6&&piles.get(7)==7&&piles.get(8)==8&&piles.get(9)==9)
        {
            return true;
        }
        return false;
    }
}
