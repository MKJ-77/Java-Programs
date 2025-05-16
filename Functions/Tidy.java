package Functions;
import java.util.*;
public class Tidy
{
    public boolean func_Tidy(int n)
    {
        int a,b,ascend=0;
        for(int i=0;i<=9;i++)
        {
            a=n%10;
            int n1=n;
            while (n1!=0) 
            {
                b=n1%10;
                if(b==i)
                {
                    ascend=ascend*10+i;
                }
                n1=n1/10;
            }
            
        }
        if (ascend==n)
        return true;
        else
        return false;
    }
    public  void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A Number");
        int n=sc.nextInt();
        if (func_Tidy(n)==true)
        {
            System.out.println(n+" is Tidy Number");
        }
        else
        {
            System.out.println(n+" is not Tidy Number");
        }
    }
}
