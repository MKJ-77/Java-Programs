package Functions;
import java.util.*;
/**
 * A class Unique displays unique digit integers. A unique-digit integer 
 * is a positive integer with no duplicate digits.
 * For eg. 7, 234, 547 are unique-digits integers but 11, 212, 1100 are not.
 * Design a class Unique with following details:
 * Data members : 
 * m   :   integer to store the start limit
 * n   :   integer to store the end limit
 * count   :   integer to count unique digit integers
 * Member functions:
 * Unique()            :   default constructor
 * Unique(int mm, in nn)   :   constructor to assign m = mm, n = nn.
 * void generateNos()      :   to generate and print all unique digit                  integers between m and n (both inclusive)               if m < n and store the occurrence of unique                 digit integers in the data member count                     and display it, if m > n the display “Out of                range”.
 * Specify the class Unique, giving details of the constructors and the 
 * functions. Define a main() function to create an object and call the
 * methods accordingly.
 */
public class Unique
{
    int m,n,count;
    public Unique()
    {
        m=0;
        n=0;
        count=0;
    }

    public Unique(int mm, int nn)
    {
        m=mm;
        n=nn;
    }

    void generateNos()
    {
        System.out.println("The unique Numbers are : ");
        for (int j=m ; j<=n ; j++)
        {
            int k=j;
            if (k%10==0)
                continue;
            else
            {
                for (int i=0;i<=9;i++)
                {
                    int c=0;
                    k=j;
                    while (k!=0)
                    {
                        int rem = k % 10;
                        if (rem==i)
                            c++;
                        k/=10;
                    }
                    if (c>1)
                    {
                        k=1;
                        break;
                    }
                }
                if(k==0)
                {
                    System.out.println(j);
                    count++;
                }
            }
        }
    }
    public static void main()
    {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter m and n");
        int mm=sc.nextInt();
        int nn=sc.nextInt();
        Unique ob= new Unique(mm , nn);
        ob.generateNos();
    }
}