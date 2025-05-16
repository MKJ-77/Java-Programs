package Numbers;

import java.util.*;
public class Express_in_2_Primes
{
    public void main ()
    {
        int a,b,n ;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A Number");
        n=sc.nextInt();
        a=1;
        b=n-1;
        for(;a==n && b==0;a++,b--)
        {
            int count1=0;
            int count2=0;
            for(int c=1;c<=n;c++)
            {
                if (a%c==0)
                {
                    count1++;
                }
                if (b%c==0)
                {
                    count2++;
                }
            }
            if (count1==2 && count2==2)
            {
                System.out.println(n+"="+a+"+"+b);
            }
        }
    }
}   
        

