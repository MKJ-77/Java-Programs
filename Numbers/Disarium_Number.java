package Numbers;

/**
 *A Disarium number is a number defined by the following process: Sum of its digits
 *powered with their respective position is equal to the original number. 
 *For example 175 is a Disarium number: As 1^1+7^2+5^3 = 175.
 *Some other DISARIUM are 89, 175, 518 etc
 */
public class Disarium_Number
{
    public void main(int n)
    {
        int m = n,c=0,p=1;
        while (m!=0)//For_checking_Number_of_Digits
        {
            m=m/10;
            c=c+1;
            if(c>1)
            p=p*10;
        }
        if(Isdisarium(n,c,p))
        {
            System.out.println(n+" is a Disarium Number ");
        }
        else
        {
            System.out.println(n+" is not a Disarium Number ");
        }
    }
    public Boolean Isdisarium(int n,int c,int p)
    {
        int n1 = n , rem;
        int i=1;
        double f=0.0;
        for(i=1;i<=c;i++,p=p/10)
        {
            rem = n1 % p;
            n1 =  n1 / p;
            f = f+Math.pow(n1,i);  
            n1=rem;   
        }
        if(f==n)
        return  true;
        else 
        return  false;
    }
}
