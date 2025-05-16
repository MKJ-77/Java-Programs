package Numbers;

import java.util.*;
class Harshad_Number
{
    public void main()
    {
        Scanner sc=new Scanner(System.in);
        int n,m,a,s=0;
        System.out.println("Enter a No.");
        n=sc.nextInt();
        m=n;
        while(m!=0)
        {
            a=m%10;
            s=s+a;
            m=m/10;       
        }
        if(n%s==0)
        {
            System.out.println(n+" is a Harshad Number");
        }
        else
        {
            System.out.println(n+" is not a Harshad Number");
        }
    }
}