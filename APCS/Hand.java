import java.util.*;
public class Hand
{
    int[] cards;
    int index=0;
    int index1=0;
    int index2=0;
    int index3=0;
    int index4=0;
    public Hand() {
        Random r = new Random();
        cards = new int[5];
        for(int counter = 0; counter < 5; counter++){
            cards[counter] = r.nextInt(13);
        }
    }

    public void sort(){
        int[] temp = new int[5];
        for(int i = 0; i<5; i++){
            int index = -1;
            int lowest = 100;
            for(int j = 0; j < 5; j++){
                if(cards[j]<lowest){
                    index = j;
                    lowest = cards[j];
                }
            }
            temp[i] = lowest;
            cards[index] = 100;
        }
        cards = temp;
    }

    public boolean fiveOfAKind()
    {
        if(cards[0]==cards[1]&&cards[1]==cards[2]&&cards[2]==cards[3]&&cards[3]==cards[4])
        {
            return true;
        }
        return false;
    }

    public boolean straight()
    {
        if(cards[0]+1==cards[1]&&cards[1]+1==cards[2]&&cards[2]+1==cards[3]&&cards[3]+1==cards[4])
        {
            index=4;
            return true;
        }
        return false;
    }

    public boolean hasPair()
    {
        if(cards[0]==cards[1])
        {
            index=0;
            index1=4;
            index2=3;
            index3=2;
            return true;
        }
        else if(cards[1]==cards[2])
        {
            index=1;
            index1=4;
            index2=3;
            index3=0;
            return true;
        }
        else if(cards[2]==cards[3])
        {
            index=2;
            index1=4;
            index2=1;
            index3=0;
            return true;
        }
        else if(cards[3]==cards[4])
        {
            index=3;
            index1=2;
            index2=1;
            index3=0;
            return true;
        }       
        return false;
    }

    public boolean fullHouse()
    {
        if(cards[0]==cards[1]&&cards[1]==cards[2]&&cards[3]==cards[4]&&cards[0]!=cards[4])
        {
            index=0;
            index1=3;
            return true;
        }
        if(cards[2]==cards[3]&&cards[3]==cards[4]&&cards[1]==cards[2]&&cards[0]!=cards[4])
        {
            index=2;
            index1=1;
            return true;
        }
        return false;
    }

    public boolean fourOfAKind()
    {
        if(cards[0]==cards[1]&&cards[1]==cards[2]&&cards[2]==cards[3])
        {
            index=0;
            index1=4;
            return true;
        }
        if(cards[1]==cards[2]&&cards[2]==cards[3]&&cards[3]==cards[4])
        {
            index=1;
            index1=0;
            return true;
        }
        return false;
    }

    public boolean hasTwoPair()
    {
        if(cards[0]==cards[1]&&cards[2]==cards[3])
        {
            index=2;
            index1=0;
            index2=4;
            return true;
        }
        if(cards[1]==cards[2]&&cards[3]==cards[4])
        {
            index=3;
            index1=2;
            index2=0;
            return true;
        }
        if(cards[0]==cards[1]&&cards[3]==cards[4])
        {
            index=3;
            index1=0;
            index2=2;
            return true;            
        }
        return false;
    }

    public boolean threeOfAKind()
    {
        if(cards[0]==cards[1]&&cards[1]==cards[2])
        {
            index=0;
            index1=4;
            index2=3;
            return true;
        }
        if(cards[1]==cards[2]&&cards[2]==cards[3])
        {
            index=1;
            index1=4;
            index2=0;
            return true;
        }
        if(cards[2]==cards[3]&&cards[3]==cards[4])
        {
            index=2;
            index1=1;
            index2=0;
            return true;
        }
        return false;
    }

    public void print()
    {
        for(int i=0;i<5;i++)
        {
            System.out.print(cards[i]+" ");
        }
    }

    public int highestCard()
    {
        index=4;
        index1=3;
        index2=2;
        index3=1;
        index4=0;
        return cards[4];
    }

    public static void main(String args[])
    {
        Hand player0 = new Hand();
        Hand player1 = new Hand();
        Hand player2 = new Hand();
        Hand player3 = new Hand();
        Hand player4 = new Hand();
        Hand player5 = new Hand();
        Hand[] hands=new Hand[6];
        hands[0]=player0;
        hands[1]=player1;
        hands[2]=player2;
        hands[3]=player3;
        hands[4]=player4;
        hands[5]=player5;
        clearScreen();
        System.out.println("");
        for(int i=0;i<hands.length;i++)
        {
            hands[i].sort();
            hands[i].print();
            System.out.println("");
        }
        double highestHand=0;
        int winner=0;
        for(int i=0;i<hands.length;i++)
        {
            if(highestHand<hands[i].highestHand())
            {
                highestHand=hands[i].highestHand();
                winner=i;
            }
            System.out.println("");
        }
        System.out.println("Player "+(winner+1)+" Wins");
        System.out.println("With a:");
        System.out.println(hands[winner].printHighestHand());
    }

    public static void clearScreen()
    {
        System.out.print('\u000C');
    }

    public double highestHand()
    {
        if(fiveOfAKind())
        {
            return 100000000000.0+cards[0]*100000000.0;
        }
        else if(fourOfAKind())
        {
            return 90000000000.0+cards[index]*100000000+cards[index1]*1000000;
        }
        else if(fullHouse())
        {
            return 80000000000.0+cards[index]*100000000+cards[index1]*1000000;
        }
        else if(straight())
        {
            return 70000000000.0+cards[index]*100000000;
        }
        else if(threeOfAKind())
        {
            return 60000000000.0+cards[index]*100000000+cards[index1]*1000000+cards[index2]*10000;
        }
        else if(hasTwoPair())
        {
            return 50000000000.0+cards[index]*100000000+cards[index1]*1000000+cards[index2]*10000;
        }
        else if(hasPair())
        {
            return 40000000000.0+cards[index]*100000000+cards[index1]*1000000+cards[index2]*10000+cards[index3]*1000;
        }
        else
        {
            return 10000000000.0+cards[index]*100000000+cards[index1]*1000000+cards[index2]*10000+cards[index3]*1000+cards[index4]*10;
        }

    }

    public void printHighestHand()
    {
        if(fiveOfAKind())
        {
            System.out.println("Five of a Kind");
        }
        else if(fourOfAKind())
        {
            System.out.println("Four of a Kind");
        }
        else if(fullHouse())
        {
            System.out.println("Full House");
        }
        else if(straight())
        {
            System.out.println("Straight");
        }
        else if(threeOfAKind())
        {
            System.out.println("Three of a kind");
        }
        else if(hasTwoPair())
        {
            System.out.println("Two Pairs");
        }
        else if(hasPair())
        {
            System.out.println("Pair!");
        }
        else
        {
            System.out.println("Nothing "+highestCard());
        }

    }
}
