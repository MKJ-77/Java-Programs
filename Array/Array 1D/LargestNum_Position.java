package Array;
import  java.util.*;
class LargestNum_Position
{
    /**
     *  Input 10 Numbers in an array and then print Largest Number 
     *  & Its position.                      
       */
    public void main()
    {
        Scanner sc= new Scanner (System.in);
        int num[]   =   new   int [10],l=0,p=0,i;
        System.out.println("Enter 10 Numbers ");
        for(i=0;i<10;i++)
        {
            num[i]=sc.nextInt();
        }
        for(i=0;i<10;i++)
        {
            if(l<num[i])
            {
                l=num[i];
                p=i;
            }
        }
        System.out.println("Index Of Largest Number : "+ p);
        System.out.println("Largest Number : "+l);
    }
}