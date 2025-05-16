package Numbers;

import java.util.*;
class Sum_of_first_last_Digits
{
    public void main()
    {
        int sum,f=0,n ;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A Number");
        n=sc.nextInt();
        int l=n%10;
        int n1=n;
        while (n1!=0)
        {
            f=n1%10;
            n1=n1/10;
        }
        sum=l+f;
        System.out.println("First Digit of"+n+"="+f);
        System.out.println("Last Digit of"+n+"="+l);
        System.out.println("Sum of First & Last Digit of"+n+"="+sum);
    }
}