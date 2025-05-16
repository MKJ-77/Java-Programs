package Numbers;

import java.util.*;
class natural_log2_series
{
    public void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        double a=0,b=0;
        for(int i=1,odd=1;i<=n;i++,odd+=2)
        {
            a=a+(1/odd);
        }
        for(int k=1,even=2;k<=n;k++,even+=2)
        {
            b=b+(1/even);
        }
        double series=a-b;
        System.out.println("SUM of series="+series);
    }
}