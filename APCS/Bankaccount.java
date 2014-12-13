
import java.util.*;
public class Bankaccount
{
    private double checkingMoney;
    private double savingsMoney;
    private String name;

    
    public Bankaccount(double c, double s, String n)
    {
        checkingMoney=c;
        savingsMoney=s;
        name=n;

    }

    public double getCheckingBalance()
    {
        return checkingMoney;   
    }

    public double getSavingsBalance()
    {
        return savingsMoney;   
    }

    public String getName()
    {
        return  name;
    }

    public double deposit(double n)
    {
        checkingMoney=checkingMoney+n;
        return checkingMoney;
    }

    public double withdraw(double n)
    {
        checkingMoney=checkingMoney-n;      
        return checkingMoney;
    }

    public double makeMoney(double rate)
    {
        savingsMoney*=(rate+1);
        return savingsMoney;
    }

    public double transferMoney(String n,double money)
    {
        if(n.equals("Checking"))
        {
            if(money>savingsMoney)
            {
                System.out.println("Sucks to suck");
            }
            else
            {
                checkingMoney+=money;
                savingsMoney-=money;
            }
        }
        else
        {
            if(money>checkingMoney)
            {
                System.out.println("Sucks to suck");
            }
            else
            {
                checkingMoney-=money;
                savingsMoney+=money;
            }
        }
        return money;
    }
}
