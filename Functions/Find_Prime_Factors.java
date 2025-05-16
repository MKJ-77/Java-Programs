package Functions;
import java.util.*;
public class Find_Prime_Factors
{   
    static void main()
    {
        Scanner in = new Scanner(System.in);
        int n,s=0,i;
        System.out.print("Enter a number : ");
        n = in.nextInt();
        int m=n;
        for(i=2;i<=n;)
        {
              if(m%i==0)
              {
                  System.out.println(i);
                  m/=i;
              }
              else
              i++;
        }
    }
}
