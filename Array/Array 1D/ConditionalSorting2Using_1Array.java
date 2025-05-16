package Array;
import java.util.*;
/**
 * Write a program to accept an array of user defined length then sort it in such a way that 
 * the smallest element comes in the middle and second smallest in its left and third smallest
 * in its right .
 * for Eg- 
 * Array is {11,33,22,99,105}
 * After sorting ={99,22,11,33,105}
 * Array is { 98,46,75,88,11,66}
 * After sorting is {98,75,46,11,66,88}
 * display the Array After Sorting
 * Note use only "1" array in the program.
 */
public class ConditionalSorting2Using_1Array
{
    public void main()
    {
        System.out.println("Enter the number of elments in array A ");
        Scanner sc=new Scanner (System.in);
        int mid,t,i,j,k,/*m=5;*/m=sc.nextInt();
        /*int[] A={1,2,3,4,5};*/int [] A=new int [m];
        System.out.println("Enter the Elements of Array A");
        for (i=0;i<m;i++)
        {
            A[i]=sc.nextInt();
        }
        Arrays.sort(A);
        System.out.println("After Sorting");
        System.out.println(Arrays.toString(A));       
        t=A[0];
        A[0]=A[1];
        A[1]=t;
        for(i=3;i<m;i+=2)
        {
            t=A[i];
            for(j=i-1,k=i;j>=0;j--,k--)
            {
                A[k]=A[j];
            }
            A[0]=t;
        }
        System.out.println("After conditional sorting");
        System.out.println(Arrays.toString(A));
    }
}