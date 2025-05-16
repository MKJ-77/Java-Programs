package Array;
import  java.util.*;
class Words_Starting_A
{
    /**
     *  Input 10 Words in an array and then print Words Starting with
     *  letter 'A'.                      
     */
    public void main()
    {
        Scanner sc= new Scanner (System.in);
        String wrd[]   =   new   String [10];
        int l=0,p=0,i;
        System.out.println("Enter 10 Words :-");
        for(i=0;i<10;i++)
        {
            wrd[i]=sc.next();
        }
        System.out.println("Words Starting With A:-");
        for(i=0;i<10;i++)
        {
            if(wrd[i].charAt(0)=='a'||wrd[i].charAt(0)=='A')
                System.out.print(wrd[i]+'\t'+'\t');
        }
    }
}
 