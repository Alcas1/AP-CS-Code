
import java.util.*;
public class Bank
{
    private Bankaccount[] accounts;
    public Bank()
    {
        accounts=new Bankaccount[10];
        accounts[0]=new Bankaccount(5000,15000,"Jeff");
        accounts[1]=new Bankaccount(5,10,"Mike");
        accounts[2]=new Bankaccount(60,100,"AJ");
        accounts[3]=new Bankaccount(500000,1000000,"Owen");
        accounts[4]=new Bankaccount(10,3000,"Joe");
        accounts[5]=new Bankaccount(500,100,"Andrew");
        accounts[6]=new Bankaccount(400,900,"Neil");
        accounts[7]=new Bankaccount(8000,20000,"Austin");
        accounts[8]=new Bankaccount(5000,10000,"Perlis");
        accounts[9]=new Bankaccount(700,600000,"Jon");
    }
    
    public void giveAccountsMoney(double r)
    {
        for(int i=0;i<10;i++)
        {
            accounts[i].makeMoney(r);
        }
    }
    
    public void printBank()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println(accounts[i].getCheckingBalance());
        }       
    }
    
    public void transferAccountToAccount(int f, int t,double amount)
    {
        if(accounts[f].getCheckingBalance()>=amount)
        {
            accounts[f].withdraw(amount);
            accounts[t].deposit(amount);
        }
        else
        {
            System.out.println("Not enough money");
        }
        
    }
    
    public static void main(String args[])
    {
        Bank bank=new Bank();
        bank.printBank();
        System.out.println("");
        bank.transferAccountToAccount(0,9,100);
        bank.printBank();
    }
    
    
    
}
