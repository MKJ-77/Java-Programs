package Numbers;

import java.util.*;
/**
 * Strong number / Krishnamurty number / Peterson Number
  
 * is a number whose sum of all digits' factorial is equal to the number
 * 'n'. Factorial implies when we find the product of all the numbers below 
 * that number including that number and is denoted by ! (Exclamation sign)
 * , For example: 4! = 4x3x2x1 = 24.
 * the number is 145 then we have to pick 1, 4 and 5 now 
 * we will find factorial of each number i.e, 1! = 1, 4! = 24, 5! = 120.    
 * Now we will sum up 1 + 24 + 120 so we get 145, that 
       is exactly same as the input given, 
       So we can say that the number is strong number.
**/
public class Strong_Number
{
    public void main()
    {
        Scanner sc = new Scanner (System.in) ;
        System.out.println("Enter a Number");
        int sum = 0 , num = sc.nextInt() ,n = num ;
        while (n!=0)
        {
            int r = n % 10, fact = 1;
            for (int i = 1 ; i <= r ; i++)
            {
                fact = fact * i;  
            }
            sum += fact;           
            n = n / 10;
        }
        if (sum == num)
        System.out.println(num+" Is a Strong Number/Krishnamurty number/Peterson Number!!!");
        else
        System.out.println(" Not a Strong Number/Krishnamurty number/Peterson Number!!!");
    }
}
