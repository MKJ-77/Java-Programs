package Numbers;

/**
 * In number theory, a Kaprekar number for a given base is a non-negative integer, 
 * the representation of whose square in that base can be split into two parts 
 * that add up to the original number again. For instance, 45 is a Kaprekar number, 
 * because 45^2 = 2025 and 20 + 25 = 45.
 */
public class Kaprekar_Number
{
    public void main(int n)
    {
        if (Iskaprekar(n)== true)
        
            System.out.println(n+" is a Kaprekar Number");
        else
        
            System.out.println(n+" is not a Kaprekar Number");
    }
    public boolean Iskaprekar(int n)
    {
        int m = n,c=0,p=10;
        while (m!=0)//For_checking_Number_of_Digits
        {
            m=m/10;
            c=c+1;
            if(c>1)
            p=p*10;
        }
        int sq=n*n;
        int p1=sq/p;
        int p2=sq%p;
        if(p1+p2==n)
        return true;
        else
        return false;
    }
}
