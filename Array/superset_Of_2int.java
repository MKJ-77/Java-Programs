package Array;
import java.util.*; 
public class superset_Of_2int
{
    /**
     * Create two arrays A and Bof size 5 and C of size 10. Accept numbers in two arrays A and B. Fill the array C in such a way that the first five 
     * positions occupy the numbers present in array A and rest of five positions occupy the numbers present in array B.
     */
    public void main()
    {
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
            c[i]=a[i];
            c[i+5]=b[i];
        }
        System.out.println(" the Elements of Array C.:");
        for(i=0;i<=9;i++)
        {
            System.out.println(c[i]);
        }
    }   
}