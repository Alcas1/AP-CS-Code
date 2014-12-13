
import java.util.*;
public class Student
{
    private Assignment[] grades;    
    public Student()
    {
        grades=new Assignment[10];
        Random r=new Random();
        for(int i=0;i<10;i++)
        {
            Assignment a=new Assignment(r.nextInt(31)+70,100,"test");
            grades[i]=a;            
        }
    }

    public void printArray()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println(grades[i].getNumerator());
        }
    }
}
