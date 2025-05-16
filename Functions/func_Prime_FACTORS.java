package Functions;

import java.util.*;
public class func_Prime_FACTORS
{
    
    boolean check_Prime(int a)
    {
        int i,c=0;
        for(i=1;i<=a;i++)
        {
            if(a%i==0)
            c++;
        }
        if(c==2)
        return true;
        else
        return false;
    
    }
    void main()
    {
        Scanner in = new Scanner(System.in);
        int n,s=0,i;
        System.out.print("Enter a number : ");
        n = in.nextInt();
        for(i=2;i<=n;i++)
        {
              if(check_Prime(i))
                s=s+i;
            
        }
        System.out.println("Sum of Prime numbers : "+s);
    
    }
}