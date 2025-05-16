package Functions;
import java.util.*;
/**
 *  number whose reverse and itself is Prime 
 */
public class Emirp
{
    int n,rev;
    public Emirp(int nn)
    {
        n=nn;
        rev=0;
    }

    public int IsPrime(int n)
    {
        int c=0;
        for(int i=2;i<=n;i++)
        {
            if(n%i==0)
            c++;
        }
        if(c==1)
        return 1;
        else
        return 0;
    }
    
    public void Emirp()
    {
        int n=this.n;
        while(n!=0)
        {
            rev= rev*10+n%10;
            n/=10;
        }
        
        System.out.println(rev);
        if(IsPrime(this.n)==1 && IsPrime(rev)==1)
        System.out.println("It is An Empirp Number");
        else
        System.out.println("It is not An Empirp Number");
    }
    
    static void main()
    {
        Scanner sc = new Scanner (System.in);        
        System.out.println("Enter any Number.");
        int n= sc.nextInt();
        Emirp ob = new Emirp(n);
        ob.Emirp();
    }   
}