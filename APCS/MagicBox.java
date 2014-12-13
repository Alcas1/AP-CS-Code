
import java.util.*;
public class MagicBox
{


    public static boolean hasWon(int[][] magicBox)
    {
        int maxLines=8;
        int index=magicBox[0][0]+magicBox[1][0]+magicBox[2][0];
        if(magicBox[1][0]+magicBox[1][1]+magicBox[1][2]!=index)
        {
            return false;
        }
        else if(magicBox[2][0]+magicBox[2][1]+magicBox[2][2]!=index)
        {
            return false;
        }
        else if(magicBox[0][0]+magicBox[0][1]+magicBox[0][2]!=index)
        {
            return false;
        }
        else if(magicBox[1][0]+magicBox[1][1]+magicBox[1][2]!=index)
        {
            return false;
        }
        else if(magicBox[2][0]+magicBox[2][1]+magicBox[2][2]!=index)
        {
            return false;
        }
        else if(magicBox[0][0]+magicBox[1][1]+magicBox[2][2]!=index)
        {
            return false;
        }
        else if(magicBox[2][0]+magicBox[1][1]+magicBox[0][2]!=index)
        {
            return false;
        }
        return true;
    }

    public static void main(String args[])
    {
        int input=0;
        Scanner s=new Scanner(System.in);
        int[][] magicBox=new int[2][2];
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                input=s.nextInt();
                magicBox[i][j]=input;
            }
        }
        boolean win=false;
        win=hasWon(magicBox);
        if(win)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("no");
        }
        
        
    }


}
