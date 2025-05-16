package Array;
import java.util.*; 
public class Cities_10_Search
{
    /**
     *Write a program to accept the names of 10 cities in a single dimension
     *string array and their STD(Subscribers Trunk Dialing) codes in another single
     *dimension integer array.Search for a name of a city input by the user
     *in the list.If found, display
     *“Search Successful” and print the name of the city along with its STD code,
     *or else display the message “Search Unsuccessful, No such city in the list”.
     **/
    public void main ()
    {
        String Ci[] ={"Kanpur","Varanasi","Patna","Nagpur","Dehradun"
            ,"Jaipur","Chennai","New Delhi","Mumbai","Kolkata"};
        int No[] = {522,542,612,712,135,141,44,11,22,33};
        int i,f=1;
        Scanner sc = new Scanner (System.in);
        /*Scanner ob = new Scanner (System.in); 
        for(i=0;i<10;i++)
        {
            System.out.println("Enter the City's Names ");
            Ci[i]=sc.next();
            System.out.println("Enter the STD Number of the City");
            No[i]=ob.nextInt();
        }*/
        System.out.println("Enter the Name Of the City to be Searched");
        String nm =sc.next();
        for(i=0;i<=9;i++)
        {
            if(nm.equalsIgnoreCase(Ci[i]))
            {
                System.out.println("Search Successful");
                System.out.print(Ci[i]+" "+No[i]);
                f=0;
                break;
            }
        }
        if(f==1)
        System.out.println("Search Unsuccessful, No such city in the list");
    }  
}
