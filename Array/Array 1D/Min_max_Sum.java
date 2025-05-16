package Array;
import java.util.*; 
public class Min_max_Sum
{
    /**
     * Write a program to initialize the given data in an array
     * and find the minimum and maximum 15 values 
     * along with the sum of the given elements.
     * Numbers: 2   5   4   1   3   
     * Output:
     * Minimum value : 1
     * Maximum value : 5
     * Sum of the elements : 15
     **/
     public void main ()
     {
        int No[] = new int[5];
        int i,ma=0,mi=0,sum=0;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the 5 Numbers ");
        for(i=0;i<5;i++)
        {
            No[i]=sc.nextInt();
        }  
        for(i=0;i<=4-1;i++)
        {
            ma=Math.max(No[i],No[i++]);
            mi=Math.min(No[i],No[i++]);
            sum += No[i]; 
        }
        System.out.println("Maximum Number = "+ma);
        System.out.println("Minimum Number = "+mi);
        System.out.println("Sum of all Elements Of the Array = "+sum);
     }
}
