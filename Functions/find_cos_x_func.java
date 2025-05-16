package Functions;

import java.util.*;
public class find_cos_x_func
{
    public double find_cos_x(int x, int n)
    {
        double a=0,b=0;
        for(int i=2 ;i<=n;i=i+4)
        
        {
            a=a-((Math.pow(x,i))/i);
        }
        for(int j=4;j<=n;j+=4)
        {
            b=b+((Math.pow(x,j))/j);
        }
        double cosx=1+a+b;
        return cosx;
    }
    
    public void main ()
    {
        Scanner sc=new Scanner(System.in);
        int x,n ;
        System.out.println("Enter n");
        n=sc.nextInt();
        System.out.println("Enter the value of x");
        x=sc.nextInt();
        double cosx =find_cos_x (x ,n);
        System.out.println("cos ("+x+")="+cosx );
    }
}

