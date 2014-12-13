
public class omgNuggets
{

    public int binaryToDecimal(int n)
    {
        if(n<2)
        {
            return n;
        }
        else
        {
            return n%10+2*(binaryToDecimal(n/10));
        }

    }


}
