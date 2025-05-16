package Array;
import java.util.*;
/**
 * initialize the array till n numbers in a sorted order.then save the numbers in such a 
 * way that the each nmber has only one presence.
 */
public class print1presence
{
    public void main()
    {
        System.out.println("Enter the value of n");
        Scanner sc= new Scanner (System.in);
        int n = sc.nextInt();
        int i,j,k=n,A[] = new int[n];
        for (i=0;i<n;i++)
        {
            A[i]=sc.nextInt();
        }
        for (i=0;i<n-1;i++)
        {
            if(A[i]==A[i+1])
            {
                k--;
                for (j=i ;j<=n-2;j++)
                {
                    A[j]=A[j+1];
                }
                if(A[i]==A[i+1])
                    continue;
            }
        }
        for (i=0;i<k;i++)
        {
            System.out.println(A[i]);
        }
    }
}
