package Numbers;

import java.util.*;
class Prime_Number
{
    public void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr a Number");
        int n=sc.nextInt();
        int c=0;
        for(int k=1;k<=n;k++)
        {
            if(n%k==0)
            {
                c++;
            }
        }
        if(c==2)
        {
            System.out.println(n+" is a Prime Numbe");
        }
        else
        {
            System.out.println(n+" is not a Prime Number");
        }
    }
}