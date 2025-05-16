package Array;
import  java.util.*;
/**
 * A student can apply for science stream only when he or she fets average marks of 80 % or
 * more in physics, chemistry and biology. Wap to store the names and marks obtained 
 * in physics, chemistry and biology in 4 different 1D arrays for 40 students. 
 * Calculate the average and display the names of eligible students.
 */
public class avg
{
    public void main()
    {
        String f="",nm[]= new String[40];
        int i,B[] = new int[40],C[] = new int[40],P[] = new int[40]; 
        double avg;
        Scanner sc= new Scanner (System.in);
        Scanner ob= new Scanner (System.in);
        for( i=0 ;i<40 ;i++ )
        {
            System.out.println("Enter name Of the Student.");
            nm[i]=ob.nextLine();
            System.out.println("Enter Marks In Biology");
            B[i]=sc.nextInt();
            System.out.println("Enter Marks In Physics");
            P[i]=sc.nextInt();
            System.out.println("Enter Marks In Chemistry");
            C[i]=sc.nextInt();
            avg = (B[i]+C[i]+P[i])/3;
            if (avg>=80)
            {
                f+=nm[i]+'\n';
            }
        }
        System.out.println("Students Eligible for Science Stream are as Follows.");
        System.out.println(f);
    }
}
