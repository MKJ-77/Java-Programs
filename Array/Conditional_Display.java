package Array;
import java .util.*;
public class Conditional_Display
{
    /**
     * Accept numbers into an array of size 10. Then accept a number and search that number 
     * in array. 
     * If the number is present in array, then display the array element number where number 
     * is found.
     * In case of multiple found display all the positions. 
     * Display a proper message if the number is not present in array.
     */
    public void main()
    {
        int A[] = new int[10];  
        int i,j,f=0;
        String k="";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter elements of Array A[]");
        for(i=0;i<10;i++)
        {
            A[i]=sc.nextInt();
        }
        System.out.println("Enter a Number ");
        int n=sc.nextInt();
        for(i=0,j=1;i<10;i++,j++)
        {
            if(A[i]==n)
            {
                System.out.println("Number Found!!! ");
                System.out.println("Position : "+(i+1)+'\n'+"Index : "+i);
                f++;
            }
            if(A[i]%n==0 && A[i]!=11)
            {
                k+=j+" ; ";
            }
        }
        System.out.println("Positions Of Multiples "+k);
        if(f==0)
        System.out.println("the Number Not Found!!!");
    }
}