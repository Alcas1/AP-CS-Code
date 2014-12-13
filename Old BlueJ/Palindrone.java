

public class Palindrone
{
    public static boolean isPalindrome(String s)
    {
        if(s.length()<2)
        {
            return true;
        }
        else
        {
            if(!(s.substring(0,1).equals(s.substring(s.length()-1,s.length()))))
            {
                return false;          
            }
            return isPalindrome(s.substring(1,s.length()-1));
        }
    }
    
    public static String reverse(String s)
    {
        if(s.length()<2)
        {
            return s;            
        }
        else
        {
            return s.substring(s.length()-1,s.length())+reverse(s.substring(1,s.length()-1))+s.substring(0,1);
        }    
    }
}
