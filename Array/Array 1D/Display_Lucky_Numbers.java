package Array;
import java.util.*;
/**
 * Create an array of 10 locations and find out lucky numbers present in it.
 */
class Display_Lucky_Numbers
{
    public void main()
    {
        //int A[] = new int[10];  
        int i,k,n=10,m;
        String num="";
        int A[]={1,2,3,4,5,6,7,8,9,10};
        Scanner sc=new Scanner(System.in);
        System.out.println("  Enter elements of Array A[]");
        /*for(i=0 ; i<n ; i++)
        {
            A[i]=sc.nextInt();
        }*/
        for(k=2 ; k<=n ;k++)
        {
            for( i=0,m=1;i<n;i++,m++ )
            {
                if(m!=k || m%k >= 0)
                num+=A[i];
            }
            System.out.println(num);
            n=(int) n/2;
        }
        System.out.println("Lucky Numbers : "+num);
    }
}