package Numbers;

import java.util.*;
class ascending_digits
{
    public static void main(String[] args) {
        int n,a=0,ascend ;
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a no.");
        n=sc.nextInt();
        a=0;
        while(a<=9)
        {
            int n1=n ;
            while (n1!=0) 
            {
                ascend=n1%10;
                if(ascend==a)
                {
                    System.out.print(a);
                }
                n1=n1/10;
            }
            a++;
        }
    }
}

        
        
        