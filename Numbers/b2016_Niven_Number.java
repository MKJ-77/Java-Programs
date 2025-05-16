package Numbers;

/**
 *To check whether the number input is Niven number or not
 *niven no. is a number which is divisible by the sum of its digits.
 *Example
                126
        sum of digits =1+2+6=9
        126 is divisible by 9
        Therefore it is a Niven Number
 */
public class b2016_Niven_Number
{
    void main(int No)
    {
        int n=No ,r, sum=0;
        while(n!=0)
        {
            r = n % 10;
            sum= sum + r;
            n=n/10;
        }
        if (No % sum == 0)
        System.out.println(No+" is a Niven Number");
        else
        System.out.println(No+" is not a Niven Number");
    }
}
