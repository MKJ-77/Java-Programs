package Numbers;

import java.util.*;
class larest_smest_20Num
{
    public void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 20 Numbers");
        int n,a,b;
        n=sc.nextInt();
        a=n;
        b=n;
        for (int i=1;i<20;i++)
        {
            n=sc.nextInt();
            a=Math.max(a,n);
            b=Math.min(b,n);
        }
        System.out.println("Maximum Number="+a);
        System.out.println("Minimum Number="+b);
    }
}