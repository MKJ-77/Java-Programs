package Numbers;

/**
 *Keith numbers are rare numbers with a Fibonacci like property. 
 *This series starts with the n digits of the number N. ... Then the subsequent 
  numbers in the series are found by calculating the sum of preceding n numbers. 
  If the number N appears in the series, it is called a Keith number.

 *  For example consider the 3 digit number 742. Using the above rule,
 *  the first three numbers are 7, 4, 2. 
 *  The next one is 7+4+2 (adding 3 previous numbers) = 13. 
 *  The next one in series is 4+2+13 = 19.
 *  By applying this rule, following are numbers in the sequence,
 *  7, 4, 2, 13, 19, 34, 66, 119, 219, 404, 742, 1365. 
 *  The original number appears as the 11th item in the series. 
 *  Hence the number 742 is a 3 digit Keith number.
 */
public class Keith_Number
{
    public void main(int num)
    {
        int s,m = num,c=0,p=10;
        while (m!=0)//For_checking_Number_of_Digits
        {
            System.out.print(m%10+" , ");
            m=m/10;
            c=c+1;
        }
        
    }
}
