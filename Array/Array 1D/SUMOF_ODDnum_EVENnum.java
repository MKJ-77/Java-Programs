package Array;
import  java.util.*;
public class SUMOF_ODDnum_EVENnum
{
    /**
     * Write a program in Java to store 20 numbers (even and odd numbers)
     * in a Single Dimensional Array (SDA). 
     * Calculate and display the sum of all even numbers 
     * and all odd numbers separately.
     */
    public void main()
    {
        Scanner sc=new  Scanner(System.in);
        System.out.println("Enter 20 Numbers :");
        int i,l,Es=0,Os=0,nu[]=new int [20]  ;
        for(i=0;i<20;i++)
        {
            nu[i]=sc.nextInt();
        }
        for(i=0;i<20;i++)
        {
            if(nu[i]%2==0)
            {
                Es+=nu[i];
            }
            else
            {
                Os+=nu[i];
            }
        }
        System.out.println("Sum of Even  Numbers : "+Es);
        System.out.println("Sum of Odd  Numbers : "+Os);
    }
}
