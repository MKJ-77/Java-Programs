package Array;
import  java.util.*;
public class Names_in_descending_order
{
    /**
      * Write a program to input twenty names in an array.
      * Arrange these names in descending order of alphabets, 
      * using the bubble sort technique.
      **/
    public void main()
    {
        //String n[] = new String[20];
        int i,j;
        String n[] ={"Mradul","Ali","indrawai","aibhav","Vaibhav","Arnav"
                    ,"Jadu","Suuk","ADk" ,"ji","alone","Eshaan","Isha"
                    ,"Mayank","Pran","bhav","keshav","shaurya","pradeep"
                    ,"ayush"};
        Scanner sc = new Scanner (System.in); 
        /*System.out.println("Enter 20 Names ");
        for(i=0;i<20;i++)
        {
            n[i]=sc.nextLine();
        }*/
        for ( i = 0; i < 20-1; i++)
        {
            for ( j = 0; j < 20-i-1; j++)
            {
                if (n[j+1].compareToIgnoreCase(n[j])>=1)
                {
                    String t = n[j];
                    n[j] = n[j+1];
                    n[j+1] = t;
                }
            }
        }
        System.out.println(" After Sorting in Descending ");
        for(i=0;i<20;i++)
        { System.out.print(n[i]+"  ");
        } 
    }
}  