package Functions;
import java.util.*;
class  func_Sum_of_Prime
{
    public void main(int n)
    {  
        int a=0;
        for(int k=1;k<=n;k++)
        {
            if ( check_prime(k)==true)
            {
                a=k+a;
            }
        }
        System.out.println(a);
    }

    public boolean check_prime(int n)
    {
        int c=0;
        for(int  k=1;k<=n;k++)
        {
            if(n%k==0)
            {
                c++;
            }
        }
        if(c==2)
        {
            return true;
        }
        else
        {
            return false;
        }

    }
}