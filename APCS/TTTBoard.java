
import java.util.*;
public class TTTBoard
{
    int board[][];
    public TTTBoard()
    {
        board=new int[3][3];
        board[0][0]=1;
        board[0][1]=2;
        board[0][2]=2;
        board[1][0]=1;
        board[1][1]=2;
        board[1][2]=1;
        board[2][2]=2;
        board[2][1]=2;
    }

    public void placeMove(int row,int column,int player)
    {
        board[row][column]=player;
    }

    public boolean computerBoardFinished()
    {
        if(checkWin(1)||checkWin(2)||checkTie())
        {
            return true;
        }
        return false;
    }

    public boolean checkWin(int player)
    {
        for(int i=0;i<3;i++)
        {
            int count=0;
            for(int j=0;j<3;j++)
            {
                if(board[i][j]==player)
                {
                    count++;
                }
            }
            if(count==3)
            {
                return true;
            }
            else
            {
                count=0;
            }
        }
        for(int i=0;i<3;i++)
        {
            int count=0;
            for(int j=0;j<3;j++)
            {
                if(board[j][i]==player)
                {
                    count++;
                }
            }
            if(count==3)
            {
                return true;
            }
            else
            {
                count=0;
            }
        }
        if(board[0][0]==player&&board[1][1]==player&&board[2][2]==player)
        {
            return true;
        }
        if(board[2][0]==player&&board[1][1]==player&&board[0][2]==player)
        {
            return true;
        }
        return false;
    }

    
    public boolean checkTie()
    {
        int count=0;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(board[i][j]!=0)
                {
                    count++;
                }
            }
        }
        if(count==9)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void printBoard()
    {
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(board[i][j]==0)
                {
                    System.out.print("_ ");
                }
                else if(board[i][j]==1)
                {
                    System.out.print("X ");
                }
                else if(board[i][j]==2)
                {
                    System.out.print("O ");
                }
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public int valueBoard(int player)
    {
        int computer=0;
        if(player==1)
        {
            computer=2;
        }
        else
        {
            computer=1;
        }
        for(int i=0;i<3;i++)
        {
            int count=0;
            for(int j=0;j<3;j++)
            {
                if(board[i][j]==player)
                {
                    count++;
                }
            }
            if(count==3)
            {
                return 1;
            }
            else
            {
                count=0;
            }
        }
        for(int i=0;i<3;i++)
        {
            int count=0;
            for(int j=0;j<3;j++)
            {
                if(board[j][i]==player)
                {
                    count++;
                }
            }
            if(count==3)
            {
                return 1;
            }
            else
            {
                count=0;
            }
        }
        if(board[0][0]==player&&board[1][1]==player&&board[2][2]==player)
        {
            return 1;
        }
        if(board[2][0]==player&&board[1][1]==player&&board[0][2]==player)
        {
            return 1;
        }
         for(int i=0;i<3;i++)
        {
            int count=0;
            for(int j=0;j<3;j++)
            {
                if(board[i][j]==computer)
                {
                    count++;
                }
            }
            if(count==3)
            {
                return -1;
            }
            else
            {
                count=0;
            }
        }
        for(int i=0;i<3;i++)
        {
            int count=0;
            for(int j=0;j<3;j++)
            {
                if(board[j][i]==computer)
                {
                    count++;
                }
            }
            if(count==3)
            {
                return -1;
            }
            else
            {
                count=0;
            }
        }
        if(board[0][0]==computer&&board[1][1]==computer&&board[2][2]==computer)
        {
            return -1;
        }
        if(board[2][0]==computer&&board[1][1]==computer&&board[0][2]==computer)
        {
            return -1;
        }
        int count=0;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(board[i][j]!=0)
                {
                    count++;
                }
            }
        }
        if(count==9)
        {
            return 0;
        }
        return 0;
    }
}
