package Pyramid_Programs;
/*  1
   222
  33333
 4444444
555555555 */ 
import java.util.*;
class PYRAMID_PATTERN1
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter Number Of Rows");
        int n=sc.nextInt();
        int i,j,k,l=n*2,coloumn=0 ;
        for(i=1;i<=n;i++,coloumn++)
        {
            for(k=1;k<=l-1;k++)
            {
                if(k>=n-coloumn && k<=n+coloumn || k==n)
                {
                    System.out.print(i);
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

