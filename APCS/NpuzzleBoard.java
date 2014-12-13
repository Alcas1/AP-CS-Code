
/**
 * Write a description of class NpuzzleBoard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NpuzzleBoard
{
    private int[][] board;
    public NpuzzleBoard()
    {
        board=new int[4][4];
        
    }
    
    public void fillBoardCorrect()
    {
        int boardNumber=1;
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                if(boardNumber!=16)
                {
                    board[i][j]=boardNumber;
                }
                boardNumber++;
            }
        }
    }
    
    public void fillBoardRandom()
    {

    }
    public void displayBoard()
    {
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                if(board[i][j]<10)
                {
                    if(board[i][j]==0)
                    {
                        System.out.print("__ ");
                    }
                    else
                    {
                        System.out.print(board[i][j]+"  ");
                    }
                }
                else
                {
                    System.out.print(board[i][j]+" ");
                }

            }
            System.out.println();
        }
    }

    public void checkAndMakeMove(int move)
    {
        int emptyV=0;
        int emptyH=0;
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                if(board[i][j]==0)
                {
                    emptyV=i;
                    emptyH=j;
                }
            }
        }
        int top;
        int right;
        int bottom;
        int left;
        if(emptyV<3)
        {
            bottom=emptyV+1;
            if(move==board[bottom][emptyH])
            {
                board[emptyV][emptyH]=move;
                board[bottom][emptyH]=0;
            }
        }
        if(emptyV>0)
        {
            top=emptyV-1;
            if(move==board[top][emptyH])
            {
                board[emptyV][emptyH]=move;
                board[top][emptyH]=0;
            }
        }
        if(emptyH<3)
        {
            right=emptyH+1;
            if(move==board[emptyV][right])
            {
                board[emptyV][emptyH]=move;
                board[emptyV][right]=0;
            }
        }
        if(emptyH>0)
        {
            left=emptyH-1;
            if(move==board[emptyV][left])
            {
                board[emptyV][emptyH]=move;
                board[emptyV][left]=0;
            }
        }
    }


    public boolean checkWin()
    {
        //if(board[0][0])

        return false;
    }

}
