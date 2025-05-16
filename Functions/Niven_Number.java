package Functions;
import java.util.*;
/**
 *To check whether the number input is Niven number or not
 *niven no. is a number which is divisible by the sum of its digits.
 *Example
 *126
 *sum of digits =1+2+6=9
 *126 is divisible by 9
 *Therefore it is a Niven Number
 */
public class Niven_Number
{
    int No;

    public Niven_Number(int n)
    {
        this.No=n;
    }
    
    int FindSum()
    {
        int n=No ,r, sum=0;
        while(n!=0)
        {
            r = n % 10;
            sum= sum + r;
            n=n/10;
        }
        return sum;
    }
    
    boolean checkNiven()
    {
        int sum= FindSum();
        if (No % sum == 0)
        return true;
        else
        return false;
    }
    
    void Display()
    {
        if(checkNiven())
            System.out.println(No+" is a Niven Number");
        else
            System.out.println(No+" is not a Niven Number");
    }

    static void main()
    {
        Scanner sc = new Scanner (System.in);        
        System.out.println("Enter any Number.");
        int n= sc.nextInt();
        Niven_Number ob = new Niven_Number(n);
        ob.Display();
    }
}