package Overloading_Programs;

public class overloading_number
{
    public void number( int n)
    {
        int s=1;
        for(int i=1;i<=n;i++)
        {
            s=s*i;
        }
        System.out.println("factorial of "+n+"="+s);
    }
         
    public void number( int n,int y)
    {
        int gcd=1,lcm=1;
        for(int i=1;i<=n && i<=y;i++)
        {  
            if(y%i==0 && n%i==0)
            {
                gcd=i;
            }
        }
        lcm=(n*y)/gcd;
        System.out.println("L.C.M.="+lcm);
    }
    public void number( int x,int y,int z)
    {
        int a=Math.max(x,y);
        int max=Math.max(a,z);
        int c=Math.min(x,y);
        int min=Math.min(a,z);
        System.out.println("minimum number="+min);
        System.out.println("maximum number="+max);
    }
}
