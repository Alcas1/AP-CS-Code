
import java.util.*;
public class Assignment
{
    private int denominator;
    private int numerator;
    private String type;
    public Assignment(int n,int d,String t) 
    {
        denominator=d;
        numerator=n;
        type=t;
    }

    public int getNumerator()
    {
        return numerator;
    }
    public int getDenominator()
    {
        return denominator;
    }
}
