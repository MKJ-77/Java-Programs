package Array;
import java . util. *;
/**
 * Write a program to store 20 different names along telephone numbers
 * input a name by user and then search the name using linear search if found display the 
 * name and the phone number. If not found display a proper message */
public class findName_PhoneNo
{
    public void main()
    {
        int i,co=0;
        long no[] = new long [20];;
        String nm[]= new String [20],n;
        Scanner sc=new Scanner(System.in);
        Scanner ob=new Scanner(System.in); 
        for(i=0;i<=19;i++)
        {
            System.out.println("Enter Name : ");
            nm[i]=sc.next();
            System.out.println("Enter Phone Number : ");
            no[i]=ob.nextLong();
        }
        System.out.println("Enter Name For Search : ");
        n=sc.next();
        for(i=0;i<=19;i++)
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
