package Numbers;

import java . util.*;
class Spy_Number
{
    public void main()
    {
        Scanner sc=new Scanner(System.in);
        int n,m,a,s=0,p=1;
        System.out.println("enter a no.");
        n=sc.nextInt();
        m=n;
        while(m!=0)
        {
            a=m%10;
            s=s+a;
            p=p*a;
            m=m/10;       
        }
        if(p==s)
        {
            System.out.println(n+" is a spy no.");       
        }
        else
        {
            System.out.println(n+" is not a spy no.");
        }
    }
}