package Numbers;

/**
 * Write a description of class rint here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sum_Prime
{
    int n;
    public Sum_Prime()
    {
        n=0;
    }
    public boolean IsPrime(int n)
    {
        for (int i=2;i<n;i++)
        {
            if(n%i==0)
            return false;
        }
        return true;
    }
    public int Prime_Pair()
    {
        for (int i=2; i<=n ; i++ )
        if (IsPrime)
    }
    
}
