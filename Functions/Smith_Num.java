package Functions;
import java.util.*;
/**
 * A natural number N is said to be SMITH NUMBER if sum of all the digits 
 * of N and sum of all the digits of prime factors of N are same.Example :
 * N = 666
 * Sum of all its digits = 18
 * Prime factors of 666 = 2, 3, 3, 37
 * Sum of the digits of prime factors = 2 + 3 + 3 + (3 + 7) = 18
 * So 666 is a SMITH NUMBER.
Specify a class SmithNum with the following details.
Data members : 
 * int N	:	to store a positive integer
 * Member functions: 
 * void input()	:To accept the number and store in N
 * int sumdigits(n)  :to return the sum of the digits of the integer 			argument. int primeFact()     :	to return the sum of the prime factors of N
 * void check()	:to check if N is a Smith number or not and display 			suitable message.
 * Specify the class SmithNum giving details of the functions. 
 * Also define a main() method to create an object and call the methods
 * to enable the task.
 */
public class Smith_Num
{
    int n;
    
    public Smith_Num(int nn)
    {
        n = nn;
    }
    int sumdigits(int n)
    {
        int m=n;
        int sum=0;
        while (m!=0)
        {
            sum+= m%10;
            m/=10;
        }
        return sum;
    }

    int primeFact()
    {
        int sum=0, m=n;
        for(int i=2;i<n;)
        {
              if(m%i==0)
            {
                sum=sum+sumdigits(i);
                m=m/i;
            }
            else
            i++;
        }
        return sum;
    }

    void check()
    {
        int s=sumdigits(n) , p=primeFact();
        if(p == s)
            System.out.println("The Number Entered is a Smith Number");
        else
            System.out.println("The Number entered is not a Smith Number");
    }

    public static  void main()
    {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter value of n");
        int n=sc.nextInt();
        Smith_Num ob= new Smith_Num (n);
        ob.check();
    }
}