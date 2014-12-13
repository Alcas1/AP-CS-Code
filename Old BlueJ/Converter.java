
import java.util.Scanner;
import java.util.*;
public class Converter
{
    public static String milesToKilometers(double miles) {       
        return miles*1.60934+" Kilometers";
    }   

    public static String kilometersToMiles(double kilometers){
        return kilometers*0.621+" Miles";
    }

    public static String inchesToFeet(double totalInches) {
        int feet=0;
        int inches=0;
        while(totalInches-12>=0)
        {
            feet++;
            totalInches-=12;
        }
        while(totalInches-1>=0)
        {
            inches++;
            totalInches-=1;
        }
        return feet+" feet "+inches+" inches";
    }   

    public static String feetToInches(double feet) {
        return feet*12+" Inches";
    }

    public static ArrayList baseTenToBinary(int number)
    { 
        int power=getPower(number);
        return getList(number,power);
    }

    public static ArrayList getList(int number,int power){
        ArrayList binary = new ArrayList();  
        for(int i=power;i>=0;i--)
        {
            if(Math.pow(2,i)<=number)
            {
                number-=Math.pow(2,i);
                binary.add(1);
            }
            else
            {
                binary.add(0);   
            }
        }               
        return binary; 
    }

    public static int getPower(int number)
    {
        int power=0;
        for(int i=0;(Math.pow(2,i))<=number;i++)
        {
            power=i;
        }  
        return power;
    }                   

    public static int binaryToBaseTen(int binary)
    {
        int countOfDigits=0;
        int number=0;
        int clone=binary;    
        while(clone>10)
        {
            countOfDigits++;
            clone/=10;
        }
        for(int i=0;i<=countOfDigits;i++)
        {
            if(binary%10==1)
            {
                number+=Math.pow(2,i);
                binary/=10;
            }
            else
            {
                binary/=10;
            }

        }
        return number;
    }

    public static String binaryConvertToBase(int originalBase,int newBase,int convertNumber)
    {    
        int countOfDigits=0;
        int number=0;
        int clone=convertNumber;    
        while(clone>0)
        {
            countOfDigits++;
            clone/=10;
        }
        clone=convertNumber;  
        for(int i=0;i<=countOfDigits;i++)
        {
            if(clone%10!=0)
            {
                number+=Math.pow(originalBase,i)*(clone%10);
                clone/=10;
            }
            else
            {
                clone/=10;
            }
        }
        int power=0;
        for(int i=0;(Math.pow(newBase,i))<=number;i++)
        {
            power=i;
        }  
        int[] convertedNumber=new int[power+1];
        int counter=0;
        for(int i=power;i>=-1;i--)
        {

            while(Math.pow(newBase,i)<=number)
            {
                number-=Math.pow(newBase,i);
                convertedNumber[counter]+=1;                     
            }
            counter++;
        }             

        return Arrays.toString(convertedNumber); 

    }

    public static int timeToSeconds(int hours,int minutes,int seconds)
    {
        int time=0;
        time=hours*3600+minutes*60+seconds;
        return time;
    }

    public static String secondsToTime(int totalSeconds)
    {
        int hours=0;
        int minutes=0;
        int seconds=0;
        while(totalSeconds-3600>=0)
        {
            hours++;
            totalSeconds-=3600;
        }
        while(totalSeconds-60>=0)
        {
            minutes++;
            totalSeconds-=60;
        }
        seconds=totalSeconds;
        return hours+" hours "+minutes+" minutes "+seconds+" seconds ";
    }

    public static void timeToSeconds2(int hours,int minutes,int seconds)
    {
        System.out.println(seconds/3600);
        System.out.println(seconds%3600/60);
        System.out.println(seconds%60); 
    }
    
    public static int hpMoneyToKnuts(int galleons,int sickles,int knuts)
    {      
        int totalKnuts=0;
        totalKnuts=galleons*493+sickles*29+knuts;
        return totalKnuts;
    }

    public static String knutsToHpMoney(int totalKnuts)
    {
        int galleons=0;
        int sickles=0;
        int knuts=0;
        while(totalKnuts-493>=0)
        {
            galleons++;
            totalKnuts-=493;
        }
        while(totalKnuts-29>=0)
        {
            sickles++;
            totalKnuts-=29;
        }
        while(totalKnuts-1>=0)
        {
            knuts++;
            totalKnuts-=1;
        }
        return galleons+" galleon "+sickles+" sickles "+knuts+" knuts";
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("");
        while(true){
            System.out.println("0 is base ten to binary, 1 is binary to base ten, 2 is binary base conversion");
            System.out.println("3 is time to seconds, 4 is seconds to time, 5 miles to kilometers");
            System.out.println("6 is kilometers to miles, 7 is inches to feet, 8 is feet to inches");
            System.out.println("9 is hp money to knuts, 10 knuts to hp money");
            String choice = s.next();   
            if(choice.equals("0"))
            {
                int input = s.nextInt();
                System.out.println(baseTenToBinary(input));
            }
            else if(choice.equals("1"))
            {
                int input = s.nextInt();
                System.out.println(binaryToBaseTen(input));
            }
            else if(choice.equals("2"))
            {
                System.out.println("base of initial");
                int base1 = s.nextInt();
                System.out.println("base of conversion");
                int base2 = s.nextInt();
                System.out.println("Number of Conversion");
                int conversionNumber = s.nextInt();
                System.out.println(binaryConvertToBase(base1,base2,conversionNumber));
            }
            else if(choice.equals("3"))
            {
                System.out.println("Hours");
                int hours=s.nextInt();
                System.out.println("Minutes");
                int minutes=s.nextInt();
                System.out.println("Seconds");
                int seconds=s.nextInt();
                System.out.println(timeToSeconds(hours,minutes,seconds));
            }
            else if(choice.equals("4"))
            {
                System.out.println("Seconds");
                int seconds=s.nextInt();
                System.out.println(secondsToTime(seconds));
            }
            else if(choice.equals("5"))
            {
                System.out.println("Miles");
                int miles=s.nextInt();
                System.out.println(milesToKilometers(miles));
            }
            else if(choice.equals("6"))
            {
                System.out.println("Kilometers");
                int kilometers=s.nextInt();
                System.out.println(kilometersToMiles(kilometers));
            }
            else if(choice.equals("7"))
            {
                System.out.println("Inches");
                int inches=s.nextInt();
                System.out.println(inchesToFeet(inches));
            }
            else if(choice.equals("8"))
            {
                System.out.println("Feet");
                int feet=s.nextInt();
                System.out.println(feetToInches(feet));
            }
            else if(choice.equals("9"))
            {
                System.out.println("Galleons");
                int galleons=s.nextInt();
                System.out.println("Sickles");
                int sickles=s.nextInt();
                System.out.println("Knuts");
                int knuts=s.nextInt();
                System.out.println(hpMoneyToKnuts(galleons,sickles,knuts));

            }
            else if(choice.equals("10"))
            {
                System.out.println("Knuts");
                int knuts=s.nextInt();
                System.out.println(knutsToHpMoney(knuts));
            }
            
            //System.out.print('\f');
            System.out.println("");
        }
    }   
}
