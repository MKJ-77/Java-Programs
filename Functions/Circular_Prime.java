package Functions;
import java.util.*;
public class Circular_Prime
{
    int n;
    int c;
    public Circular_Prime(int n)
    {
        // initialise instance variables
        this.n = n;
        this.c=1;
    }

    public int shift_digits(int n)
    {
        int n1=(n/10)+((n%10)*c);
        return n1;
    }

    public void Placevalue()//For_checking_Place_Value_of_Digits
    {
        int m=this.n;
        while (m!=0)
        {
            m=m/10;
            c=c*10;
        }
        c/=10;
    }

    public boolean checkPrime(int n)
    {
        int c=0;
        for (int i=1;i<=n;i++)
        {
            if (n%i==0)
                c++;
        }
        if(c==2)  return true;
        else return false;
    }

    boolean checkCircular()
    {
        int n=this.n;
        do
        {
            if(checkPrime(n)== false)
                return false;
            else
            {
                n=shift_digits(n);
            }
        }
        while (n!=this.n);
        return true;
    }

    void Display ()
    {   
        if(checkCircular())
            System.out.println("Its a circular prime.");
        else
            System.out.println("Its not a circular prime.");
    }

    public static void main()
    {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter a Number");
        Circular_Prime ob= new Circular_Prime(sc.nextInt());
        ob.Placevalue();
        ob.Display();
    }
}