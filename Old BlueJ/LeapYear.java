
/**
 * Write a description of class isLeapYear here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LeapYear
{
    public static boolean isLeapYear(int n)
    {
        if(n>1582)
            if(n%4==0)
            {
                if(n%400==0)
                {
                    return true;	
                }
                else if(n%100==0)
                {
                    return false;
                }
                else
                {
                    return true;
                }
        }
        return false;
    }
}


