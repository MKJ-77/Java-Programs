package Array;
import java.util.*;
public class SuperSet_Of_2string
{   
    /**
     *   Write a program to store 6 elements in an array P,
     *   and 4 elements in an array Q and 
     *   produce a third array R, containing all elements 
     *   of array P and Q.
     **/
    public void main()
    {
        String P[] = new String[6];
        String Q[] = new String[4];
        String R[] = new String[10];
        int i,j;
        Scanner sc = new Scanner (System.in); 
        System.out.println("Enter the Elements of Array P.");
        for(i=0;i<6;i++)
        {
            P[i]=sc.next();
            if(i<=5)
                R[i]=P[i];
        }
        System.out.println("Enter the Elements of Array Q.");
        for(i=0,j=6;i<4;i++,j++)
        {
            Q[i]=sc.next();
            if(i<=4)
                R[j]=Q[i];
        }
        System.out.println("Enter the Elements of Array R.");
        for(i=0;i<=9;i++)
        {
            System.out.print(R[i]+" ");
        }
    }   
}
