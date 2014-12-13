
import java.util.Scanner;
import java.util.*;
public class TestModuleEncoder
{
    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);
        System.out.println("0 for encoding, 1 for encoding, 2 for pivot");
        System.out.println("3 for test run");
        Encoder encoder = new Encoder();
        while(true)
        {
            {
                
                
                String in = s.next();
                int test=s.nextInt();
                String answer=encoder.pivot(in,test);
                System.out.println(answer);
            }
        }

        
    }
}
