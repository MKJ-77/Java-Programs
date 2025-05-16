package Overloading_Programs;

   
import java.util.*;
public class overloading_sum
{
    public int sum(int A,int B)
    {
        int i=A;
        if (i%2!=0)
        i++;
        int s=0;
        for (;i<=B;i+=2)
        {
            s=i+s;
        }
        System.out.println("Sum="+s);
        return s;
    }
    public double sum(double N)
    {   
       double s=1;
       for(double i=1.0;i<=N;i=0.2)
       {
           s=s*i;
       }
       return s;
    }
    public int sum (int N)
    {
        int m=N,a,s=0;
        while(m!=0)
        {
            a=m%10;
            if (a%2==0)
            s=s+a;
            m/=10;
        }
        return s;
    }
    void main()
    {
        
         Scanner sc=new Scanner(System.in);
    
    }
}
