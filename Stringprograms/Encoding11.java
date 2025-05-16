package Stringprograms;

/**
 * Write a description of class Encoding11 here.
 *2312179862310199501872356231018117927
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class Encoding11
{
    double n;
    String mc;
    public Encoding11()
    {
        n=0l;
        mc="";
    }

    void input()
    {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter code");
        n= sc.nextDouble();
    }
        
    public boolean checkAscii(double y)
    {
        if(y==32)
            return true;
        else if(y>=65 && y<=90)
        {
            return true;
        }
        else if(y>=97 && y<=122)
        {
            return true;
        }
        else 
            return false;
    }

    public void reverse()
    {
        StringBuffer sb= new StringBuffer(n+"");
        sb.reverse();
        n = Double.parseDouble(sb+"");
    }
    
    public void extract()
    {
        for(int  i=100;n!=0;)
        {
            double a=n%i;
            if(checkAscii(a))
            { 
                mc =mc+"" +((char)a);
                n/=i;
                i=100;
            }
            else
            {
                i=1000;
            }
        }
    }

    public void Display()
    {
        System.out.println("Decoded!!!"+'\n'+mc);
    }
    
    static void main()
    {
        Encoding11 ob = new Encoding11();
        ob.input();
        ob.reverse();
        ob.extract();
        ob.Display();
    }
    
}
