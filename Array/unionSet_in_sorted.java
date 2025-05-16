package Array;
import java.util.*;
/**
 * 
 */
public class unionSet_in_sorted
{
    public void main()
    {
        System.out.println("Enter the number of elments in array A and B respectively");
        Scanner sc=new Scanner (System.in);
        int i,j,m=sc.nextInt(),n=sc.nextInt();
        int [] A=new int [m], B=new int [n] ,C=new int [m+n];
        System.out.println("Enter the elements of array A[] in Sorted Manner ");
        for(i=0;i<m;i++)
        { 
            A[i]=sc.nextInt();
        }
        System.out.println("Enter the elements of array B[] in Sorted Manner ");
        for(i=0;i<n;i++)
        { B[i]=sc.nextInt(); }
        int min=Math.min(A[0],B[0]),f1=0,f2=0;
        int max=Math.max(A[m-1],B[n-1]);
        unionSet_in_sorted am = new unionSet_in_sorted();  
        for (i=min,j=0;i<=max;i++)
        {
            if(hasElement(i,A)==1)
            f1=1;
            if(hasElement(i,B)==1)
            f2=1;
            if(f1==1||f2==1)
            {
                C[j]=i;
                j++;
                f1=0; f2=0;
            }
        }
        System.out.println("The Elements Of Array C[] Are:-");
        for (i=0;i<j;i++)
        {
            System.out.println(C[i]);
        }
    }
    public int hasElement(int i,int [] A)
    {
        int j,f=0;
        for(j=0;j<=A.length-1;j++)
        {
            if(A[j]==i)
            f++;
        }
        return f;
    }
}