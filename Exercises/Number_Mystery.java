package Exercises;
import java.util.*;
public class Number_Mystery
{
    int x;
    int l;
    static Scanner sc=new Scanner (System.in);
    public Number_Mystery(int Number,int limit )
    {
        x=Number;
        l=limit;
    }

    public int SumOfDigits (int y)
    {
        int sm=0,n=y;
        while(n!=0)
        {
            sm += n%10;
            n/=10;
        }
        return sm;
    }

    public void start()
    {
        for(int i=1;i<=l;i++)
        {
            int p=x*i;
            System.out.print(x+" * "+i+" = "+p);
            do
            {
                p=SumOfDigits(p);
                System.out.print("\t SUM:"+p);
            }
            while(p>=10);
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        System.out.print("Number : ");
        int n=sc.nextInt();
        System.out.print("Limit  : ");
        int l=sc.nextInt();
        Number_Mystery NM = new Number_Mystery(n,l);
        NM.start();
    }
}
