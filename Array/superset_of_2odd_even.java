package Array;
import java.util.*;
public class superset_of_2odd_even
{    
    public void main()
    {
        /**
         * Create two arrays A and B of size 5 and C of size 10. Accept numbers in two arrays A and B. Fill the array C in such a way that the all odd 
         * positions occupy the numbers present in array A and all even positions occupy the numbers present in array B.
         */
        int a[] = new int[5];
        int b[] = new int[5];
        int c[] = new int[10];
        int i,j;
        Scanner sc = new Scanner (System.in);
        for(i=0;i<5;i++)
        {
            System.out.println("Enter the Element of Array A.");
            a[i]=sc.nextInt();
            System.out.println("Enter the Element of Array B.");
            b[i]=sc.nextInt();
            if(i<4)
            continue;
            for(j=0,i=0;j<9;j+=2,i++)
            { 
                c[j]=b[i];
                c[j+1]=a[i];
            }
            break;
        }
        System.out.println(" the Elements of Array C.:");
        for(i=0;i<=9;i++)
        {
            System.out.println(c[i]);
        }
    }   
}