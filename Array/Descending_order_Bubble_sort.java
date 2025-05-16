package Array;
import java.util.*; 
public class Descending_order_Bubble_sort
{
    /**
      * Write a program to input 10 integer elements in an array
      * and sort themin descending order using the
      * bubble sort technique.
      **/
    public void main()
    {
        int n[] = new int[10];
        int i,j;
        Scanner sc = new Scanner (System.in); 
        System.out.println("Enter 10 integer elements");
        for(i=0;i<10;i++)
        {
            n[i]=sc.nextInt();
        }
        for ( i = 0; i < 10-1; i++)
        {
            for ( j = 0; j < 10-i-1; j++)
            {
                if (n[j] < n[j+1])
                {
                    int temp = n[j];
                    n[j] = n[j+1];
                    n[j+1] = temp;
                }
            }
        }
        System.out.println(" After Sorting in Descending ");
        for(i=0;i<10;i++)
        {
            System.out.print(n[i]+"  ");
        }
    }  
}
