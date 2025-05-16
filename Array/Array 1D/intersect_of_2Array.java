package Array;
import java.util.*; 
public class intersect_of_2Array
{
    public void main()
    {
        /**
         * Accept data into two integers array A & B of size 5 elements each. The program should create another array T that finds the intersection
         * of the two arrays.
         * For e.g. 
         * if A={1,3,5,7,8} & B={7,4,2,8,9} Then T={7,8}
         */
        int A[] = new int[5];
        int B[] = new int[5];
        int T[] = new int[5];
        int i,j,k;
        //int A[]={1,2,3,5,7},B[]={5,6,7,8,9};
        Scanner sc = new Scanner (System.in);
        for(i=0;i<5;i++)
        {
            System.out.println("Enter the Element of Array A.");
            A[i]=sc.nextInt();
            System.out.println("Enter the Element of Array B.");
            B[i]=sc.nextInt();
        }
        for(j=0,k=0;j<5;j++)
        {
            for(i=0;i<5;i++)
            {
                if(A[j]==B[i])
                {
                    T[j]=A[i];k++;
                    break;
                }
            }   
        }
        System.out.println(" the Elements of Array T.:");
        for(i=0;i<k;i++)
        {
            System.out.println(T[i]);
        }
    }
}