package Functions;
import java.util.*;
/**
 * Write a description of class Perfect here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Perfect
{
    int n;
    public Perfect(int n )
    {
        this. n = n;
    }

    public int Sumfactor(int i)
    {
        if(i==n)
            return 0;
        else
        {
            if (n%i==0)
                return i+Sumfactor(i+1);
            else 
                return Sumfactor(i+1);
        }
    }

    void check()
    {
        int n=this.n;
        if (Sumfactor(2) == n)
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    static void main()
    {
        System.out.println("Enter a Number");
        Scanner sc= new Scanner (System.in);
        int n= sc.nextInt();
        Perfect ob= new Perfect(n);
        ob.check();
    }
}
