package Numbers;

import java.util.*;

/**
 * Write a description of class Small_Z_Sum here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Small_Z_Sum
{
    int m,n;
    public Small_Z_Sum()
    {
        this.m=0;
        this.n=0;
    }
    
    void Input()
    {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter value of m from 100 to 10000 ");
        m=sc.nextInt();
        System.out.println("Enter value of n betwenn 0 to 100 ");
        n=sc.nextInt();
                
        if (m<100 && m>10000 && n<0 && n>100)
        {
            
        }
    }
    
    public boolean checkMN(int m, int n)
    {
        if(m<100 && m>10000 && n>100)
        {
            System.out.println("Invalid Input");
            return false;
        }
        else
        return true;
    }
    
    public int findInteger()
    {
        int sum = FindSum(n); 
        for(int i=m ; i<=10000;i++)
        {
            if(sum== FindSum(i))
            {
                return i;
            }
        }
        return 0;
    }
    
    int FindSum(int n)
    {
        int r, sum=0;
        while(n!=0)
        {
            r = n % 10;
            sum= sum + r;
            n=n/10;
        }
        return sum;
    }
    
    void Display()
    {
        int result=findInteger(); 
        if(result==0)
        {
            System.out.println("No such Number within the range");
        }
        else
        {
            System.out.println("Smallest Integer = "+result  );
            System.out.println("Number of Digits = "+countDigits);
        }
    }
}
