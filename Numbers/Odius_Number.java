package Numbers;

import java.util.*;
/**
 *  An odius number is positive number having odd number of 1's in its binary
 *  equivalent
  */
public class Odius_Number
{
    long n;
    long bi;
    public Odius_Number(long n)
    {
        this.n=n;
        bi=0l;
    }

    public boolean checkodiuos()
    {
        int c=0;long bi=this.bi;
        for(;bi!=0; bi/=10)
        {
            if(bi%10==1)
            c++;
        }
        if(c%2!=0)
        return true;
        else
        return false;
    }
    
    void ConvertToBinary()
    {
        long n=this.n, c=0, a;
        String x = "";
        while(n>0)
        {
            a = n % 2;
            if(a == 1)
            {
                c++;
            }
            x = a + "" + x;
            n = n / 2;
        }
        bi = Long.parseLong(x);
    }
    
    public boolean checkpositve()
    {
        if(n>0)
        return true;
        else
        return false;
    }
    
    void Display()
    {
        if(checkpositve())
        {
            if(checkodiuos())
                System.out.println("The Number entered Is Odiuos.");
            else
                System.out.println("The Number entered Is Not Odiuos.");
        }
        else
        System.out.println("Plese, Enter a Positive Integer.");
    }
    
    static void main()
    {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter A Positive Integer");
        Long n= sc.nextLong();
        Odius_Number ob = new Odius_Number(n);
        ob.ConvertToBinary();
        ob.Display();
    }
}