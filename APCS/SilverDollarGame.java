
import java.util.*;
public class SilverDollarGame
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println('\f');
        SilverDollarBoard board=new SilverDollarBoard(15);
        board.populateSpaces();
        board.printBoard();
        while(!board.win())
        {
            System.out.println('\f');
            System.out.println("");
            if(board.getPlayer())
            {
                System.out.println("player 1 turn bish");
            }
            else
            {
                System.out.println("bish 2");
            }
            System.out.println("COINZZZZ???");
            int coinInput=s.nextInt();
            System.out.println("SPACE??????");
            int spaceInput=s.nextInt();
            while(!board.validMove(coinInput,spaceInput))
            {
                System.out.println("COINZZZZ???");
                coinInput=s.nextInt();
                System.out.println("SPACE??????");
                spaceInput=s.nextInt();
            }
            board.move(coinInput,spaceInput);
            board.setPlayerTurn();
            board.printBoard();
        }
        System.out.println("");
        System.out.println("FUCK OFF BISH");
        if(board.getPlayer())
        {
            System.out.println("player 1 win bish");
        }
        else
        {
            System.out.println("bish 2 wins");
        }
    }

    public static void randomComputer()
    {
        Scanner s=new Scanner(System.in);
        System.out.println('\f');
        SilverDollarBoard board=new SilverDollarBoard(15);
        board.populateSpaces();
        Random r=new Random();
        while(!board.win())
        {

            if(!board.getPlayer())
            {
                System.out.println("");
                if(board.getPlayer())
                {
                    System.out.println("player 1 turn bish");
                }
                else
                {
                    System.out.println("bish 2");
                }
                System.out.println("COINZZZZ???");
                int coinInput=s.nextInt();
                System.out.println("SPACE??????");
                int spaceInput=s.nextInt();
                while(!board.validMove(coinInput,spaceInput))
                {
                    System.out.println("COINZZZZ???");
                    coinInput=s.nextInt();
                    System.out.println("SPACE??????");
                    spaceInput=s.nextInt();
                }
                board.move(coinInput,spaceInput);
                board.setPlayerTurn();
                board.printBoard();
                System.out.println("");
            }
            else
            {
                int coinInput=r.nextInt(15);
                int spaceInput=r.nextInt(15);
                while(!board.validMove(coinInput,spaceInput))
                {
                    coinInput=r.nextInt(15);
                    spaceInput=r.nextInt(15);
                }
                board.move(coinInput,spaceInput);
                board.setPlayerTurn();
                board.printBoard();
            }
        }
        if(!board.getPlayer())
        {
            System.out.println("player 1 win bish");
        }
        else
        {
            System.out.println("bish 2 wins");
        }
    }
    
    public static void stupidComputer()
    {
        Scanner s=new Scanner(System.in);
        System.out.println('\f');
        SilverDollarBoard board=new SilverDollarBoard(15);
        board.populateSpaces();
        Random r=new Random();
        while(!board.win())
        {

            if(!board.getPlayer())
            {
                System.out.println("");
                if(board.getPlayer())
                {
                    System.out.println("player 1 turn bish");
                }
                else
                {
                    System.out.println("bish 2");
                }
                System.out.println("COINZZZZ???");
                int coinInput=s.nextInt();
                System.out.println("SPACE??????");
                int spaceInput=s.nextInt();
                while(!board.validMove(coinInput,spaceInput))
                {
                    System.out.println("COINZZZZ???");
                    coinInput=s.nextInt();
                    System.out.println("SPACE??????");
                    spaceInput=s.nextInt();
                }
                //System.out.println('\f');
                board.move(coinInput,spaceInput);
                board.setPlayerTurn();
                board.printBoard();
                System.out.println("");

            }
            else
            {
                
                
                
                
                
                board.move(coinInput,spaceInput);
                System.out.println(coinInput);
                System.out.println(spaceInput);
                board.setPlayerTurn();
                board.printBoard();
            }
        }
        if(!board.getPlayer())
        {
            System.out.println("player 1 win bish");
        }
        else
        {
            System.out.println("bish 2 wins");
        }
    }
    
    public int piecesNotMovable(SilverDollarBoard board)
    {
        for(int
        
        
        
    }
    
    
}
