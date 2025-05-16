package Functions;
import java.util.*;
/**
 * Program to check whether a number is Proth number or not
 * Given a positive integer N, the task is to check if it is a Proth number.
 * If the given number is a Proth number then print ‘YES’ 
 * otherwise print ‘NO’.
 * Proth Number: In mathematics, a Proth number is a positive integer
 * of the form n = k * 2^n + 1
 * where k is an odd positive integer and n is a positive integer 
 * such that 2n > k .    
 * The first few Proth numbers are –
 * 3, 5, 9, 13, 17, 25, 33, 41, 49, ……
 */
public class Proth_Number
{
    int N;
    public Proth_Number(int N)
    {
        this.N=N;
    }
    
    public boolean Check_Proth()
    {
        if(N%2 ==0)
            return false;
        N-=1;
        int a,n,k;
        for ( n=1;n<N;n++)
        {          
            a=(int)Math.pow(2,n);
            for( k=1; k<a ;k+=2)
            {
                if(N/k== (a))
                {
                    return true; 
                }
            }
        }
        return false;
    }

    void Display()
    {
        if(Check_Proth())
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    public static void main()
    {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter N");
        int N=sc.nextInt();
        Proth_Number ob= new Proth_Number(N);
        ob.Display();
    }
}
/*public boolean checkPrime(int n)
    {
        int c=0;
        for (int i=1;i<=n;i++)
        {
            if (n%i==0)
                c++;
        }
        if(c==2)  return true;
        else return false;
    }*/
/*
class proth
{
    int N;
    proth()
    {
        this.N=0;
    }
    void input()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter a no");
        int x=sc.nextInt();
        N=x;
    }
    void display()
    {
        for(int i=1;i<=N;i++)
        {
            for(int k=2*i;k>=1;k--)
            {
                if(((2*i*k)+1)==N)
                {
                    System.out.println("yes");
                    System.exit(0);
                }
            }
        }
        System.out.println("no");
    }
    public static void main()
    {
        proth obj=new proth();
        obj.input();
        obj.display();
    }
}*/