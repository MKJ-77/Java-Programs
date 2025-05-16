package Array;
import  java.util.*;
public class sumOf_odd_even_positionNum
{
    public void main()
    {
        /**
         * Accept 10 numbers into an array and then calculate the sum of numbers present in odd positions and even positions respectively.
         */
        int i,se=0,so=0,no[]=new  int[10];
        Scanner sc=new  Scanner(System.in);
        System.out.println("Enter 10 Numbers :");
        for(i=0;i<=9;i++)
        {
            no[i]=sc.nextInt();
        }
        for(i=0;i<=9;i++)
        {
            if(i%2==0)
            {
                se+=no[i];
            }
            else
            {
                so+=no[i];
            }
        }
        System.out.println("Sum of even index: "+se);
        System.out.println("Sum of odd index: "+so);
    }
}
