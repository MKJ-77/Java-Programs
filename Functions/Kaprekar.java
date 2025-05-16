package Functions;
import java.util.*;
public class Kaprekar
{
    int p,q;
    public Kaprekar()
    {
        this.p=0;
        this.q=0;
    }

    void Input()
    {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter range of p and q ");
        p=sc.nextInt();
        q=sc.nextInt();
    } 

    public void Display()
    {
        int c=0;
        System.out.println("All Kaprekar Number are -:");
        for(int i=p;i<=q;i++)
        {
            if (Iskaprekar(i)== true)
            {
                System.out.println(i);
                c++;
            }
        }
        if(c==0)
            System.out.println("No Kaprekar Number within this range.");
    }

    public int count(int n)
    {
        int m = n,c=0,p=10;
        while (m!=0)//For_checking_Number_of_Digits
        {
            m=m/10;
            c=c+1;
            if(c>1)
                p=p*10;
        }
        return p;
    }

    public int sumsqpart(int n)
    {   
        int sq=n*n;
        int p=count(n);
        int p1=sq/p;
        int p2=sq%p;
        return p1+p2;
    }

    public boolean Iskaprekar(int n)
    {
        if(sumsqpart(n)==n)
            return true;
        else
            return false;
    }

    public static void main()
    {
        Kaprekar ob= new Kaprekar();
        ob.Input();
        ob.Display();
    }
}
