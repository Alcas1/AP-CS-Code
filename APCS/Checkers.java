
import java.util.*;
public class Checkers
{
    //black 1 red 2
    int[][] board;
    boolean pieceCaptured=false;
    public Checkers()
    {
        System.out.println('\f');
        board=new int[8][8];

    }

    public void fillBoard(int player)
    {
        if(player==1)
        {
            for(int j=5;j<8;j+=2)
            {
                for(int i=1;i<8;i+=2)
                {
                    board[i][j]=player;
                }
            }
            for(int i=0;i<8;i+=2)
            {
                board[i][6]=player;
            }
        }
        else if(player==2)
        {
            for(int j=0;j<3;j+=2)
            {
                for(int i=0;i<8;i+=2)
                {
                    board[i][j]=player;
                }
            }
            for(int i=1;i<8;i+=2)
            {
                board[i][1]=player;
            }
        }
    }

    public void printBoard()
    {
        for(int j=0;j<board[0].length;j++)
        {
            for(int i=0;i<board.length;i++)
            {

                if(board[i][j]==0)
                {
                    System.out.print("_ ");
                }
                else if(board[i][j]==1)
                {
                    System.out.print("x ");
                }
                else if(board[i][j]==2)
                {
                    System.out.print("o ");
                }
                else if(board[i][j]==3)
                {
                    System.out.print("X ");
                }
                else if(board[i][j]==4)
                {
                    System.out.print("O ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        Checkers c=new Checkers();
        c.fillBoard(2);
        c.fillBoard(1);
        c.printBoard();
        c.mustMove(1);
        int pieceX=9;
        int pieceY=9;
        int moveX=9;
        int moveY=9;
        int player=2;
        while(!c.win())
        {
            if(player==1)
            {
                player=2;
            }
            else if(player==2)
            {
                player=1;
            }
            System.out.println("player "+player+"'s turn");
            pieceX=9;
            pieceY=9;
            moveX=9;
            moveY=9;
            while(!c.canMove(pieceX,pieceY,moveX,moveY,player))
            {
                System.out.print("x-position:");
                pieceX=s.nextInt();
                System.out.print("y-position:");
                pieceY=s.nextInt();
                System.out.print("x-move:");
                moveX=s.nextInt();
                System.out.print("y-move:");
                moveY=s.nextInt();
            }
            c.clearScreen();
            System.out.println("Moved");
            c.printBoard();
        }
    }

    private void clearScreen()
    {
        System.out.print('\u000C');
    }

    public boolean win()
    {
        int red=0;
        int black=0;
        for(int j=0;j<board[0].length;j++)
        {
            for(int i=0;i<board.length;i++)
            {
                if(board[i][j]==1||board[i][j]==3)
                {
                    red++;
                }
                if(board[i][j]==2||board[i][j]==4)
                {
                    black++;
                }
            }    
        }
        if(red==0||black==0)
        {
            return true;
        }       
        return false;

    }

    public boolean canMove(int pieceX,int pieceY,int moveX,int moveY,int player)
    {
        if(pieceX>7||pieceX<0)
        {
            return false;
        }
        if(pieceY>7||pieceY<0)
        {
            return false;
        }
        if(moveX>7||moveX<0)
        {
            return false;
        }
        if(moveY>7||moveY<0)
        {
            return false;
        }
        if(board[moveX][moveY]!=0)
        {
            return false;
        }
        if(board[pieceX][pieceY]!=player&&board[pieceX][pieceY]!=player+2)
        {
            return false;
        }

        if(player==1)
        {
            if(board[pieceX][pieceY]!=3&&pieceY<moveY)
            {
                return false;
            }
            if(pieceX+1!=moveX&&pieceX-1!=moveX)
            {
                return false;
            }
            if(pieceY-1!=moveY)
            {
                return false;
            }
        }
        else if(player==2)
        {
            if(board[pieceX][pieceY]!=4&&pieceY>moveY)
            {
                System.out.println("omg");
                return false;
            }
            if(pieceX+1!=moveX&&pieceX-1!=moveX)
            {
                System.out.println("hi");
                return false;
            }
            if(pieceY+1!=moveY)
            {
                System.out.println("go");
                return false;
            }
        }
        board[moveX][moveY]=player;
        board[pieceX][pieceY]=0;
        return true;
    }

    public void mustMove(int player)
    {
        if(player==1)
        {
            for(int j=1;j<8;j+=2)
            {
                for(int i=1;i<8;i+=2)
                {
                    board[i][j]=player;
                }
            }
            for(int i=0;i<7;i+=2)
            {
                for(int j=0;j<7;j+=2)
                {
                    board[i][j]=player;
                }
            }

            
        }
    }

}
