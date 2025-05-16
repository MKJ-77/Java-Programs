package Numbers;

import java.util.Scanner;
/**
 * to find tech number
 * class 10th icse board paper
 */
public class Tech_Number
{
    int num;
    public Tech_Number()
    {
        num=0;
    }
    
    /**pure function is the function in which the parameter 
       remain unchanged*/
   
    public int total_num(int n)
    {
        int a=0;
        while (n!=0)
        {
            n/=10 ;
            a++ ;
        }
        return a/2 ;
    }

    public int first_half(int half, int n)
    {
        int m = n ;
        int a = 1 ;
        int n1 = 0 ;
        for (int k=1 , i=1 ; i<=half ; i++,k*=10)
        {
            a = m % 10;
            n1=n1+a*k;
            m/=10;
        }
        return n1;
    }

    public int second_half(int half, int n)
    {
        int m = n ;
        int a = 1 ;
        int n1 = 0 ;
        for (int k=1 , i=1 ; m!=0 ; i++,m/=10)
        {
            a = m % 10;
            if (i > half && i <= (half*2))
            {
                n1=n1+a*k;
                k*=10;
            }
        }
        return n1;
    }
    
    public void main ()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Number");
        num=sc.nextInt();
        int half = total_num(num);
        int n1 = first_half(half,num);
        int n2 = second_half(half,num);
        int s = n1 + n2;
        if (Math.pow(s,2)==num)
        System.out.println(num+" is a Tech Number");
        else
        System.out.println(num+" is not a Tech Number");
    }
}
