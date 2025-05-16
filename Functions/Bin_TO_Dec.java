package Functions;
import java.util.*;
public class Bin_TO_Dec
{
    long bin ,dec;
    public Bin_TO_Dec()
    {
        this.bin=0l; this.dec=0l; 
    }
    void readbin()
    {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter A Binary Number");
        bin=sc.nextLong();
    }
    public long convert(long  x)
    {
        if(bin==0)
            return 0l;
        else
        {
            long a=bin%10;
            bin/=10;
            return ((a)* (long)Math.pow(2,x)) + convert(++x);  
        }
    }
    public void show()
    {
        System.out.println("Decimal Equivalent :"+convert(0)); 
    }    
    public static void main()
    {
        Bin_TO_Dec ob = new Bin_TO_Dec ();
        ob.readbin();
        ob.show();
    }
}