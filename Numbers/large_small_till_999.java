package Numbers;

import java.util.*;
class large_small_till_999
{
    public  void main()
    {
        int n,a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A No.");
        n=sc.nextInt();
        a=n;
        b=n;
        while(n!=-999)
        { 
            n=sc.nextInt();
            if (n==-999)
                break;
            a=Math.max(n,a);
            b=Math.min(n,b);
        }
        System.out.println("maximum No.="+a);
        System.out.println("minimum No.="+b);
    }
}