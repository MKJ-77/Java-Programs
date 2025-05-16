package Numbers;

/**
 *Write a Program in Java to input a number and check whether it is a Unique Number 
 *or not. ( A Unique number is a positive integer (without leading zeros) 
 *with no duplicate digits. 
 *For example 7, 135, 214 , 5243 are all unique numbers whereas 33,3121,200 are not.
  */
public class Unique_Number
{
    
    public void main (int num)
    {
        if (Is_Unique(num) == true)
        System.out.println(num+"  Is A Unique Number !!!!");
        else
        System.out.println("Not A Unique Number");
    }
    
    public boolean Is_Unique(int n)
    {
        if (n%10==0)
            return false;
        else
        {
            for (int i=0;i<=9;i++)
            {
                int c=0;
                int m=n;
                while (m!=0)
                {
                    int rem = m % 10;
                    if (rem==i)
                    c++;
                    m/=10;
                }
                if (c>1)
                return false;
            }
            return true;
        }
    }
}
