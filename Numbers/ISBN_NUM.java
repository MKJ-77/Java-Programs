package Numbers;
/**
 * The International Standard Book Number (ISBN) is a unique numeric book identifier
 * which is printed on every book. 
 * The ISBN is based upon a 10-digit code.
 * The ISBN is legal if: 
 * 1 * digit1 + 2 * digit2  + 3 * digit3  + 4 * digit4  + 5 * digit5  + 6 * digit6
 * + 7 * digit7  +8 * digit8 + 9 * digit9 + 10 * digit10
 * is divisible by 11.
 * Example : For an ISBN 1401601499 
 * Sum = 1 * 1 + 2 * 4 + 3 * 0 + 4 * 1 + 5 * 6 + 6 * 0 + 7 * 1
+ 8 * 4 + 9 * 9 + 10 * 9 which is divisible by 11.
Write a program to: 
(i) Input the ISBN code as a 10-digit integer.
(ii) If the ISBN is not a 10-digit integer,
output the message, “Illegal ISBN” and terminate the program 
(iii) If the number is 10-digit, extract the digits of the number 
and compute the sum as explained above.
If the sum is divisible by 11, output the message, “Legal ISBN”.
 * If the sum is not divisible by 11,
 * output the message, “Illegal ISBN”. 
 */
public class ISBN_NUM
{
    public void main(long isbn)
    {
        if (isbn <1000000000L || isbn >9999999999L)
            System.out.print("Illegal ISBN Number !!!!! ");
        else
        {
            long n=isbn, sum=0;
            for(int i=10;i>=1;i--,n/=10)
            {
                long re=n%10;
                sum += re*i;
            }
            if (sum % 11 == 0)
                System.out.print("legal ISBN Number.");
            else
                System.out.print("Illegal ISBN Number !!!!! ");
        }
    }
}