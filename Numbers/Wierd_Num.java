package Numbers;

/**
 * The smallest weird number is 70. Its proper divisors are 1, 2, 5, 7, 10, 14, 
 * and 35; these sum to 74, but no subset of these sums to 70. The number 12, 
 * for example, is abundant but not weird, because the proper divisors of 12 
 * are 1, 2, 3, 4, and 6, which sum to 16; but 2 + 4 + 6 = 12.
 */
public class Wierd_Num  
{
    public void main(int n)
    {
        int sum=0;
        for(int i=1;i<=n/2;i++)
        {
            if(n%i==0)
            {
                sum+=i;
            }
        }
    }
    public boolean Isprime(int n)
    {
        int c=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                c++;
            }
        }
        if(c==2)
        return  true;
        else
        return  false;
    }
}
