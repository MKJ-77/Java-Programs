package Array;
import java.util.*;
/**
 * Write a program to store the name of 10 students along with there marks obtained in comp.App.
 * in  a single dimensional array display the name of the student with highest marks.
 */
public class Find_HighestMarks
{
    public void main ()
    {
        //String tp,nm[]={"M" , "A" ,"S" ,  "P" ,  "V"};
        Scanner sc=new  Scanner(System.in);
        String nm[] = new String [5];
        Scanner ob=new  Scanner(System.in);
        double mk[] = new double [5];
        int i,max;//,mk[]={89  , 78 , 92 , 94 , 88};
        for (i=0;i<=4;i++)
        {
            System.out.println("Enter the Name of The Student");
            nm[i] = sc.next();
            System.out.println("Enter the Marks of The Student in Computer Applications");
            mk[i] = sc.nextDouble();
        }
        for(i=0 , max=0;i<4;i++)
        {
            if(mk[max]<mk[i+1])
            {
                max=i+1;
            }
        }
        System.out.println("Highest Marks: "+mk[max]);
        System.out.println("Name Of the Student: "+nm[max]);
    }
}
