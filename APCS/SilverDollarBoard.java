
import java.util.*;
public class SilverDollarBoard
{
    boolean board[];
    boolean player1Turn;
    public SilverDollarBoard(int size)
    {
        board=new boolean[size];
        player1Turn=true;
    }

    public int numberOfCoins()
    {
        int coins=0;
        for(int i=0;i<board.length;i++)
        {
            if(board[i])
            {
                coins++;
            }
        }
        return coins;
    }

    public void printBoard()
    {
        for(int i=0;i<board.length;i++)
        {
            if(board[i])
            {
                System.out.print("[X]");
            }
            else
            {
                System.out.print("[ ]");
            }

        }
    }

    public void populateSpaces()
    {
        Random r=new Random();
        for(int i=0;i<board.length;i++)
        {
            if(r.nextInt(2)==0)
            {
                board[i]=true;
            }
            else
            {
                board[i]=false;
            }
        }
    }

    public void move(int coin,int space)
    {
        board[coin]=false;
        board[space]=true;
    }

    public boolean validMove(int coin,int space)
    {
        if(coin==space)
        {
            return false;
        }
        if(coin>board.length||space>board.length)
        {
            return false;
        }
        if(board[coin])
        {
            if(coin<space)
            {
                return false;
            }
            else
            {
                for(int i=coin-1;i>=space;i--)
                {
                    if(board[i])
                    {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public boolean win()
    {

        for(int i=0;i<numberOfCoins();i++)
        {
            if(!board[i])
            {
                return false;
            }
        }
        return true;
    }

    public boolean getPlayer()
    {
        return player1Turn;
    }

    public void setPlayerTurn()
    {
        player1Turn=!player1Turn;
    }

    public boolean 

    
}
