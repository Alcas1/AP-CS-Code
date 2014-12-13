
import java.util.Scanner;
import java.util.*;
public class MoneyChange
{

    public static void coinComboRecursion(int money)
    {
        System.out.print('\f');
        String coins=new String();
        //repeatCatch(money,coins);
        qDNP(money,coins);
    }

    public static void repeatCatch(int money,String coins)
    {
        if(money<9)
        {
            if(money<5)
            {
                for(int i=0;i<money;i++)
                {
                    coins+="P";
                }
                System.out.println(coins);
                System.exit(0);
            }
            else
            {
                coins+="N";
                for(int i=0;i<=money%5;i++)
                {            
                    coins+="P";
                }            
                for(int i=0;i<=money;i++)
                {
                    coins+="P";
                }
                System.out.println(coins);
                System.exit(0);
            }    
        }
    }

    public static void p(int money,String coins)
    {
        if(money==0)
        {
            System.out.println(coins);
        }
        else if(money>=1)
        {
            p(money-1,coins+"P");
        }

    }

    public static void nP(int money,String coins)
    {
        if(money==0)
        {
            System.out.println(coins);
        }
        else if(money<5)
        {
            p(money-1,coins+"P");
        }
        else if(money>=5)
        {           
            nP(money-5,coins+"N");
            p(money-1,coins+"P");
        }

    }

    public static void dNP(int money,String coins)
    {
        if(money==0)
        {
            System.out.println(coins);
        }
        else if(money<5)
        {
            p(money-1,coins+"P");
        }
        else if(money<10)
        {
            nP(money-5,coins+"N");
            p(money-1,coins+"P");
        }
        else if(money>=10)
        {
            dNP(money-10,coins+"D");
            nP(money-5,coins+"N");
            p(money-1,coins+"P");
        }       
    }

    public static void qDNP(int money,String coins)
    {
        if(money==0)
        {
            System.out.println(coins);
        }
        else if(money<5)
        {
            p(money-1,coins+"P");
        }
        else if(money<10)
        {
            nP(money-5,coins+"N");
            p(money-1,coins+"P");
        }       
        else if(money<25)
        {
            dNP(money-10,coins+"D");
            nP(money-5,coins+"N");
            p(money-1,coins+"P");
        }
        else if(money>=25)
        {            
            qDNP(money-25,coins+"Q");
            dNP(money-10,coins+"D");           
            nP(money-5,coins+"N");
            p(money-1,coins+"P");

        }
    }
}