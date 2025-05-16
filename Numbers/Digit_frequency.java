package Numbers;

import java.util.*;
class Digit_frequency
{
    public void main()
    {
        Scanner sc=new Scanner (System.in);
        long n,m,r,i,j;
        m=0;
        System.out.print("Enter a number : ");
        n = sc.nextLong();
        for(i = 0;i<=9;i++)
        {
            m=0;
            for(j=n;j>0;j=j/10)
            {
                r = j%10;
                if((long)i==r)
                {
                    m++;
                }
            }
            if(m>0)
                System.out.println("Frequency of "+i+" is "+m);
        }
    }
}
 