package Functions;
import java.util.*;
public class Small_Z_Sum
{
    int m,n;
    public Small_Z_Sum()
    {
        this.m=0;
        this.n=0;
    }

    void Input()
    {
        Scanner sc= new Scanner (System.in);
        do
        {
            System.out.println("Enter value of m from 100 to 10000 ");
            m=sc.nextInt();
            System.out.println("Enter value of n between 0 to 100 ");
            n=sc.nextInt();
        }
        while(checkMN()!=true);
    }
    
    public boolean checkMN()
    {
        if(m>=100 && m<=10000 && n<100 && n>0)
        {
            return true;
        }
        else
        {
            System.out.println("Invalid Input");
            return false;
        }
    }

    public int findInteger()
    {
        int sum = FindSum(n); 
        for(int i=m ; i<=10000;i++)
        {
            if(sum== FindSum(i))
            {
                return i;
            }
        }
        return 0;
    }

    int FindSum(int n)
    {
        int r, sum=0;
        while(n!=0)
        {
            r = n % 10;
            sum= sum + r;
            n=n/10;
        }
        return sum;
    }

    int countDigits(int r)
    {
        int m = r,c=0;
        while (m!=0)//For_checking_Number_of_Digits
        {
            m=m/10;
            c=c+1;
        }
        return c;
    }

    void Display()
    {
        int result=findInteger(); 
        if(result==0)
        {
            System.out.println("No such Number within the range");
        }
        else
        {
            System.out.println("Smallest Integer = "+result  );
            System.out.println("Number of Digits = "+countDigits(result));
        }
    }

    public static void main()
    {
        Small_Z_Sum ob= new Small_Z_Sum();
        ob.Input();
        ob.Display();
    }
}
