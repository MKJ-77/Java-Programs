package Numbers;

import java.util.*;
class Factorial_Number
{
    public void main()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a number for its factorial");
        int n=sc.nextInt();
        int i, fact=1;
            System.out.print("factorial of "+n+"="+"\n");
        for (i=1;i<=n;i++)
        {
            fact=fact*i;
            if(i<n)
            {
                System.out.print(i+"*");
            }
            else
            {
                System.out.print(i+"=");
            }

        }
        System.out.print(fact);
    }
}