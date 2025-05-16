package Array;
import  java.util.*;
public class Find_Telephone
{
    /**
     * Write a program to initialize an array of 5 names and initialize 
     * another array with their respective telephone numbers. 
     * Search for a name input by the User, in the list. 
     * If found, display “Search Successful” and print the name along with 
     * the telephone number, 
     * otherwise display “Search Unsuccessful.Name not enlisted”.
     **/
    public void main()
    {
        int i,co=0;
        long no[] = new long [5];;
        String nm[]= new String [5],n;
        Scanner sc=new Scanner(System.in);
        Scanner ob=new Scanner(System.in); 
        for(i=0;i<=4;i++)
        {
            System.out.println("Enter Name : ");
            nm[i]=sc.next();
            System.out.println("Enter Phone Number : ");
            no[i]=ob.nextLong();
        }
        System.out.println("Enter Name For Search : ");
        n=sc.next();
        for(i=0;i<=4;i++)
        {
            if(nm[i].equalsIgnoreCase(n))
            {
                co=1;
                break;
            }
        }
        if(co==1)
            System.out.println("Search Successfull "+'\n'+nm[i]+'\t'+no[i]);                
        else            
            System.out.println("Search Unsuccessful. Name not Enlisted ");
    }
}