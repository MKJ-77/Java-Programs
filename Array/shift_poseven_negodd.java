package Array;
import java . util . *;
public class shift_poseven_negodd
{
    /**
     * Write a program in Java to open 3 arrays of name A, P & N. Store 15 numbers in array A.
     * Shift all the positive even numbers in array P and all the negative odd numbers in 
     * array N. 
     * Finally print the array P & N.
     **/
    public void main ()
    {
        int A[] = new int[15];
        int N[] = new int[15];/** Even Positive */
        int P[] = new int[15];/** Odd  Negative */
        //int A[]={1,2,3,4,-1,-2,-3,0,5,-5,-99,-100,77,99,88};
        int i,j,k;
        Scanner sc=new Scanner(System.in);
        for(i=0;i<15;i++)
        {
            A[i]=sc.nextInt();
        }
        for(i=0,k=0,j=0;i<15;i++)
        {
            if(A[i]>=0 /** +ve */ && A[i]%2==0/** even */)
            {
                N[k]=A[i];
                k++;
            }
            else if(A[i]<=0 /** -ve */ && A[i]%2!=0/** odd */)
            {
                P[j]=A[i];
                j++;
            }
        }
        System.out.println("Element of array N[] are:");
        for(i=0;i<k;i++)
        {
            System.out.println(N[i]);
        }
        System.out.println("Element of array P[] are:");
        for(i=0;i<j;i++)
        {
            System.out.println(P[i]);
        }
    }
}
