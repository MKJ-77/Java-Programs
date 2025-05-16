package Numbers;

import java.util.*;
class Num_2_merge
{
    public void main()
    {
        int num1,num2,a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two Numbers");
        num1=sc.nextInt();
        num2=sc.nextInt();        
        for(a=num2;a!=0;a/=10)
        {
            num1*=10;
        }
        num1+=num2;
        System.out.println("Merged Number="+num1);
    }
}