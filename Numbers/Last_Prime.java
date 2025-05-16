package Numbers;

import java.util.*;
class Last_Prime
{
    public void main()
    {
        int i,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        n=sc.nextInt();
        for(i=n-1;i!=0;i--)
        {
            int m=i,c=0;
            for(int k=1;k<=m;k++)
            {
                if(m%k==0)
                {
                    c++;
                }
            }
            if(c==2)
            {
                System.out.println("Last Prime="+m);
                break;
            }
        }
    }
}