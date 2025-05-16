package Array;
import java.util.*;
/**
 * Write a program to accept an array of user defined length then sort it in such a way that 
 * the smallest element comes in the middle and second smallest in its left and 
 * third smallest in its right .
 * for Eg- 
 * Array is {11,33,22,99,105}
 * After sorting ={99,22,11,33,105}
 * Array is { 98,46,75,88,11,66}
 * After sorting is {98,75,46,11,66,88}
 * display the Array After Sorting
 * Note Use {2 or 1} array to Solve the Program.
 */
public class ConditionalSorting_using_2Array 
{
    public void main()
    {
        System.out.println("Enter the number of elments in array A ");
        Scanner sc=new Scanner (System.in);
        int mid,left,right,i,j,m=sc.nextInt();
        int [] A=new int [m],B=new int [m];
        ConditionalSorting_using_2Array ar=new ConditionalSorting_using_2Array();
        System.out.println("Enter the elements of array A[]");
        for(i=0;i<m;i++)
        { 
            A[i]=sc.nextInt();
        }
        Arrays.sort(A);
        if(m%2==0)// If length is even then
            mid=m/2;//mid = 3 if m = 6
        else
            mid=((m-1)/2);//mid = 2 if m= 5
        B[mid]=A[0];
        left=mid-1; right=mid+1;
        for(i=1;i<m;i++)
        {
            if(i%2==0)// if even then goes to right side
            {
                B[right]=A[i];
                right++;
            }
            else// else odd goes to left side
            {
                B[left]=A[i];
                left--;
            }
        }
        System.out.println("After conditional sorting");
        System.out.println(Arrays.toString(B));
    }
}
