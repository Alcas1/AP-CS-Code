
import java.util.*;
public class Npuzzle
{
    public static void main(String args[])
    {
        NpuzzleBoard gui=new NpuzzleBoard();
        Scanner s=new Scanner(System.in);
        System.out.println('\f');
        gui.displayBoard();
        while(!gui.checkWin())
        {
            int move=s.nextInt();
            gui.checkAndMakeMove(move);
            System.out.println('\f');
            gui.displayBoard();
        }

    }
}
