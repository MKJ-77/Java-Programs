package Array;
import  java.util.*;
public class sumof_ele_AandB
{
    /**
     * Create three arrays A, B and C both of size 5. Accept numbers in two arrays A and B. Fill all the elements of array C with the sum of numbers 
     * present in appropriate element of array A and B.
     */
    public  void main()
    {
        int a[] = new int[5];
        int b[] = new int[5];
        int c[] = new int[5];
        int i,j;
        Scanner sc = new Scanner (System.in); 
        for(i=0;i<5;i++)
        {
            System.out.println("Enter the Elements of Array a.");
            a[i]=sc.nextInt();
            System.out.println("Enter the Elements of Array b.");
            b[i]=sc.nextInt();
            c[i]=a[i]+b[i];
        }
        System.out.println("the Elements of Array c.");
        for(i=0;i<=4;i++)
        {
            System.out.println(c[i]);
        }
    }   
}
